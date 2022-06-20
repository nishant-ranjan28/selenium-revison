import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getAttributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");

		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());

		for (WebElement link2: link) {

			//print the links i.e. http://google.com or https://www.gmail.com
			System.out.println(link2.getAttribute("href"));

			//print the links text
			System.out.println(link2.getText());
		}
	}
}

