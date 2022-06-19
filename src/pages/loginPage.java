/**
 * 
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




/**
 * @author nishantranjan
 *
 */
public class loginPage {
	
	WebDriver driver;
	
	By userName = By.id("email");
	By password = By.id("pass");
	By login = By.xpath("//button[@data-testid = 'royal_login_button']");
	
	
	
	public void loginMethod(String userId, String pwd) {
		driver.findElement(userName).sendKeys(userId);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(login).click();
		
	}
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
//	public void typeUsername(String uid) {
//		driver.findElement(userName).sendKeys(uid);
//	}
//	
//	public void typePassword(String pass) {
//		driver.findElement(password).sendKeys(pass);
//	}
//	
//	public void clickLogin() {
//		driver.findElement(login).click();
//	}
	
//	public String getSaltString() {
//        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
//        StringBuilder salt = new StringBuilder();
//        Random rnd = new Random();
//        while (salt.length() < 10) { // length of the random string.
//            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
//            salt.append(SALTCHARS.charAt(index));
//        }
//        String saltStr = salt.toString();
//        return saltStr;
//    }
	

}
