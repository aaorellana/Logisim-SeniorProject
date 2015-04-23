package SeniorProjectTests.DrawShapes.RoundRectangle;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.shapes.RoundRectangle;

/*
 * 1. rectangle1 equals rectangle2 when all points are the same
 * 2. when all points are not the same rectangle1 do not equals rectangle2
 * 3. when given null it should return false
 */

public class Test_draw_shapes_RoundRectangle_matches {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//rectangle1 equals rectangle2 when all points are the same
		RoundRectangle rect1 = new RoundRectangle(4, 5, 5, 5);
		RoundRectangle rect2 = new RoundRectangle(4, 5, 5, 5);
		
		assertEquals(true, rect1.matches(rect2));
		assertEquals(true, rect2.matches(rect1));
		
	}
	@Test
	public void test2() {
		//when all points are not the same rectangle1 do not equals rectangle2 
		RoundRectangle rect1 = new RoundRectangle(3, 10, 20, 5);
		RoundRectangle rect2 = new RoundRectangle(4, 5, 5, 5);
		RoundRectangle rect3 = new RoundRectangle(10, 8, 3, 4);
		
		assertNotEquals(true, rect1.matches(rect2));
		assertNotEquals(true, rect2.matches(rect3));
		assertNotEquals(true, rect1.matches(rect3));
		assertNotEquals(true, rect2.matches(rect1));
	}
	@Test
	public void test3() {
		//when given null it should return false
		RoundRectangle rect1 = new RoundRectangle(3, 10, 20, 5);
		RoundRectangle rect2 = new RoundRectangle(4, 5, 5, 5);
		RoundRectangle rect3 = new RoundRectangle(10, 8, 3, 4);
		
		assertEquals(false, rect1.matches(null));
		assertEquals(false, rect2.matches(null));
		assertEquals(false, rect3.matches(null));
		
	}

}
