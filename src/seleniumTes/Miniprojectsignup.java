package seleniumTes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Miniprojectsignup {
	public static void main(String[] args) throws InterruptedException, Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.className("login")).click();
        driver.findElement(By.name("email_create")).sendKeys("mohammedsadiq191@gmail.com");
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        WebElement createaccount = driver.findElement(By.name("SubmitCreate"));
        act.moveToElement(createaccount).build().perform();
        Thread.sleep(5000);
        Thread.sleep(5000);
        //driver.findElement(By.className("page-subheading")).click();
        createaccount.click();  
        Thread.sleep(3000);
        WebElement gender = driver.findElement(By.name("id_gender"));
        gender.click();
        WebElement first = driver.findElement(By.id("customer_firstname"));
        first.sendKeys("Mohammed");
        WebElement last = driver.findElement(By.id("customer_lastname"));
        last.sendKeys("Sadiq");
        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
        pass.sendKeys("12345678");
        WebElement day = driver.findElement(By.id("days"));
        Select s = new Select(day);
        s.selectByValue("29");
        WebElement month = driver.findElement(By.id("months"));
        Select s1 = new Select(month);
        s1.selectByValue("5");
        WebElement year = driver.findElement(By.id("years"));
        Select s2 = new Select(year);
        s2.selectByValue("1992");
        WebElement newsletter = driver.findElement(By.name("newsletter"));
        newsletter.click();
        WebElement special = driver.findElement(By.xpath("//input[@id='optin']"));
        special.click();
        WebElement address = driver.findElement(By.name("address1"));
        address.sendKeys("57/11, o block cross street, MMDA Colony, Arumbakkam");
        WebElement address1 = driver.findElement(By.name("address2"));       
        address1.sendKeys("Arumbakkam");
        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("CHENNAI");
        WebElement state = driver.findElement(By.name("id_state"));
        Select st = new Select(state);
        st.selectByVisibleText("Virginia");
        WebElement zip = driver.findElement(By.id("postcode"));
        zip.sendKeys("22428");
        WebElement additional = driver.findElement(By.name("other"));
        additional.sendKeys("9940305859");
        WebElement mobile = driver.findElement(By.name("phone_mobile"));
        mobile.sendKeys("9940305859");
        WebElement submit = driver.findElement(By.xpath("//span[text()='Register']"));
        submit.click();
}
