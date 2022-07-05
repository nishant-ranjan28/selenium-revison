package scrollDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollWindow {

	public void scrollWindowDemo() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com");

		Thread.sleep(3000);

		((JavascriptExecutor)driver).executeScript("scroll(0, 500)");
	}

}
