package keypress;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SendKeysDemo3 {
	
	WebDriver driver;
	String baseUrl;

	@BeforeTest
	public void setup() {
		baseUrl = "https://courses.letskodeit.com/practice";
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test
	public void sendKey() {
		driver.get(baseUrl);
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).perform();
		
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
