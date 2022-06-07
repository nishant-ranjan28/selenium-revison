package webDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium4 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		//Deprecated in Selenium4
		//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Desired Capabilities -> Deprecated in selenium 4 and replaced with Options
		//DesiredCapabilities caps = DesiredCapabilities.firefox();
		
		ChromeOptions options = new ChromeOptions();

	}

}
