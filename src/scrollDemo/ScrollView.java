package scrollDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollView {
	
	@Test
	public void scrollDemo() {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		WebElement element = driver.findElement(By.xpath("//div[@id='mCSB_3_container']//p[contains(text(),'Excepteur sint occaecat cupidatat non proident, su')]"));
		
		je.executeScript("arguments[0].scrollIntoView(true)", element );
		
		System.out.println(element.getText());
		
	}

}
