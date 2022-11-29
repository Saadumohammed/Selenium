package Selenium2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class realtimeexample1 {
	public static void main(String [] args ) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://apphawks.com/blog/automation-testing-of-e-commerce-website");
		//getting all page links
		   System.out.println(driver.findElements(By.tagName("a")).size());
		   
		   // using footer driver for getting footer links
		 WebElement footerdriver = driver.findElement(By.className("footer__wrapper"));
		   System.out.println(footerdriver.findElements(By.xpath("//div[@class='footer__wrapper']/div/footer/div/div[2]/div//a")).size());
		   WebElement footerclick = footerdriver.findElement(By.xpath("//div[@class='footer__wrapper']/div/footer/div/div[2]/div//a"));
		   driver.findElement(By.xpath("//button[text()='Accept']")).click();
		   
		   //footerdriver.findElements(By.xpath("//div[@class='footer__wrapper']/div/footer/div/div[2]")
		for(int i =1; i< footerclick.findElements(By.xpath("//div[@class='footer__wrapper']/div/footer/div/div[2]/div//a")).size(); i++ )
		{
			// using control and enter keyboard keys to open the link which was clicked 
			String clickon = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			//passing the keys through send keys
			footerclick.findElements(By.xpath("//div[@class='footer__wrapper']/div/footer/div/div[2]/div//a")).get(i).sendKeys(clickon);
		}
		// opens all the tabs and gets the title
			Set<String> w =driver.getWindowHandles();
			 Iterator<String> it = w.iterator();
			 while (it.hasNext())
			 {
				
				 driver.switchTo().window(it.next());
				 System.out.println(driver.getTitle());
				 
				 
			 }
			 
			 
		}
	   

	

}
