/**
 * 
 */
package pages;

import java.lang.reflect.Constructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author nishantranjan
 *
 */
public class SwagDemoLoginPage {
	
	WebDriver driver;
	
	public SwagDemoLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.id("user-name");
	By password = By.id("password");
	By loginButton = By.id("login-button");
	
	public void inputUser(String userId) {
		driver.findElement(username).sendKeys(userId);
	}
	
	public void inputPass(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void buttonClick() {
		driver.findElement(loginButton).click();
	}
}
