package alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwitchAlert {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://courses.letskodeit.com/practice");
	}

	@Test
	public void test1() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Hello");

		driver.findElement(By.id("alertbtn")).click();
		
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();

		alert.accept();
	}

	@Test
	public void test2() throws InterruptedException {
		
		Thread.sleep(1000);

		driver.findElement(By.id("name")).sendKeys("Hello");

		driver.findElement(By.id("confirmbtn")).click();
		
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();

		alert.accept();

	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
