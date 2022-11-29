package seleniumTes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RSDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.manage().window().maximize();
	       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	       WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	       Select s = new Select(dropdown);
	       s.selectByVisibleText("AED");
	       System.out.println(s.getFirstSelectedOption().getText());
	       s.selectByIndex(3);
	       System.out.println(s.getFirstSelectedOption().getText());
	       s.selectByValue("INR");
	       System.out.println(s.getFirstSelectedOption().getText());
	       
	       driver.findElement(By.id("divpaxinfo")).click();
	       int i = 1;
	       while (i<=4) {
	      driver.findElement(By.id("hrefIncAdt")).click();   
			i++;  
			
}
	       driver.findElement(By.id("btnclosepaxoption")).click();
	       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	       
	  
	  //driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  //driver.findElement(By.xpath("//a[@value='MAA']")).click();
	  //Thread.sleep(2000);
	  //driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	  //driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
	  
	 /* driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click();
	  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
	  driver.findElement(By.id("autosuggest")).sendKeys("Au");
	  Thread.sleep(2000);
	  int count= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")).size();

	  for(int i=0; i<count; i++)

	  {

	  String choice= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")).get(i).getText();

	  if(choice.equalsIgnoreCase("Australia"))

	  {
	Thread.sleep(3000);

	      driver.findElements(By.className("ui-corner-all")).get(i).click();
	      System.out.println(choice);
	      break;*/
	  
		
	}

}
