package webDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import usefulMethods.GenericMethod;

public class GenericElementListDemo {

	private WebDriver driver;
	private String baseUrl;
	private GenericMethod gm;


	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		baseUrl = "https://courses.letskodeit.com/practice";
		gm = new GenericMethod(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void f() {
		driver.get(baseUrl);

		List<WebElement> el = gm.getElementList("cars", "name");

		int size = el.size();
		System.out.println(size);
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
