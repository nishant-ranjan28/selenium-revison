package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
	
	@Test
	public void testSoft() {
		SoftAssert asserion = new SoftAssert();
		System.out.println("test 1 started");
		asserion.assertEquals(12, 13);
		System.out.println("Test failed");
		asserion.assertAll();
	}
	
	@Test (priority = 2)
	public void hardAssert() {
		//Hard Assertion
		System.out.println("Test started");
		Assert.assertEquals(12, 13);
		System.out.println("Conitue");
	}
}
