/**
 * 
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import screenshots.PageScreenshot;

/**
 * @author nishantranjan
 *
 */
public class ProductPage {
	
	WebDriver driver ;
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By bag = By.xpath("//div[contains(text(), ' Backpack')]");
	By addToCart = By.id("add-to-cart-sauce-labs-backpack");
	By cartLogo = By.xpath("//a[@class = 'shopping_cart_link']");
	By cartPage = By.xpath("//div[contains(text(), 'Sauce Labs Backpack')]");
	
	
	public void sauceLabBag() {
		driver.findElement(bag).click();;
	}
	
	public void addToCart() throws InterruptedException {
		driver.findElement(addToCart).click();
		PageScreenshot.TakeFullScreenshot(driver);
	}
	
	public void clickCart() throws InterruptedException {
		driver.findElement(cartLogo).click();
		PageScreenshot.TakeFullScreenshot(driver);
	}
	
	public void verifyCartPage() {
		WebElement el = driver.findElement(cartPage);
		
		if(el.getText().equalsIgnoreCase("Sauce Labs Backpack1")) {
			System.out.println("matched");
		}else {
			System.out.println("false");
		}
		
	}
	
	
	
	

}
