package SeniorProjectTests.DrawShapes.Line;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.shapes.Line;

/*
 * 1. when the x's and y's are not the same in the lines then it returns false
 * 2. These should equal in order to return true
		 object1.x0 == input_object.x0
		 object1.y0 == input_object.x1
		 object1.x1 == input_object.y0
		 object1.y1 == input_object.y1
 * 3. when given null as an input it should return false
 */

public class Test_draw_shapes_Line_matches {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//when the x's and y's are not the same in the lines then it returns false
		Line line1 = new Line(10,15, 11, 13);
		Line line2 = new Line(9, 8, 3, 1);
		
		assertEquals(false, line1.matches(line2));
		assertEquals(false, line2.matches(line1));
		assertNotEquals(true, line1.matches(line2));
		
	}
	@Test
	public void test2() {
		/* These should equal in order to return true
		 * object1.x0 == input_object.x0
		 * object1.y0 == input_object.x1
		 * object1.x1 == input_object.y0
		 * object1.y1 == input_object.y1
		 */
		Line line1 = new Line(9, 3, 8, 1);
		Line line2 = new Line(9, 8, 3, 1);
		Line line3 = new Line(9, 3, 8, 1);
		
		assertEquals(true, line1.matches(line2));
		assertEquals(true, line2.matches(line3));
		assertNotEquals(true, line1.matches(line3));
		
	}
	@Test
	public void test3() {
		//when given null as an input it should return false
		Line line1 = new Line(9, 3, 8, 1);
		Line line2 = new Line(9, 8, 3, 1);
		Line line3 = new Line(9, 3, 8, 1);
		
		assertEquals(false, line1.matches(null));
		assertEquals(false, line2.matches(null));
		assertEquals(false, line3.matches(null));
		assertNotEquals(true, line1.matches(null));
		assertNotEquals(true, line2.matches(null));
		assertNotEquals(true, line3.matches(null));
	}

}
