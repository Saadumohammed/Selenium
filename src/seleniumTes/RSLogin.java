package seleniumTes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RSLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();   
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Mohammed Sadiq");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Mohammed@123");
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        driver.findElement(By.cssSelector("input[value='agreeTerms']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
        driver.findElement(By.xpath("//div [@class='forgot-pwd-container']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Mohammed Sadiq");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("mohammedsadiq191@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9940305859");
        driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
        driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("inputUsername")).sendKeys("Mohammed Sadiq");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
        
        
        

}
}