/**
 * 
 */
package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.loginPage2;
import utilities.BrowserInitialisation;

/**
 * @author nishantranjan
 *
 */
public class verifyLoginFlow2 {

	WebDriver driver;
	String baseUrl;

	@BeforeTest
	public void browserSetup() {
		driver = BrowserInitialisation.startBrowser("firefox", "https://www.facebook.com");
	}

	@Test
	public void loginFb() {
		loginPage2 loginPage =  PageFactory.initElements(driver, loginPage2.class);
		loginPage.loginTo("admin", "admin123");
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}
