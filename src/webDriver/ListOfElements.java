package webDriver;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListOfElements {

	WebDriver driver = null;
	String URL = "https://courses.letskodeit.com/practice";

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@Test
	public void test() throws InterruptedException {
		boolean isChecked = false;
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@type, 'radio') and contains(@name, 'cars')]"));

		//List<WebElement> radioButtons = driver.findElements(By.name("car"));

		int size = radioButtons.size();
		System.out.println(size);

		for(int i=0; i<size; i++) {
			isChecked = radioButtons.get(i).isSelected();
			if(!isChecked) {
				radioButtons.get(i).click();
				Thread.sleep(2000);
			}
		}

	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
