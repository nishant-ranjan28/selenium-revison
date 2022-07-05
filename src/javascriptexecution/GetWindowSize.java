package javascriptexecution;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetWindowSize {
	
	WebDriver driver;
	JavascriptExecutor js;
	
	@BeforeTest
	public void setUp() {
		driver = new FirefoxDriver();
		js = (JavascriptExecutor)driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test
	public void testJavascriptExecution() {
		js.executeScript("window.location = 'https://www.google.com'");
		
		long height = (long) js.executeScript("return window.innerHeight");
		long width = (long) js.executeScript("return window.innerWidth");
		
		System.out.println("Height is " + height + " Width is " + width);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
