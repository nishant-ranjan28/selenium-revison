package webDriver;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementDisplayed {

	WebDriver driver;
	String url1;
	String url2;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		url1 = "https://courses.letskodeit.com/practice";
		url2 = "https://www.expedia.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

//	@Test
//	public void test1() throws InterruptedException {
//		driver.get(url1);
//
//		WebElement element = driver.findElement(By.id("displayed-text"));
//		System.out.println("Text box is displayed: " + element.isDisplayed());
//
//		Thread.sleep(2000);
//		WebElement hide = driver.findElement(By.id("hide-textbox"));
//		hide.click();
//		System.out.println("Text box is displayed: " + element.isDisplayed());
//
//		Thread.sleep(2000);
//		WebElement show = driver.findElement(By.id("show-textbox"));
//		show.click();
//		System.out.println("Text box is displayed: " + element.isDisplayed());
//
//	}

		@Test
		public void tes2t() throws InterruptedException {
			driver.get(url2);
			
			WebElement flight = driver.findElement(By.xpath("//span[contains(@class , 'uitk-tab-text') and contains(text(),  'Flights')]"));
			flight.click();
			
			WebElement returnDateOption = driver.findElement(By.xpath("//button[@id='d2-btn']"));
			System.out.println("Return date option is displayed: " + returnDateOption.isDisplayed());
			
			Thread.sleep(2000);
			WebElement search = driver.findElement(By.xpath("//button[text() = 'Search']"));
			search.click();
			
			
			WebElement oneWay = driver.findElement(By.xpath("//span[text() = 'One-way']"));
			oneWay.click();
			System.out.println("onway clicked");
			System.out.println("Return date option is displayed: " + returnDateOption.isDisplayed());
			
			Thread.sleep(2000);
			WebElement returnDate = driver.findElement(By.xpath("//span[text() = 'Roundtrip']"));
			returnDate.click();
			System.out.println("Return date option is displayed: " + returnDateOption.isDisplayed());
			
		}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
