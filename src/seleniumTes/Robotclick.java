package seleniumTes;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotclick {
	public static void main(String[] args) throws InterruptedException, Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        WebElement electronics = driver.findElement(By.xpath("//a[normalize-space()='Electronics']"));
        act.contextClick(electronics).build().perform();
        
        Robot rob = new Robot();
        rob.keyPress(KeyEvent.VK_DOWN);
        rob.keyRelease(KeyEvent.VK_DOWN);
        
        rob.keyPress(KeyEvent.VK_ENTER);
        rob.keyRelease(KeyEvent.VK_ENTER);
        
        WebElement topdeals = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
        act.contextClick(topdeals).build().perform();
        
        rob.keyPress(KeyEvent.VK_DOWN);
        rob.keyRelease(KeyEvent.VK_DOWN);
        
        rob.keyPress(KeyEvent.VK_ENTER);
        rob.keyRelease(KeyEvent.VK_ENTER);

}
	}
