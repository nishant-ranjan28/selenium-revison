package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverMac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		System.setProperty("webdriver.gecko.driver", "/Users/nishantranjan/projects/selenium-revison/drivers/geckodriver");

		//system property has been set so, we don't need to define property every time.
		
		WebDriver driver = new FirefoxDriver();

		String baseURL = "https://www.google.com";
		driver.get(baseURL);
		System.out.println("OK");
	}

}
