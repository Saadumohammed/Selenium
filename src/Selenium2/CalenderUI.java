package Selenium2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderUI {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		//driver.findElement(By.cssSelector("div[class='flatpickr-current-month']")).getText().contains("April");
		
		//select and search the exact month
		
		while (!driver.findElement(By.cssSelector("div[class='flatpickr-month'] [class='flatpickr-current-month']")).getText().contains("April")) 
		{
			// click on button to identify the april month is there or not
			driver.findElement(By.className("flatpickr-next-month")).click();
		}
		// Select the date and clicking
		System.out.println(driver.findElements(By.className("flatpickr-day")).size());
		List <WebElement> dates = driver.findElements(By.className("flatpickr-day"));

		int count = driver.findElements(By.className("flatpickr-day")).size();
		for(int i = 0; i<count;i++)
		{
			String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if (text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
			
			
		}
		
		
	}
	
}
