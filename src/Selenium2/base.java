package Selenium2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		 
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//implict wait
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			 
			 
			 String[] veggies = {"Cucumber","Beetroot","Orange","Pears","Strawberry","Water Melon"};
			 addItems(driver, veggies);
			 //base b = new base();
			 //b.addItems(driver, veggies);
//Without creating the object you cannot access the method
			 
			 //explicit wait//
			 WebDriverWait w = new WebDriverWait(driver, 5);
			 
			 
			 driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
				driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
				/*explicit wait*/ w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
				driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
				driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
				System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
				/*explicit wait*/ w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
				driver.findElement(By.xpath("//button[text()='Place Order']")).click();
                WebElement selecting = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
			   Select s = new Select(selecting);
			   s.selectByVisibleText("India");
			   driver.findElement(By.className("chkAgree")).click();
			   driver.findElement(By.xpath("//button[text()='Proceed']")).click();
}



public static void addItems(WebDriver driver, String[] veggies) 
{
	int j=0;

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
   
}
}
