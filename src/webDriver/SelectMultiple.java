package webDriver;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultiple {
	
	WebDriver driver;
	String URL;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		URL= "https://courses.letskodeit.com/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get(URL);
		WebElement element = driver.findElement(By.id("multiple-select-example"));
		Select sel = new Select(element);
		
		sel.selectByIndex(0);
		
		Thread.sleep(2000);
		sel.selectByIndex(1);
		
		Thread.sleep(2000);
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		sel.deselectAll();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
