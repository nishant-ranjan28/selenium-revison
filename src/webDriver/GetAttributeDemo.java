package webDriver;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.AfterTest;

public class GetAttributeDemo {

	WebDriver driver;
	String url = "https://courses.letskodeit.com/practice";

	@BeforeTest
	public void beforeTest() {
		
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile  fxProfile = profile.getProfile("selenium");

		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(fxProfile);

		driver = new FirefoxDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(url);
	}

	@Test
	public void f() {
		WebElement el = driver.findElement(By.id("product"));
		String attVal = el.getAttribute("class");
		System.out.println(attVal);
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
