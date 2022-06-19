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
public class logoutPage {
	
	WebDriver driver;
	
	
	By sidebar = By.id("react-burger-menu-btn");
	By logout = By.id("logout_sidebar_link");
	
	public logoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void sideBar() {
		
		driver.findElement(sidebar).click();
		
	}
	
	public void logoutButton() {
		driver.findElement(logout).click();
	}

}
