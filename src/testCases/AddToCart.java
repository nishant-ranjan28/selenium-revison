/**
 * 
 */
package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.ProductPage;
import pages.SwagDemoLoginPage;

/**
 * @author nishantranjan
 *
 */
public class AddToCart {
	
	static WebDriver driver;
	static String url = "https://www.saucedemo.com/";
	
	public static void main(String[] args) {
		
		browser();
		login();
		verifyCartPage();
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
	
	public static void verifyCartPage() {
		
		ProductPage pg = new ProductPage(driver);
		
		pg.sauceLabBag();
		
		pg.addToCart();
		
		pg.clickCart();
		
		pg.verifyCartPage();
	}
	
	public static void quitBrowser() {
		driver.quit();
	}

}
