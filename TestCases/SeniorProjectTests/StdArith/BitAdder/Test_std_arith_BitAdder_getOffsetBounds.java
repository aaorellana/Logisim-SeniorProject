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

//not done

public class Test_std_arith_BitAdder_getOffsetBounds {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		
		AttributeSet attr = null;
		AttributeSet attr2 = null;
		AttributeSet attr3 = null;
		BitWidth width = BitWidth.create(4);
		
		Bounds test_bound = null;
		Bounds test_bound2 = null;
		Bounds test_bound3 = null;
		BitAdder adder = new BitAdder();
		BitAdder adder2 = new BitAdder();
		BitAdder adder3 = new BitAdder();
		//Attributes<V> vtest = ;
		//vtest.Attribute("helo", "world");

		//AttributeSet vtest = null;
		//vtest.setValue(vtest, Value.createKnown(width, 5));
		//attr.getAttributes();
		
		//attr.setValue(vtest, Value.createKnown(width, 10));
		
		//attr.setValue(vtest, Value.createKnown(width, 10));
		
		//attr.setValue(attr, Value.createKnown(width, 5));
		
		//attr.setValue(vtest, Value.createKnown(BitWidth.create(4), 5));
		//attr.setValue(vtest, Value.createKnown(BitWidth.create(4), 5));
		
		
		test_bound = adder.getOffsetBounds(attr);
		//test_bound2 = adder2.getOffsetBounds(attr2);
		//test_bound3 = adder3.getOffsetBounds(attr3);
		
		
		//System.out.print(adder.getDisplayName());
		//System.out.print(adder.getOffsetBounds(attr));
		//System.out.print(adder.toString());
		//fail("Not yet implemented");
	}
	@Test
	public void test2() {
		fail("Not yet implemented");
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
