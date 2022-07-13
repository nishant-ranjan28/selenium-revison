package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageFactory {
	
	WebDriver driver;
	String baseUrl;
	
	@FindBy (xpath = "//span[normalize-space()='Flights']")
	WebElement flightTab;
	
	@FindBy (xpath = "//span[normalize-space()='One-way']")
	WebElement oneWay;
	
	@FindBy (xpath = "//span[normalize-space()='Multi-city']")
	WebElement multiCity;
	
	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickFlightTab() {
		flightTab.click();
	}

}
