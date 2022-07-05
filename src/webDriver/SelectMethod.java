package webDriver;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectMethod {
	
	WebDriver driver = null;
	String URL;

	@BeforeTest
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		
		URL = "https://courses.letskodeit.com/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get(URL);
		
		WebElement element = driver.findElement(By.id("carselect"));
		Select sel = new Select(element);
//		
		Thread.sleep(2000);
		System.out.println("Select Benz by value");
		sel.selectByValue("benz");
		
		Thread.sleep(2000);
		System.out.println("Select Honda by index");
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		System.out.println("Select Bmw by visible text");
		sel.selectByVisibleText("BMW");
		
		Thread.sleep(2000);
		System.out.println("Print all selections: ");
		
		List<WebElement> options = sel.getOptions();
		int size = options.size();
		for(int i=0; i<size; i++) {
			String optionName = options.get(i).getText();
			System.out.println(optionName);
		}
		
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}

}


