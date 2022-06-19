/**
 * 
 */
package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.SwagDemoLoginPage;
import pages.logoutPage;

/**
 * @author nishantranjan
 *
 */
public class verifyLogoutSwagDemo {
	
	static WebDriver driver;
	static String url = "https://www.saucedemo.com/";

	public static void main(String[] args) {
		browser();
		login();
		logout();
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
	
	public static void logout() {
		logoutPage logoutPage = new logoutPage(driver);
		
		logoutPage.sideBar();
		logoutPage.logoutButton();
		
	}
	
	public static void quitBrowser() {
		driver.quit();
	}

}
