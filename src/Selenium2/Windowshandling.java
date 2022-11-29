package Selenium2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		Set<String> window = driver.getWindowHandles();
	   Iterator<String> it = window.iterator();
	   String parent = it.next();
	   String child = it.next();
	   driver.switchTo().window(child);
	   System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
	   String emailid = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	   System.out.println(emailid);
	   driver.switchTo().window(parent);
	   driver.findElement(By.id("username")).sendKeys(emailid);
	   

	}

}
