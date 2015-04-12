package SeniorProjectTests.StdArith.BitFinder;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.logisim.data.AttributeSet;
import com.cburch.logisim.data.Bounds;
import com.cburch.logisim.std.arith.BitFinder;

/*
 * 1. checks to see if the constant output is the same every time and if null doesnt
 * 	  break the method
 * 2. checks to see if the returned object is the correct object
 * 3. check if method returns what its suppose to return
 * 4. checks if to see if the input changes the output
 * 5. checks that it returns the right variables by checking with default wrong variables
 */
public class Test_std_arith_BitFinder_getOffsetBounds_method {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//checks to see if the constant output is the same every time 
		//and if null doesnt break it
		AttributeSet attr = null;
		AttributeSet attr2 = null;
		AttributeSet attr3 = null;
		Bounds test_bound = null;
		Bounds test_bound2 = null;
		Bounds test_bound3 = null;
		BitFinder finder = new BitFinder();
		BitFinder finder2 = new BitFinder();
		BitFinder finder3 = new BitFinder();
		
		
		test_bound = finder.getOffsetBounds(attr);
		test_bound2 = finder2.getOffsetBounds(attr2);
		test_bound3 = finder3.getOffsetBounds(attr3);
		
		assertEquals(test_bound.toString(), test_bound2.toString());
		assertEquals(test_bound3.toString(), test_bound2.toString());
		assertEquals(test_bound.toString(), test_bound3.toString());
		
	}

	@Test
	public void test2() {
		//checks to see if the returned object is the correct object
		AttributeSet attr_check = null;
		AttributeSet attr = null;
		AttributeSet attr2 = null;
		AttributeSet attr3 = null;
		Bounds test_bound = null;
		Bounds test_bound2 = null;
		Bounds test_bound3 = null;
		Bounds check = null;
		BitFinder finder_check = new BitFinder();
		BitFinder finder = new BitFinder();
		BitFinder finder2 = new BitFinder();
		BitFinder finder3 = new BitFinder();
		
		check = finder_check.getOffsetBounds(attr_check);
		test_bound = finder.getOffsetBounds(attr);
		test_bound2 = finder2.getOffsetBounds(attr2);
		test_bound3 = finder3.getOffsetBounds(attr3);
		
		assertEquals(test_bound.getClass(), check.getClass());
		assertEquals(test_bound2.getClass(), check.getClass());
		assertEquals(test_bound3.getClass(), check.getClass());
		
	}
	
	@Test
	public void test3() {
		//check if method returns what its suppose to return
		AttributeSet attr = null;
		AttributeSet test_attr = null;
		AttributeSet attr2 = null;
		AttributeSet attr3 = null;
		Bounds test_bound = null;
		Bounds test_bound2 = null;
		Bounds test_bound3 = null;
		BitFinder finder = new BitFinder();
		BitFinder finder2 = new BitFinder();
		BitFinder finder3 = new BitFinder();
		BitFinder finder_test = new BitFinder();
		
		
		test_bound = finder.getOffsetBounds(attr);
		test_bound2 = finder2.getOffsetBounds(attr2);
		test_bound3 = finder3.getOffsetBounds(attr3);
		
		assertEquals(test_bound, finder_test.getOffsetBounds(test_attr));
		assertEquals(test_bound2, finder_test.getOffsetBounds(test_attr));
		assertEquals(test_bound3, finder_test.getOffsetBounds(test_attr));
		
	}
	
	@Test
	public void test4() {
		//checks if to see if the input changes the output
		AttributeSet attr = null;
		AttributeSet test_attr = null;
		AttributeSet attr2 = null;
		AttributeSet attr3 = null;
		Bounds test = null;
		Bounds test_bound = null;
		Bounds test_bound2 = null;
		Bounds test_bound3 = null;
		BitFinder finder = new BitFinder();
		BitFinder finder2 = new BitFinder();
		BitFinder finder3 = new BitFinder();
		BitFinder finder_test = new BitFinder();
		
		finder.setOffsetBounds(Bounds.create(12, 0, 5, 10));
		finder2.setOffsetBounds(Bounds.create(12, 0, 5, 10));
		finder3.setOffsetBounds(Bounds.create(12, 0, 5, 10));
		test_bound = finder.getOffsetBounds(attr);
		test_bound2 = finder2.getOffsetBounds(attr2);
		test_bound3 = finder3.getOffsetBounds(attr3);
		test = finder_test.getOffsetBounds(test_attr);
		
		assertEquals(test_bound, test);
		assertEquals(test_bound2, test);
		assertEquals(test_bound3, test);
		
		System.out.print(test_bound.toString());
		System.out.print(test_bound2.toString());
		System.out.print(test_bound3.toString());
		

		
	}
	
	@Test
	public void test5() 
	{
		AttributeSet attr = null;
		AttributeSet attr2 = null;
		AttributeSet attr3 = null;
		Bounds test_bound = null;
		Bounds test_bound2 = null;
		Bounds test_bound3 = null;
		BitFinder finder = new BitFinder();
		BitFinder finder2 = new BitFinder();
		BitFinder finder3 = new BitFinder();
		Boolean test_bool;
		
		test_bound = finder.getOffsetBounds(attr);
		test_bound2 = finder2.getOffsetBounds(attr2);
		test_bound3 = finder3.getOffsetBounds(attr3);
		
		if(Bounds.create(-41, -20, 40, 40) == test_bound)
		{
			test_bool = true;
		}
		else
		{
			test_bool = false;
		}
		if(Bounds.create(-41, -23, 40, 40) == test_bound2)
		{
			test_bool = true;
		}
		else
		{
			test_bool = false;
		}
		if(Bounds.create(0, 0, 0, 0) == test_bound3)
		{
			test_bool = true;
		}
		else
		{
			test_bool = false;
		}
		
		assertFalse(test_bool);
		
	}
}
