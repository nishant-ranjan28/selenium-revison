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

public class radioCheckbox {

	WebDriver driver = null;
	String URL;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		URL = "https://courses.letskodeit.com/practice";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@Test
	public void test() throws InterruptedException {
		WebElement bmwradio = driver.findElement(By.id("bmwradio"));
		bmwradio.click();

		Thread.sleep(2000);
		WebElement benzradio = driver.findElement(By.id("benzradio"));
		benzradio.click();

		Thread.sleep(2000);
		WebElement bmwcheck = driver.findElement(By.id("bmwcheck"));
		bmwcheck.click();

		Thread.sleep(2000);
		WebElement benzcheck = driver.findElement(By.id("benzcheck"));
		benzcheck.click();

		System.out.println("benz radio button is selected?" + benzradio.isSelected());
		System.out.println("bmw radio button is selected?" + bmwradio.isSelected());
		System.out.println("benz checkbox button is selected?" + benzcheck.isSelected());
		System.out.println("bmw checkbox button is selected?" + bmwcheck.isSelected());

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
