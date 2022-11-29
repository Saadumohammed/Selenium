package seleniumTes;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RSPasswordstring {
	public static void main(String[] args) throws InterruptedException {
		String name = "Mohammed Sadiq";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();   
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        String password = getpassword(driver);
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText());
        System.out.println(driver.findElement(By.xpath("//div/h2")).getText());
        driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
        driver.close();
        
	
	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException {

	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(3000);
	String passwordtext = driver.findElement(By.cssSelector("form h2")).getText();
	//String [] passwordarray = passwordtext.split("'");
	//String [] passwordarray2 = passwordarray[1].split("'");
	//passwordarray2[0];
	String [] passwordarray = passwordtext.split("'");
	String password = passwordarray[1].split("'")[0];
	return password;
	
		
}
	
	
}
	
