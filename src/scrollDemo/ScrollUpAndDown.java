package scrollDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollUpAndDown {
	
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
	public void scrollUpAndDown() throws InterruptedException {
		js.executeScript("window.location = 'https://courses.letskodeit.com/practice'");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0, 1900)");
		Thread.sleep(3000);
		System.out.println("down");
		
		js.executeScript("window.scrollBy(0, -1900)");
		Thread.sleep(3000);
		System.out.println("up");
		
		//scroll into view 
		
		WebElement el = driver.findElement(By.xpath("//a[normalize-space()='Support']"));
		js.executeScript("arguments[0].scrollIntoView(true)", el);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", el);
		System.out.println("clicked");
		
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
