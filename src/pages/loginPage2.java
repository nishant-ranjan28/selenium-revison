/**
 * 
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author nishantranjan
 *
 */
public class loginPage2 {
	
	WebDriver driver;
	
	public loginPage2(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(how = How.ID, using = "email") @CacheLookup WebElement username;
	
	@FindBy(how = How.ID, using = "pass") @CacheLookup WebElement password;
	
	@FindBy(how = How.XPATH, using = "//button[@data-testid = 'royal_login_button']") WebElement loginButton;
	
	public void loginTo(String uid, String pwd) {
		username.sendKeys(uid);
		password.sendKeys(pwd);
		loginButton.click();
	}

}
