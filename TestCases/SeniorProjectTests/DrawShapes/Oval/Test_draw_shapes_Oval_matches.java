package SeniorProjectTests.DrawShapes.Oval;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.shapes.Curve;
import com.cburch.draw.shapes.Oval;
import com.cburch.logisim.data.Location;

/*
 * 1. returns true when the object given is the the same as itself
 * 	  tests the if statement
 * 2. returns false when the object given is not the same as itself
 * 	  tests the else statement
 * 3. if given null it should return false
 */

public class Test_draw_shapes_Oval_matches {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {	
		//returns true when the object given is the the same as itself
		//tests the if statement
		Oval oval1 = new Oval(10, 10, 10, 10);
		Oval oval2 = new Oval(10, 10, 10, 10);
		Oval oval3 = new Oval(10, 10, 10, 10);
		
		assertEquals(true, oval1.matches(oval2));
		assertEquals(true, oval1.matches(oval3));
		assertEquals(true, oval2.matches(oval3));
		assertEquals(true, oval2.matches(oval1));
		assertEquals(true, oval3.matches(oval1));
		assertEquals(true, oval3.matches(oval2));
		
	}
	@Test
	public void test2() {
		//returns false when the object given is not the same as itself
		//tests the else statement
		Location loc1 = Location.create(10, 10);
		Location loc2 = Location.create(23, 33);
		Location loc3 = Location.create(56, 45);
		
		Oval oval1 = new Oval(10, 10, 10, 10);
		Oval oval2 = new Oval(10, 10, 10, 10);
		Oval oval3 = new Oval(10, 10, 10, 10);
		Curve cur1 = new Curve(loc1, loc2, loc3);
		
		assertEquals(false, oval1.matches(cur1));
		assertEquals(false, oval2.matches(cur1));
		assertEquals(false, oval3.matches(cur1));
		
	}
	@Test
	public void test3() {
		//if given null it should return false
		Oval oval1 = new Oval(10, 10, 10, 10);
		Oval oval2 = new Oval(10, 10, 10, 10);
		Oval oval3 = new Oval(10, 10, 10, 10);
		
		assertEquals(false, oval1.matches(null));
		assertEquals(false, oval2.matches(null));
		assertEquals(false, oval3.matches(null));
		
	}

}
