package seleniumTes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Miniprojecttsk1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://automationpractice.com/index.php");
	    WebElement signin = driver.findElement(By.className("login"));
	    signin.click();
	    WebElement user = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	    user.sendKeys("mohammedsadiq191@gmail.com");
	    WebElement password = driver.findElement(By.id("passwd"));
	    password.sendKeys("12345678");
	    WebElement submit = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
	    submit.click();
	    Actions act = new Actions(driver);
	    
	    WebElement womens = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
	    act.moveToElement(womens).build().perform();
	    driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	    WebElement casual = driver.findElement(By.linkText("Casual Dresses"));
	    act.moveToElement(casual).click().build().perform();
	    WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li"));
	    act.moveToElement(element).build().perform();
	    WebElement quickview = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[2]"));
	    act.click(quickview).build().perform();
	    Thread.sleep(5000); 
	    for (String string : args) {
			
		}
	    
	    WebElement i = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	    driver.switchTo().frame(i);
	    WebElement add2cart = driver.findElement(By.id("add_to_cart"));
	    add2cart.click();
	    driver.switchTo().defaultContent();
	    WebElement protochek = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	    protochek.click();
	    WebElement protochek1 = driver.findElement(By.linkText("Proceed to checkout"));
	    protochek1.click();
	    driver.findElement(By.name("processAddress")).click();
	    WebElement agree = driver.findElement(By.name("cgv"));
	    agree.click();
	    WebElement protochek2 = driver.findElement(By.name("processCarrier"));
	    
	    protochek2.click();
	}

}
