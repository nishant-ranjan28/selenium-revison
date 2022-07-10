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

public class SelectDate {
	WebDriver driver;
	String baseUrl;
	GenericMethod wt;

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com";
		wt = new GenericMethod(driver);

		//Manage the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	
	public void f() {

		driver.get(baseUrl);

		driver.findElement(By.xpath("//span[text() = 'Flights']")).click();

		driver.findElement(By.xpath("//span[text() = 'One-way']")).click();

		driver.findElement(By.id("d1-btn")).click();

		System.out.println("element found");

		wt.clickWhenReady(By.xpath("//button[@aria-label='Jun 30, 2022 selected, current check in date.']"), Duration.ofSeconds(3));

		driver.findElement(By.xpath("//button[contains (text(),'Done') and @data-stid = 'apply-date-picker']")).click();
	}

	@Test
	public void g() throws InterruptedException {

		driver.get(baseUrl);

		driver.findElement(By.xpath("//span[text() = 'Flights']")).click();

		//driver.findElement(By.xpath("//span[text() = 'One-way']")).click();

		WebElement calMonth = driver.findElement(By.id("d1-btn"));
		calMonth.click();
		
		List<WebElement> allValidDates = calMonth.findElements(By.tagName("button"));
		
		Thread.sleep(2000);

		for(WebElement date : allValidDates) {
			if(date.getText().equals("30")) {
				date.click();
				System.out.println("date clicked");
				driver.findElement(By.xpath("//button[contains (text(),'Done') and @data-stid = 'apply-date-picker']")).click();
				break;
			}
		}
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
