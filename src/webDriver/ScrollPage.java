package webDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollPage {
	
	@Test
	public void scrollPageDown() throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com");
		
		Thread.sleep(3000);
		 
		((JavascriptExecutor)driver).executeScript("scroll(0, 500)");
		
	}

}
