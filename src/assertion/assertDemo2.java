package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertDemo2 {
	
	@Test
	public void test() {
		String str = "Nishant";
		Assert.assertTrue(str.contains("Ranjan"), "NAmes not matching ");
	}

}
