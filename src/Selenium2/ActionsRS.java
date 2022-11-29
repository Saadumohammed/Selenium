package Selenium2;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsRS {

	public static void main(String[] args) {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("https://www.amazon.in/");
				Actions act = new Actions(driver);
 				act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
 				act.moveToElement(driver.findElement(By.xpath("//span[text()='Baby Wishlist']"))).click().build().perform();
 				//driver.findElement(By.id("nav-link-accountList"))
               //clicking best seller element
 				//act.moveToElement(driver.findElement(By.xpath("//a[text()='Best Sellers']"))).contextClick
 				
 				
 				//keydown for clicking shift button for capital fond select
 				act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("animation").doubleClick().build().perform();
 				

	}

}
