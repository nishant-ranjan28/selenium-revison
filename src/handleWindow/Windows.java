package handleWindow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windows {
	
	private WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	
	
	@Test
    public void SwitchToWindows() {
        //1) Navigate to URL
        driver.navigate().to("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
        driver.manage().window().maximize();
        
        //2) Get the current window's handle and write to the console window. It must be first window handle.
        System.out.println("Current Window Handle: " + driver.getWindowHandle() + "\n");
        //Switch to iframeResult iframe because all elements located in this iframe
        driver.switchTo().frame("iframeResult");
        
        
        //3) Locate the link and click it
        WebElement visitLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
        visitLink.click();
        
        //4) Get all window handles and hold them in a list.
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowHandlesList = new ArrayList<>(windowHandles); //Set to List Conversion
        
        //5) Write to total window handle number to the console.
        System.out.println("Total window number: " + windowHandlesList.size() + "\n");
        
        //6) Switch to second window
        driver.switchTo().window(windowHandlesList.get(1));
        
        //7) Get the current window's handle and write to the console window. It must be second window handle.
        System.out.println("Current Window Handle: " + driver.getWindowHandle() + "\n");
        
        WebElement logo = driver.findElement(By.cssSelector(".fa.fa-logo"));
        
        if(logo.isDisplayed()) {
        	System.out.println("true");
        }else 
        	System.out.println("false");
        
        //9) Go back (Switch) to first window
        driver.switchTo().window(windowHandlesList.get(0));
        
        //10) Get the current window's handle and write to the console window. It must be first window handle.
        System.out.println("Current Window Handle: " + driver.getWindowHandle() + "\n");
        
      //11) Check the Run Button Text
        WebElement seeResultButton = driver.findElement(By.cssSelector("button[onclick*='submitTryit(1)'"));
         if(seeResultButton.equals("Run ❯")) {
        	 System.out.println("true");
         }else {
        	 System.out.println("flase");
         }
    }
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
