package Selenium2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Realtimeexample2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//getting page bottom links
		WebElement bottomLinks = driver.findElement(By.id("gf-BIG"));
		System.out.println(bottomLinks.findElements(By.xpath("//div[@id='gf-BIG']//a")).size());
		System.out.println(bottomLinks.findElements(By.xpath("//div[@id='gf-BIG']//table/tbody/tr/td[4]/ul//a")).size());
		
		for (int i =0; i<bottomLinks.findElements(By.xpath("//div[@id='gf-BIG']//table/tbody/tr/td[4]/ul//a")).size();i++) {
		
			 String elementKey =  Keys.chord(Keys.CONTROL,Keys.ENTER); //sending keyboard control through sendkeys
			bottomLinks.findElements(By.xpath("//div[@id='gf-BIG']//table/tbody/tr/td[4]/ul//a")).get(i).sendKeys(elementKey);
			
			
		}
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while (it.hasNext());
		{
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
		
			
		
}
}
}
