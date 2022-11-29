package seleniumTes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipledropdown  {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();   
        driver.get("https://www.ironspider.ca/forms/dropdowns.htm#example2");
        WebElement MAINBOX = driver.findElement(By.name("coffee2"));
        Select s = new Select(MAINBOX);
        boolean multiple = s.isMultiple();
        System.out.println(multiple);
        s.deselectAll();
        s.selectByVisibleText("Milk (2%)");
        s.selectByVisibleText("Sugar");
        s.selectByVisibleText("A danish");
        List<WebElement> allselected = s.getAllSelectedOptions();
        for (WebElement all : allselected) {
			System.out.println(all.getText());
		}
		}   
	}
