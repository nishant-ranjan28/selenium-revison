package handleWindow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwitchWindow {

	private WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://courses.letskodeit.com/practice");

		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window: " + parentWindow);

		driver.findElement(By.id("openwindow")).click();

		Set<String> windowHandles =  driver.getWindowHandles();
		for (String handle : windowHandles) {
			System.out.println(handle);
		}
		
		List<String> windowHandlesList = new ArrayList<>(windowHandles); //Set to List Conversion
		driver.switchTo().window(windowHandlesList.get(1));

		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Python");
		driver.close();
		
		driver.switchTo().window(windowHandlesList.get(0));
		
		driver.findElement(By.id("name")).sendKeys("Hello");

		driver.quit();
	}

}
