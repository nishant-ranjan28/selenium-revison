package webDriver;

import org.testng.annotations.Test;

import usefulMethods.GenericMethod;

import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class isElementPresentDemo {

	private WebDriver driver;
	private String baseUrl;
	private GenericMethod gm;


	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		baseUrl = "https://courses.letskodeit.com/practice";
		gm = new GenericMethod(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void f() {
		driver.get(baseUrl);
		
		boolean result = gm.isElementPresent("name", "id");
		System.out.println("Element is present: " + result);
		
		boolean result2 = gm.isElementPresent("name123", "id");
		System.out.println("Element is present: " + result2);
		
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
