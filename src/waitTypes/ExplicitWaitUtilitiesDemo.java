package waitTypes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import usefulMethods.GenericMethod;

public class ExplicitWaitUtilitiesDemo {
	WebDriver driver;
	String baseUrl;
	GenericMethod wt;

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		baseUrl = "https://courses.letskodeit.com/practice";
		wt = new GenericMethod(driver);

		driver.manage().window().maximize();
	}

	@Test
	public void f() {
		driver.get(baseUrl);
		driver.findElement(By.xpath("//a[contains(text(), 'Sign In')]")).click();


		//Explicit wait conditions
		WebElement emailField = wt.waitForElement(By.id("email"), Duration.ofSeconds(2)); //selenium4

		//WebElement emailField = wt.waitForElement(By.id("email"), 3); //selenium3^^

		emailField.sendKeys("hi hi hi");

		//driver.findElement(By.id("email")).sendKeys("hello");

		wt.clickWhenReady(By.xpath("//a[text() = 'Forgot Password?']"), Duration.ofSeconds(3));

	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
