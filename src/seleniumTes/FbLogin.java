package seleniumTes;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.openqa.selenium.support.ui.Select;

public class FbLogin {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	            WebDriver driver = new ChromeDriver();    
                driver.get("https://www.facebook.com/");
                Thread.sleep(3000);
                driver.findElement(By.xpath("//div[@placeholder='mail address or phone number']")).sendKeys("sadiq");
                
                WebElement password = driver.findElement(By.name("pass"));
                password.sendKeys("123456");
                WebElement submit = driver.findElement(By.name("login"));
                submit.click();
                driver.manage().window().maximize();
                driver.navigate().back();
                WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
                create.click();
                Thread.sleep(5000);
                WebElement first = driver.findElement(By.name("firstname"));
                first.sendKeys("mohammed");
                WebElement surname = driver.findElement(By.name("lastname"));
                surname.sendKeys("Sadiq");
                WebElement mail = driver.findElement(By.name("reg_email__"));
                mail.sendKeys("mohammedsadiq191@gmail.com");
                WebElement dob = driver.findElement(By.name("birthday_day"));
                Select s = new Select(dob);
                s.selectByVisibleText("29");
                WebElement month = driver.findElement(By.name("birthday_month"));
                Select s1 = new Select(month);
                s1.selectByValue("5");
                WebElement borny = driver.findElement(By.id("year"));
                Select s3 = new Select(borny);
                s3.selectByValue("1992");
                driver.findElement(By.xpath("//label[class='_58mt']")).click();
				}

}  

