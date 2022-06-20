package extentReporting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class basicExample {

	

	public static void main(String[] args) {
		
		WebDriver driver;
		String baseUrl;
		
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		ExtentTest test = extent.createTest("Verify login flow");

		driver = new FirefoxDriver();
		
		test.log(Status.INFO, "strting the test");

		baseUrl = "https://www.facebook.com";
		
		driver.get(baseUrl);
		
		test.pass("Navigated to facebook.com");
		
		test.info("test completed");
		
		extent.flush();
		

	}

}
