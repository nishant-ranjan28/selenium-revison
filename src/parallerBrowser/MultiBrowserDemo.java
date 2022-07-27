package parallerBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserDemo {
	WebDriver driver;
	@Parameters ("browserName")
	@BeforeTest
	public void setUp(String browserName){

		System.out.println("Browser name is: " + browserName);
		System.out.println("Thread id is: " + Thread.currentThread().getId());
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
	}

	@Test
	public void test1() {
		driver.get("https://www.google.com");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
