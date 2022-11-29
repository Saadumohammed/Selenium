package seleniumTes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClick {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();   
        driver.get("https://demoqa.com/buttons");
        Actions perform = new Actions(driver);
        WebElement doubleclk = driver.findElement(By.id("doubleClickBtn"));
        perform.doubleClick(doubleclk).build().perform();
        WebElement rightclk = driver.findElement(By.id("rightClickBtn"));
        perform.contextClick(rightclk).build().perform();
        WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));
        click.click();
       
	}
	

}
