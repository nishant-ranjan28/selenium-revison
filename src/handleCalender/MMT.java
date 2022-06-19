package handleCalender;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MMT {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		String baseUrl;
		String toSelect = "Mumbai, India";

		baseUrl = "https://www.makemytrip.com";
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get(baseUrl);

		driver.findElement(By.id("fromCity")).click();

		WebElement inputField = driver.findElement(By.xpath("//input[@aria-controls = 'react-autowhatever-1']"));
		inputField.sendKeys("Mum");

		WebElement ulText = driver.findElement(By.xpath("(//ul[@role='listbox'])[1]"));

		List<WebElement> liText = ulText.findElements(By.tagName("li"));
		Thread.sleep(2000);

		for(WebElement element : liText) {
			if(element.getTagName().contains(toSelect)) {
				System.out.println("Selected " + element.getText());
				element.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
