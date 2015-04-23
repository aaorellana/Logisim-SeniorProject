package SeniorProjectTests.DrawShapes.Rectangle;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.shapes.Curve;
import com.cburch.draw.shapes.Rectangle;
import com.cburch.logisim.data.Location;

/*
 * 1. returns true when the object given is the the same as itself
 * 	  tests the if statement
 * 2. returns false when the object given is not the same as itself
 * 	  tests the else statement
 * 3. if given null it should return false
 */

public class Test_draw_shapes_Rectange_matches {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {	
		//returns true when the object given is the the same as itself
		//tests the if statement
		Rectangle rect1 = new Rectangle(10, 10, 10, 10);
		Rectangle rect2 = new Rectangle(10, 10, 10, 10);
		Rectangle rect3 = new Rectangle(10, 10, 10, 10);
		
		assertEquals(true, rect1.matches(rect2));
		assertEquals(true, rect1.matches(rect3));
		assertEquals(true, rect2.matches(rect3));
		assertEquals(true, rect2.matches(rect1));
		assertEquals(true, rect3.matches(rect1));
		assertEquals(true, rect3.matches(rect2));
		
	}
	@Test
	public void test2() {
		//returns false when the object given is not the same as itself
		//tests the else statement
		Location loc1 = Location.create(10, 10);
		Location loc2 = Location.create(23, 33);
		Location loc3 = Location.create(56, 45);
		
		Rectangle rect1 = new Rectangle(10, 10, 10, 10);
		Rectangle rect2 = new Rectangle(10, 10, 10, 10);
		Rectangle rect3 = new Rectangle(10, 10, 10, 10);
		Curve cur1 = new Curve(loc1, loc2, loc3);
		
		assertEquals(false, rect1.matches(cur1));
		assertEquals(false, rect2.matches(cur1));
		assertEquals(false, rect3.matches(cur1));
		
	}
	@Test
	public void test3() {
		//if given null it should return false
		Rectangle rect1 = new Rectangle(10, 10, 10, 10);
		Rectangle rect2 = new Rectangle(10, 10, 10, 10);
		Rectangle rect3 = new Rectangle(10, 10, 10, 10);
		
		assertEquals(false, rect1.matches(null));
		assertEquals(false, rect2.matches(null));
		assertEquals(false, rect3.matches(null));
		
	}

}
