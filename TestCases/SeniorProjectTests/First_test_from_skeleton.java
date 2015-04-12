package SeniorProjectTests;
import static org.junit.Assert.*;


import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.logisim.data.Value;
import com.cburch.logisim.data.BitWidth;

/*
 * Types of tests:
 * 1. check to see if the output is the same when using the same variables
 * 2. check to see if the the returned object is the right object
 * 3. check if method returns what its suppose to return
 * 4. check to see if the wrong bit width is used
 * 5. checks if the wrong input is given to the method
 */

public class First_test_from_skeleton {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void test1() {
		//checks if the output is the same when the input is also the same
		BitWidth width = BitWidth.create(4);
		Value value1 = Value.createKnown(width, 5);
		Value value2 = Value.createKnown(width, 1);
		Value valuec_in = Value.createKnown(width,1);
		Value[] result1;
		Value[] result2;
		Value[] result3;

		result1 = computeSum(width, value1, value2, valuec_in);
		result2 = computeSum(width, value1, value2, valuec_in);
		result3 = computeSum(width, value1, value2, valuec_in);
		
		assertEquals(result1, result2);
		assertEquals(result3, result2);
		assertEquals(result1, result3);

	}
	
	@Test
	public void test2() {
	//checks to see if the returned object is the same object its suppose to return
		BitWidth width = BitWidth.create(4);
		BitWidth width2 = BitWidth.create(5);
		int bits = 3;
		Value value1 = Value.createKnown(width2, 5);
		Value value2 = Value.createKnown(width, 3);
		Value valuec_in = Value.createKnown(width,1);
		Value[] result1;
		Value[] result2 = new Value[bits];
		Value[] result3 = new Value[bits];

		result1 = computeSum(width2, value1, value2, valuec_in);
		
		assertEquals(result1.getClass(), result2.getClass());
		assertEquals(result1.getClass(), result3.getClass());


	}
	
	@Test
	public void test3() {
		//tests to see if its outputs the correct output according to its input
		Value value1 = Value.createKnown(BitWidth.create(4), 10);
		Value value2 = Value.createKnown(BitWidth.create(6), 0);
		Value value3 = Value.createKnown(BitWidth.create(4), 5);
		Value value4 = Value.createKnown(BitWidth.create(6), 2);
		Value valuec_in = Value.createKnown(BitWidth.create(4), 0);
		Value[] result1;
		Value[] result2;

		result1 = computeSum(BitWidth.create(8), value1, value2, valuec_in);
		result2 = computeSum(BitWidth.create(8), value3, value4, valuec_in);
		
		assertEquals(result1[0].toIntValue(), 10);
		assertEquals(result2[0].toIntValue(), 7);

	}
	
	@Test
	public void test4() {
		//tests the bit width, the answer is correct but the bit width is not
		boolean test;
		BitWidth width = BitWidth.create(4);
		BitWidth width1 = BitWidth.create(3);
		Value value1 = Value.createKnown(width, 5);
		Value value2 = Value.createKnown(width, 5);
		Value valuec_in = Value.createKnown(width,0);
		Value[] result1;

		result1 = computeSum(width1, value1, value2, valuec_in);
		
		//System.out.print(result1[0].toIntValue() + "; ");
		if(width == width1)
		{
			test = true;
		}
		else
		{
			test = false;
		}
		//width is not what it should be in the method 
		//the returned value should be 2 but the correct
		//number is 10 since the bits where cut off it returned 2 instead
		assertFalse(test);
		assertEquals(result1[0].toIntValue(), 2);

	}
	
	@Test
	public void test5() {
		//checks if the wrong input was given
		BitWidth width = BitWidth.create(4);
		Value value1 = Value.createKnown(width, 5);
		Value value2 = Value.createKnown(width, 1);
		Value valuec_in = Value.createKnown(width,0);
		
		try
		{
			computeSum(width, null, value2, valuec_in);
		}
		catch(NullPointerException e)
		{
			System.out.print("Test 5 from first_test_from_skeleton Given the wrong input: " + e + "\n");
		}
		
		try
		{
			computeSum(width, value1, value2, null);
		}
		catch(NullPointerException e)
		{
			System.out.print("Test 5 from first_test_from_skeleton Given the wrong input: " + e + "\n");
		}
		
		try
		{
			computeSum(width, null, value2, valuec_in);
		}
		catch(NullPointerException e)
		{
			System.out.print("Test 5 from first_test_from_skeleton Given the wrong input: " + e + "\n");
		}
		
	}
	
	
	static Value[] computeSum(BitWidth width, Value a, Value b, Value c_in) {
        int w = width.getWidth();
        if (c_in == Value.UNKNOWN || c_in == Value.NIL) {
            c_in = Value.FALSE;
        }

        if (a.isFullyDefined() && b.isFullyDefined() && c_in.isFullyDefined()) {
            if (w >= 32) {
                long mask = (1L << w) - 1;
                long ax = a.toIntValue() & mask;
                long bx = b.toIntValue() & mask;
                long cx = c_in.toIntValue() & mask;
                long sum = ax + bx + cx;
                return new Value[] { Value.createKnown(width, (int) sum),
                    ((sum >> w) & 1) == 0 ? Value.FALSE : Value.TRUE };
            } else {
                int sum = a.toIntValue() + b.toIntValue() + c_in.toIntValue();
                return new Value[] { Value.createKnown(width, sum),
                    ((sum >> w) & 1) == 0 ? Value.FALSE : Value.TRUE };
            }
        } else {
            Value[] bits = new Value[w];
            Value carry = c_in;
            for (int i = 0; i < w; i++) {
                if (carry == Value.ERROR) {
                    bits[i] = Value.ERROR;
                } else if (carry == Value.UNKNOWN) {
                    bits[i] = Value.UNKNOWN;
                } else {
                    Value ab = a.get(i);
                    Value bb = b.get(i);
                    if (ab == Value.ERROR || bb == Value.ERROR) {
                        bits[i] = Value.ERROR;
                        carry = Value.ERROR;
                    } else if (ab == Value.UNKNOWN || bb == Value.UNKNOWN) {
                        bits[i] = Value.UNKNOWN;
                        carry = Value.UNKNOWN;
                    } else {
                        int sum = (ab == Value.TRUE ? 1 : 0)
                            + (bb == Value.TRUE ? 1 : 0)
                            + (carry == Value.TRUE ? 1 : 0);
                        bits[i] = (sum & 1) == 1 ? Value.TRUE : Value.FALSE;
                        carry = (sum >= 2) ? Value.TRUE : Value.FALSE;
                    }
                }
            }
            return new Value[] { Value.create(bits), carry };
        }
    }
	
}

/*
System.out.print(value1.toString()+ "; ");
for(int i = 0; i < result1.length; i++)
{
	System.out.println(result1[i].toString() + "; ");
}
System.out.println(result1[1].toString() + "; ");
*/

/*
System.out.print(value1.toHexString() + "; ");
System.out.print(value2.toHexString() + "; ");
System.out.print(valuec_in.toHexString() + "; ");
System.out.print(width.toString() + "; ");
System.out.print(width2.toString() + "; ");
System.out.print(result1.toString());
*/