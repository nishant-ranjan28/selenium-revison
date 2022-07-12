package keypress;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SendKeysDemo {
	
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
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
		driver.findElement(By.id("email")).sendKeys("Hello");
		driver.findElement(By.id("password")).sendKeys("tetst");
//		driver.findElement(By.xpath("//input[@value='Login']")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.id("password")).sendKeys(Keys.TAB);
		
		
	}
	
	//@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
