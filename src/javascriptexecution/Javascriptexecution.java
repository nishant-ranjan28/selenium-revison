package javascriptexecution;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Javascriptexecution {
	
	WebDriver driver;
	JavascriptExecutor js;
	
	@Test
	public void testJavascriptExecution(){
		driver = new FirefoxDriver();
		js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		js.executeScript("window.location = 'https://www.google.com'");
		
//		WebElement textBox = (WebElement) js.executeScript("return document.getElementById('')");
//		textBox.sendKeys("");
		
		
		
		
	}

}
