package testCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pages.SearchPage;

public class PageObjectModel {
	
public static WebElement element = null;
	
private WebDriver driver;
private String baseUrl;

@Before
public void setUp() throws Exception {
	driver = new FirefoxDriver();
	baseUrl = "https://www.expedia.com/";
	
	// Maximize the browser's window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@Test
public void test() {
	driver.get(baseUrl);
	SearchPage.fillOriginTextBox(driver, "New York");
	SearchPage.destinationTextBox(driver).sendKeys("Chicago");
	SearchPage.departureDateTextBox(driver).sendKeys("12/25/2014");
	// Added a line to clear the return date text box
	// before entering the return date, because Expedia by default
	// enters the return date same as the departure date
	SearchPage.returnDateTextBox(driver).clear();
	SearchPage.returnDateTextBox(driver).sendKeys("12/31/2014");
	SearchPage.clickOnSearchButton(driver);
}

@After
public void tearDown() throws Exception {
}

}
