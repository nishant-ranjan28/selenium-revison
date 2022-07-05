package handleWindow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwitchiFrame {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://courses.letskodeit.com/practice");
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		je.executeScript("window.scrollBy(0, 800)");
		Thread.sleep(3000);
		
	
		//switch by id
		//driver.switchTo().frame("courses-iframe");
		
		//switch by name
		//driver.switchTo().frame("iframe-name");
		
		//switch by index
		driver.switchTo().frame(0);
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Python");
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		je.executeScript("window.scrollBy(0, -800)");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Hello");
		
	}

}
