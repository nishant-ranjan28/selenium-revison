package mouseHover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseHoverDemo {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		driver = new ChromeDriver();

		//Maximise browser window
		driver.manage().window().maximize();

		//Adding wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Launch the URL 
		driver.get("https://www.amazon.in");

		WebElement el = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(el).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Your Orders']")).click();

	}

}
