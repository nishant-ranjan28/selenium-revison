package waitTypes;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class ExplicitWaitDemo {
	
	WebDriver driver;
	String baseUrl;
 
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  baseUrl = "https://courses.letskodeit.com/practice";
	  
	  driver.manage().window().maximize();
  }
  
  @Test
  public void f() {
	  driver.get(baseUrl);
	  driver.findElement(By.xpath("//a[contains(text(), 'Sign In')]")).click();
	  
	  
	  //Explicit wait conditions
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	  WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	  emailField.sendKeys("hi hi hi");
	  
	  //driver.findElement(By.id("email")).sendKeys("hello");
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
  }

}
