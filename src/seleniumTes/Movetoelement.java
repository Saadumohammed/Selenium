package seleniumTes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        WebElement ele1 = driver.findElement(By.xpath("//span[text()='Best Sellers in Sports, Fitness & Outdoors'][1]"));
        act.moveToElement(ele1).clickAndHold(ele1).build().perform();
        WebElement shettel = driver.findElement(By.xpath("//img[@alt='Masks and other safety supplies']"));
        act.click(shettel).build().perform();
        
	       
	}

    
}
