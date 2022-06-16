package webDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

import usefulMethods.GenericMethod;


public class GenericMethodDemo {
	
	private WebDriver driver;
	private String baserl;
	private GenericMethod gm;
	
 
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  baserl = "https://courses.letskodeit.com/practice";
	  gm = new GenericMethod(driver);
	  
	  //Maximize the window
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }
  
  @Test
  public void f() {
	  driver.get(baserl);
	  WebElement el = gm.getElement("name", "id");
	  el.sendKeys("hello");
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
  }

}
