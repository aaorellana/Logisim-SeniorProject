package SeniorProjectTests.StdArith.Arithmetic;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.logisim.std.arith.Arithmetic;

/*
 * 1. checks that the constant returned doesnt change
 * 2. checks that the type returned is the type its return to return
 */

public class Test_std_arith_Arithmetic_getName {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//checks that the constant returned doesnt change
		Arithmetic metic1 = new Arithmetic();
		Arithmetic metic2 = new Arithmetic();
		
		assertEquals(metic1.getName(), metic2.getName());
		assertEquals("Arithmetic", metic1.getName());
		assertNotEquals("Arithmet", metic1.getName());
		assertNotEquals("A", metic1.getName());

	}
	@Test
	public void test2() {
		//checks that the type returned is the type its return to return
		Arithmetic metic = new Arithmetic();
		
		String test;
		
		test = metic.getName();
		
		assertEquals(test, metic.getName());
		assertNotEquals(1, metic.getName());
		assertNotEquals(true, metic.getName());
	}
	

}
