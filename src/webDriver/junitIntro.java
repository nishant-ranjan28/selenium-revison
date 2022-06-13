package webDriver;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class junitIntro {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("executed before call..");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("executed after call...");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("executed before.. ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("executed after ...");
	}

	@Test
	public void test() {
		System.out.println("executed test 1");
	}

	@Test
	public void test2() {
		System.out.println("execurted test 2");
	}

}
