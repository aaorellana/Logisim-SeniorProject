package SeniorProjectTests.StdBase.Base;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.logisim.std.base.Base;
/*
 * 1. checks that the constant returned doesnt change
 * 2. checks that the type returned is the type its return to return
 */

public class Test_std_base_Base_getName {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//checks that the constant returned doesnt change
		Base bas1 = new Base();
		Base bas2 = new Base();
		
		assertEquals("Base", bas1.getName());
		assertEquals("Base", bas2.getName());
		assertEquals(bas1.getName(), bas2.getName());
	}
	@Test
	public void test2() {
		//checks that the type returned is the type its return to return
		Base bas1 = new Base();
		Base bas2 = new Base();
		Base test_bas = new Base();
		
		String test = test_bas.getName();
		
		assertEquals(bas1.getName(), bas2.getName());
		assertEquals(test, bas1.getName());
		assertNotEquals(1, bas1.getName());
		assertNotEquals(true, bas1.getName());
	}

}
