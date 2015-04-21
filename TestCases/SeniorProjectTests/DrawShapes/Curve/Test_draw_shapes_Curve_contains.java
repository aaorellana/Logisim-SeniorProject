package SeniorProjectTests.DrawShapes.Curve;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.shapes.Curve;
import com.cburch.logisim.data.Location;

/*
 * 1. Paint type is stroke so when given true it should return false
 * 2. when the input is false it returns true because of the position
 * 3. checks that the return type is the correct type
 * 4. makes sure it returns the same output every time
 * 5. makes sure it returns the correct output
 */

public class Test_draw_shapes_Curve_contains {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//Paint type is stroke so when given true it should return false
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
		Location loca1 = Location.create(10, 20);
		Location loca2 = Location.create(16, 25);
		Location loca3 = Location.create(20, 30);
		
		
		Curve cur1 = new Curve(loc1, loc2, loc3);
		Curve cur2 = new Curve(loc1, loc2, loc3);
		Curve cur3 = new Curve(loca1, loca2, loca3);

		assertEquals(false, cur1.contains(loc1, true));
		assertEquals(false, cur2.contains(loc1, true));
		assertEquals(false, cur3.contains(loc1, true));
		
	}
	@Test
	public void test2() {
		//when the input is false it returns true because of the position
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
		Location loca1 = Location.create(10, 20);
		Location loca2 = Location.create(16, 25);
		Location loca3 = Location.create(20, 30);
		
		Curve cur1 = new Curve(loc1, loc2, loc3);
		Curve cur2 = new Curve(loc1, loc2, loc3);
		Curve cur3 = new Curve(loca1, loca2, loca3);
		
		assertEquals(true, cur1.contains(loc1, false));
		assertEquals(true, cur2.contains(loc1, false));
		assertEquals(true, cur3.contains(loc1, false));
		
	}
	@Test
	public void test3() {
		//checks that the return type is the correct type
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
		Location loca1 = Location.create(10, 20);
		Location loca2 = Location.create(16, 25);
		Location loca3 = Location.create(20, 30);
		
		Curve cur1 = new Curve(loc1, loc2, loc3);
		Curve cur2 = new Curve(loc1, loc2, loc3);
		Curve cur3 = new Curve(loca1, loca2, loca3);
		
		Boolean test = cur1.contains(loc1, true);
		Boolean test1 = cur2.contains(loc1, true);
		Boolean test2 = cur3.contains(loc1, true);
		
		assertEquals(false, test);
		assertEquals(false, test1);
		assertEquals(false, test2);
		
	}
	@Test
	public void test4() {
		//makes sure it returns the same output every time
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
		Location loca1 = Location.create(10, 20);
		Location loca2 = Location.create(16, 25);
		Location loca3 = Location.create(20, 30);
		
		Curve cur1 = new Curve(loc1, loc2, loc3);
		Curve cur2 = new Curve(loc1, loc2, loc3);
		Curve cur3 = new Curve(loca1, loca2, loca3);
		
		assertEquals(cur1.contains(loc1, true), cur1.contains(loc1, true));
		assertEquals(cur2.contains(loc1, true), cur2.contains(loc1, true));
		assertEquals(cur3.contains(loc1, true), cur3.contains(loc1, true));
		
	}
	@Test
	public void test5() {
		//makes sure it returns the correct output
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
		Location loca1 = Location.create(10, 20);
		Location loca2 = Location.create(16, 25);
		Location loca3 = Location.create(20, 30);
		
		Curve cur1 = new Curve(loc1, loc2, loc3);
		Curve cur2 = new Curve(loc1, loc2, loc3);
		Curve cur3 = new Curve(loca1, loca2, loca3);
		
		assertNotEquals(true, cur1.contains(loc1, true));
		assertNotEquals(false, cur2.contains(loc1, false));
		assertEquals(false, cur3.contains(loc1, true));
		assertEquals(true, cur3.contains(loc1, false));
		
	}

}
