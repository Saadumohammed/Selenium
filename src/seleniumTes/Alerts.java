package seleniumTes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();   
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        
        WebElement norclick = driver.findElement(By.id("alertButton"));
        norclick.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        
        WebElement delay = driver.findElement(By.id("timerAlertButton"));
        delay.click();
        Thread.sleep(6000);
        driver.switchTo().alert().accept();
        
        WebElement con = driver.findElement(By.id("confirmButton"));
        con.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        
    
        WebElement pro = driver.findElement(By.xpath("//*[@id=\"promtButton\"]"));
        pro.click();
        driver.switchTo().alert().sendKeys("mohammedsadiq");
        driver.switchTo().alert().accept();

	}
}
