package Selenium2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavascripExecutorparsingint {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//webpage scrolling
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,675)");
	    Thread.sleep(3000);
		
		//in page table scrolling
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		//System.out.println(driver.findElements(By.cssSelector("div[class='tableFixHead'] table td:nth-child(4)")).size());
		List <WebElement> values = driver.findElements(By.cssSelector("div[class='tableFixHead'] table td:nth-child(4)"));
		int sum = 0;
		for(int i =0;i<values.size();i++) 
		{
		   sum = sum + Integer.parseInt(values.get(i).getText());
		 System.out.println(sum);
			
			
		}
		System.out.println(driver.findElement(By.xpath("//div[text()=' Total Amount Collected: 296 ']")).getText());
		int total = Integer.parseInt(driver.findElement(By.xpath("//div[text()=' Total Amount Collected: 296 ']")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);
	
	}
	

}
