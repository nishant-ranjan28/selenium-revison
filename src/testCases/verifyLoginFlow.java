/**
 * 
 */
package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.loginPage;

/**
 * @author nishantranjan
 *
 */
public class verifyLoginFlow {
	
	WebDriver driver;
	String baseUrl;
	
	
	
	@BeforeTest
	public void setBrowser() {
		
		
		driver = new FirefoxDriver();
		
		baseUrl = "https://www.facebook.com";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	@Test
	public void login() {
		driver.get(baseUrl);
		
		loginPage loginPage = new loginPage(driver);
		loginPage.loginMethod("admin", "demo123");
		
		
	}
	
	@AfterTest
	public void quit() {
		driver.quit();
	}

}
