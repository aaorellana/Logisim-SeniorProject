package SeniorProjectTests.StdArith.BitAdder;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.logisim.data.Attribute;
import com.cburch.logisim.data.AttributeSet;
import com.cburch.logisim.data.BitWidth;
import com.cburch.logisim.data.Bounds;
import com.cburch.logisim.data.Value;
import com.cburch.logisim.instance.StdAttr;
import com.cburch.logisim.std.arith.BitAdder;
import com.cburch.logisim.std.arith.BitFinder;

/*
 * 1. throws an error when given null as a input
 * 2.
 * 3.
 * 4.
 * 5.
 */
//not done

public class Test_std_arith_BitAdder_getOffsetBounds {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//makes sure that an exception is thrown when given null as an input
		BitAdder adder = new BitAdder();
		BitAdder adder2 = new BitAdder();
		BitAdder adder3 = new BitAdder();

		try
		{
			adder.getOffsetBounds(null);
		}
		catch(NullPointerException e)
		{
			System.out.println("Test 1 in StdArith BitAdder getOffsetBounds: " + e);
		}
		try
		{
			adder2.getOffsetBounds(null);
		}
		catch(NullPointerException e)
		{
			System.out.println("Test 1 in StdArith BitAdder getOffsetBounds: " + e);
		}
		try
		{
			adder3.getOffsetBounds(null);
		}
		catch(NullPointerException e)
		{
			System.out.println("Test 1 in StdArith BitAdder getOffsetBounds: " + e);
		}
	}
	@Test
	public void test2() {
		BitAdder adder = new BitAdder();
		BitAdder adder2 = new BitAdder();
		BitAdder adder3 = new BitAdder();
		AttributeSet atrs = null;
		
		//adder2.getOffsetBounds(atrs);
		
	}
	@Test
	public void test3() {
		fail("Not yet implemented");
	}
	@Test
	public void test4() {
		fail("Not yet implemented");
	}
	@Test
	public void test5() {
		fail("Not yet implemented");
	}
}
