package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Limitingwebdriverscope {
	public static void main(String [] args ) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Limiting webdriver scope for counting the link in the web page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Limiting webdriver scope for counting the footer web page link
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.xpath("//div[@id='gf-BIG']//a")).size());
		//Limiting webdriver scope for footer particular coulumn section to count the link
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		for (int i = 0; i < columnDriver.findElements(By.tagName("a")).size() ; i++) {
			columnDriver.findElements(By.tagName("a")).get(i).click();
			
		}
		
	 }   

	}


