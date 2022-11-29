package seleniumTes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();   
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        WebElement one = driver.findElement(By.id("singleframe"));
        driver.switchTo().frame(one)
        driver.findElement(null))
	}

}
