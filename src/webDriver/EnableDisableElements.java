package webDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnableDisableElements {
	
	WebDriver driver = null;
	String URL = "https://www.google.com";

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void test() throws InterruptedException {
		WebElement el = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		el.sendKeys("nishantranjan.in");
		el.click();
		
		Thread.sleep(3000);
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
