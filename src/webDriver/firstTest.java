package webDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		String baseUrl = "https://courses.letskodeit.com/practice";
		//String baseUrl = "https://courses.letskodeit.com";

		driver.get(baseUrl);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//By Name
		driver.findElement(By.name("enter-name")).sendKeys("Hello");
		
		//By LinkText
		//driver.findElement(By.linkText("SIGN IN")).click();	
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hello@hello.com");



	}

}
