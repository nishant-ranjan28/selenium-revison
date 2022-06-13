package webDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new FirefoxDriver();
		Actions action = new Actions(driver);
		String URL = "https://www.amazon.in/";
		driver.get(URL);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		action.moveToElement(element).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='nav-link nav-item']//span[text()='Your Account']")).click();
		
		driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites\"]"));
		driver.findElement(By.xpath("//span[(text()=\".in\")]"));
		
		
		driver.findElement(By.xpath("//a[@id=\"nav-hamburger-menu\"]")).click();
		Thread.sleep(5000);
		
		//verify element in loop
		driver.findElement(By.xpath("//div[contains(text(), 'trending')]"));
		
		driver.findElement(By.xpath("//ul[@class = 'hmenu hmenu-visible']//a[text() = 'Best Sellers']"));
		driver.findElement(By.xpath("//ul[@class = 'hmenu hmenu-visible']//a[text() = 'New Releases']"));
		driver.findElement(By.xpath("//ul[@class = 'hmenu hmenu-visible']//a[text() = 'Movers and Shakers']"));
		
		driver.findElement(By.xpath("//div[text()='digital content and devices']"));
		
		driver.findElement(By.xpath("//a[@data-ref-tag='nav_em_1_1_1_6']//div[text()='Echo & Alexa']"));
		driver.findElement(By.xpath("//a[@data-ref-tag='nav_em_1_1_1_7']//div[text()='Fire TV']"));
		driver.findElement(By.xpath("//a[@data-ref-tag='nav_em_1_1_1_8']//div[text()='Kindle E-Readers & eBooks']"));	
		
		driver.findElement(By.xpath("//div[@class= 'nav-sprite hmenu-close-icon']")).click();
		
		//text input
		WebElement el = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		el.clear();
		el.sendKeys("Mobile phone");
		
		
		System.out.println("ok");

	}

}
