package assertion;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class assertDemo {

	WebDriver driver;
	String expectedTitle;
	String actualTitle;
	String baseUrl;

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();

		expectedTitle = "Online Courses - Learn Anything, On Your Schedule | Udemy";
		baseUrl = "https://udemy.com";

	}

	@Test
	public void f() {
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@Test
	public void g() {
		Assert.assertEquals(12, 13, "Count did not match");
	}


	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
