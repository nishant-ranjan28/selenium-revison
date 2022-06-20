package extentReporting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportTestNG {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;
	String baseUrl;


	@BeforeTest
	public void setup() {

		htmlReporter = new ExtentHtmlReporter("extentTestNG.html");

		extent = new ExtentReports();

		extent.attachReporter(htmlReporter);



	}

	@Test
	public void test1() {

		ExtentTest test = extent.createTest("Verify login flow");

		driver = new FirefoxDriver();

		test.log(Status.INFO, "strting the test");

		baseUrl = "https://www.facebook.com";

		driver.get(baseUrl);

		test.pass("Navigated to facebook.com");

		test.info("test completed");


	}

	@AfterTest
	public void tearDown() {

		extent.flush();

	}



}
