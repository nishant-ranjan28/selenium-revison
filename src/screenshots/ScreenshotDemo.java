package screenshots;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class ScreenshotDemo {
	
	WebDriver driver;
	String baseUrl;
  
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  
	  baseUrl = "https://www.facebook.com";
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  }
  
  @Test
  public void f() {
	  driver.get(baseUrl);
	  driver.findElement(By.xpath("//button[@data-testid = 'royal_login_button']")).click();
  }

  @AfterTest
  public void afterTest() throws IOException {
	  String fileName = getRandomString(10) + ".png";
	  String dirctory = System.getProperty("usr.dir") + "//screenshots//";
	  File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(sourceFile, new File(dirctory + fileName));
	  driver.quit();
  }
  
  public static String getRandomString(int lenght) {
	  StringBuilder sb = new StringBuilder();
	  String characters = "abcdefghijklmnopqrstuvwxyz1234567890";
	  
	  for (int i=0; i<lenght; i++) {
		  int index = (int)(Math.random() * characters.length());
		  sb.append(characters.charAt(index));
	  }
	  return sb.toString();
  }

}
