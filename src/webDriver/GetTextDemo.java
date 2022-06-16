package webDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class GetTextDemo {
	
	public static void main(String[] args) throws InterruptedException {
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile fxProfile = profile.getProfile("selenium");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(fxProfile);
		
		WebDriver driver;
		
		driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String baseUrl = "https://courses.letskodeit.com/practice";
		
		driver.get(baseUrl);
		
		WebElement el = driver.findElement(By.id("opentab"));
		String elText = el.getText();
		
		System.out.println(elText);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
