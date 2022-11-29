package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AirwaysdropdownpracticeAssertion {
	 public static void main(String [] args ) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[value='MAA']")).click();
		System.out.println(driver.findElement(By.cssSelector("a[value='MAA']")).getText());
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()=' Bengaluru (BLR)'])[2]")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println(driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).getText());

		int i = 1;
		while (i<=4) {
			driver.findElement(By.id("divpaxinfo")).click();
			i++;
		}
	     driver.findElement(By.id("btnclosepaxoption")).click();
	     System.out.println(driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).getText());
	     
	     WebElement money = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	     Select s = new Select(money);
	     s.selectByVisibleText("INR");
	     s.isMultiple();
	     
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

}
}
