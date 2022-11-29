package seleniumTes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

// static String value = "Books";
 //static String searchvalue = "Ponniyin Selvan";

public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver(); 
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.amazon.in/");
   // Thread.sleep(3000);
    //WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
    //dropDown.click();
    //Select s = new Select(dropDown);
    //List<WebElement> options = s.getOptions();
    //for (int i = 0; i < options.size(); i++) {
    	//String actual = options.get(i).getText();
    	
    	//if (value.equals(actual)) {
			//s.selectByVisibleText(actual);
			
	//	}
	//}
    
    //WebElement search = driver.findElement(By.xpath("//select/ancestor::div[3]/following-sibling::div/div[1]/input"));
    // search.sendKeys(searchvalue);
    
    //Thread.sleep(3000);
    
    //List<WebElement> searchoptions = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/child::div"));
    //int count = searchoptions.size();
    
    //for (int i = 0; i <=searchoptions.size(); i++) {
		//int svalue = count-2;
		//WebElement results = driver.findElement(By.xpath("//div[@class='autocomplete-results-container']/child::div["+svalue+"]/div/div"));
		//results.click();
		//System.out.println(searchoptions);
    
    
	}
  

}
    


   