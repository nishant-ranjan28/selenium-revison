package testNGListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Test

@Listeners (testNGListeners.TestNGListener.class)
public class TestNGListenersDemo {
	
	@Test
	public void test4() {
		System.out.println("This is test 4");
	}
	
	@Test
	public void test5() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
	}
	
	@Test
	public void test6() {
		System.out.println("This is test 6");
		throw new SkipException("this is skipped");
	}
}
