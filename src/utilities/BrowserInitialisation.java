/**
 * 
 */
package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * @author nishantranjan
 *
 */
public class BrowserInitialisation {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url) {
		
		if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			
		}else if(browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}else {
			System.out.println("browser not added in the utility method");
		}
		
		driver.manage().window().maximize();
		
		driver.get(url);
		return driver;
	}
	

}
