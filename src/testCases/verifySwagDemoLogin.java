/**
 * 
 */
package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.SwagDemoLoginPage;

/**
 * @author nishantranjan
 *
 */
public class verifySwagDemoLogin {

	static WebDriver driver;
	static String url = "https://www.saucedemo.com/";

	public static void main(String[] args) {
		browser();
		login();
		quitBrowser();

	}

	public static void browser() {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}


	public static void login() {
		SwagDemoLoginPage loginPage = new SwagDemoLoginPage(driver);

		loginPage.inputUser("standard_user");
		loginPage.inputPass("secret_sauce");
		loginPage.buttonClick();
	}
	
	public static void quitBrowser() {
		driver.quit();
	}

}
