package Selenium3;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebtableSorting {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//th[@aria-sort='descending']")).click();
		List <WebElement> webElementNames = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List <String> OrginalList = webElementNames.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(OrginalList);
		System.out.println("--------------------------------------");
		List <String> sortedList = OrginalList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		Assert.assertEquals(OrginalList, sortedList);
		////////////////////////////////////////////////////
		
		
		List <String>  price = webElementNames.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceveggie(s)).collect(Collectors.toList());
		price.forEach(d->System.out.println(d));
		
		List<String> bananaSelect = webElementNames.stream().filter(s->s.getText().contains("Banana")).map(s->banananPrice(s)).collect(Collectors.toList());
	
		bananaSelect.forEach(f->System.out.println(f));
	}

	private static String banananPrice(WebElement s) {
		String bananaPrice =s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return bananaPrice;
	}

	private static String getPriceveggie(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}
	

	

}
