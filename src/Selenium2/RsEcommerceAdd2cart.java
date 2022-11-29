package Selenium2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RsEcommerceAdd2cart {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			 int j=0;
			 String[] veggies = {"Cucumber","Beetroot","Orange","Pears","Strawberry","Water Melon"};
			 List <WebElement> allProducts = driver.findElements(By.cssSelector("h4.product-name"));
			 for (int i =0;i<allProducts.size();i++) {
				 String getSize = allProducts.get(i).getText();
				 String[] splited = getSize.split("-");
				 String splitedproducts = splited[0].trim();
				 List iteamsNeeded = Arrays.asList(veggies);
				 if (iteamsNeeded.contains(splitedproducts)) {
					 j++;
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					if(j==veggies.length) {
						break;
					}
					
					
					
					}
				
			}
			    driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
				driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
				driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
				driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
				driver.findElement(By.xpath("//button[text()='Place Order']")).click();
			 
				WebElement selecting = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
			    Select s = new Select(selecting);
			    s.selectByVisibleText("India");
			    driver.findElement(By.className("chkAgree")).click();
			    driver.findElement(By.xpath("//button[text()='Proceed']")).click();
			    
			
	}

}
