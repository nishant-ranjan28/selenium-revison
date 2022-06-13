package webDriver;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JunitDemo {

	WebDriver driver;
	String URL = "https://courses.letskodeit.com/practice";

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(URL);
		String title = driver.getTitle();
		System.out.println(title);

		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);

		String UrlTo = "https://courses.letskodeit.com/login";
		driver.navigate().to(UrlTo);
		System.out.println("navigate to login");
		CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);

		Thread.sleep(2000);

		driver.navigate().back();
		System.out.println("navigated back");
		CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);

		Thread.sleep(2000);

		driver.navigate().forward();
		System.out.println("navigated forward");
		CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);

		Thread.sleep(2000);

		driver.navigate().back();
		System.out.println("navigated back");
		CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);


		String pageSource = driver.getPageSource();
		System.out.println(pageSource);


	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}


}
