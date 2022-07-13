package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class countLinks {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		//WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		String url = "https://google.com";
		
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("link counts are: " + links.size());
		driver.quit();
	}

}
