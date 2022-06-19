package handleCalender;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import usefulMethods.GenericMethod;

public class AutocompleteDemo {
	
	WebDriver driver;
	String baseUrl;
	GenericMethod wt;

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		baseUrl = "https://www.goibibo.com";
		
		wt = new GenericMethod(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}

	@Test
	public void f() throws InterruptedException {
		driver.get(baseUrl);
		
		String partialtext = "Del";
		String textToSelect = "New Delhi, India";
		
		WebElement textField = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[1]/div/div/p"));
		textField.click();
		
		WebElement inputField = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/div/input"));
		
		
		inputField.sendKeys(partialtext);
		
		
		
		WebElement ulText = driver.findElement(By.id("autoSuggest-list"));
		
		List<WebElement> liElement = ulText.findElements(By.tagName("li"));
		Thread.sleep(3000);
		
		for (WebElement element : liElement) {
			if(element.getText().contains(textToSelect)) {
				System.out.println("Selected " + element.getText());
				element.click();
				break;
			}
		}
	}


	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
