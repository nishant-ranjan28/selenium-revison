package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class safariDriverMac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new SafariDriver();
		
		String str = "https://www.google.com";
		driver.get(str);
		System.out.println("ok");

	}

}
