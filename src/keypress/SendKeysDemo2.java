package keypress;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SendKeysDemo2 {
	
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
		
		//driver.findElement(By.id("openwindow")).sendKeys(Keys.COMMAND + "a");
		
		//using chord
		//driver.findElement(By.id("openwindow")).sendKeys(Keys.chord(Keys.COMMAND + "a"));
		
		String selectAll = Keys.chord(Keys.COMMAND, "a");
		driver.findElement(By.id("openwindow")).sendKeys(selectAll);
		
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
