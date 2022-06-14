package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class profileManager {
	
	public static void main(String[] args) {
		String url= "https://google.com";
		
		WebDriver driver = null;
		
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile fxprofile =  profile.getProfile("selenium");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(fxprofile);
		
		driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
	}

}
