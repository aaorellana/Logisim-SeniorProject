package SeniorProjectTests.DrawShapes.Line;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.shapes.Line;
import com.cburch.logisim.data.Location;

/*
 * 1. Makes sure that the line is surrounded by the points
 * 2. makes sure that the boolean parameter does not affect the result
 * 3. makes sure that points that do not surround the line show up as true
 * 4. makes sure that points that do not surround the line show up as true
 * 	  even with the boolean parameter changed
 * 5. Throws an error when given null to the location parameter
 */

public class Test_draw_shapes_Line_contains {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//Makes sure that the line is surrounded by the points
		//in other words making sure that the points contain the line
		Line line1 = new Line(2, 2, 3, 3);
		
		assertEquals(true, line1.contains(Location.create(1, 1), true));
		assertEquals(true, line1.contains(Location.create(1, 2), true));
		assertEquals(true, line1.contains(Location.create(3, 2), true));
		assertEquals(true, line1.contains(Location.create(4, 4), true));
		
	}
	@Test
	public void test2() {
		//makes sure that the boolean parameter does not affect the result
		Line line1 = new Line(2, 2, 3, 3);
		
		assertEquals(true, line1.contains(Location.create(1, 1), true));
		assertEquals(true, line1.contains(Location.create(1, 2), true));
		assertEquals(true, line1.contains(Location.create(3, 2), true));
		assertEquals(true, line1.contains(Location.create(4, 4), true));

		assertEquals(true, line1.contains(Location.create(1, 1), false));
		assertEquals(true, line1.contains(Location.create(1, 2), false));
		assertEquals(true, line1.contains(Location.create(3, 2), false));
		assertEquals(true, line1.contains(Location.create(4, 4), false));
	}
	@Test
	public void test3() {
		//makes sure that points that do not surround the line show up as true
		Line line1 = new Line(2, 2, 3, 3);
		
		assertNotEquals(true, line1.contains(Location.create(6, 6), true));
		assertNotEquals(true, line1.contains(Location.create(0, 0), true));
		assertNotEquals(true, line1.contains(Location.create(1, 4), true));
		assertNotEquals(true, line1.contains(Location.create(4, 1), true));
	}
	@Test
	public void test4() {
		//makes sure that points that do not surround the line show up as true
		//even with the boolean parameter changed
		Line line1 = new Line(2, 2, 3, 3);
		
		assertNotEquals(true, line1.contains(Location.create(6, 6), true));
		assertNotEquals(true, line1.contains(Location.create(0, 0), true));
		assertNotEquals(true, line1.contains(Location.create(1, 4), true));
		assertNotEquals(true, line1.contains(Location.create(4, 1), true));
		
		assertNotEquals(true, line1.contains(Location.create(6, 6), false));
		assertNotEquals(true, line1.contains(Location.create(0, 0), false));
		assertNotEquals(true, line1.contains(Location.create(1, 4), false));
		assertNotEquals(true, line1.contains(Location.create(4, 1), false));
	}
	@Test
	public void test5() {
		//Throws an error when given null to the location parameter
		Line line1 = new Line(2, 2, 3, 3);
		
		try
		{
			System.out.println(line1.contains(null, false));
		}
		catch(NullPointerException e)
		{
			System.out.println("Test 5 in DrawShapes Line contains: " + e + ", Location expected, given null instead");
		}
		try
		{
			System.out.println(line1.contains(null, true));
		}
		catch(NullPointerException e)
		{
			System.out.println("Test 5 in DrawShapes Line contains: " + e + ", Location expected, given null instead");
		}
	}

}
