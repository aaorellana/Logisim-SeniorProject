package SeniorProjectTests.DrawShapes.Curve;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.shapes.Curve;
import com.cburch.logisim.data.Location;

/*
 * 1. tests that it matches the position correctly in the middle location
 * 2. makes sure the method returns false when matches is given null
 * 3. the method should return false when the input is null
 * 4. tests that it matches the position correctly in the first location
 * 5. tests that it matches the position correctly in the third location
 */

public class Test_draw_shapes_Curve_matches {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Test
	public void test1() {
		//tests that it matches the positions correctly in the middle location
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
		Location loca1 = Location.create(10, 20);
		Location loca2 = Location.create(16, 25);
		Location loca3 = Location.create(20, 30);
		
		
		Curve cur1 = new Curve(loc1, loc2, loc3);
		Curve cur2 = new Curve(loc1, loc2, loc3);
		Curve cur3 = new Curve(loca1, loca2, loca3);
		Curve cur4 = new Curve(loca2, loc2, loca3);
		
		assertEquals(true, cur1.matches(cur2));
		assertNotEquals(true, cur1.matches(cur3));
		assertNotEquals(true, cur1.matches(cur4));

		
	}
	@Test
	public void test2() {
		//makes sure the method returns false when matches is given null
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
		Location loca1 = Location.create(10, 20);
		Location loca2 = Location.create(16, 25);
		Location loca3 = Location.create(20, 30);
		
		
		Curve cur1 = new Curve(loc1, loc2, loc3);
		Curve cur2 = new Curve(loc1, loc2, loc3);
		Curve cur3 = new Curve(loca1, loca2, loca3);
		Curve cur4 = new Curve(loca2, loc2, loca3);
		
		assertEquals(false, cur1.matches(null));
		assertEquals(false, cur2.matches(null));
		assertEquals(false, cur3.matches(null));
		assertEquals(false, cur4.matches(null));
		
	}
	@Test
	public void test3() {
		//the method should return false when the input is null
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
		Location loca1 = Location.create(10, 20);
		Location loca2 = Location.create(16, 25);
		Location loca3 = Location.create(20, 30);
		
		Curve cur1 = new Curve(loc1, loc2, loc3);
		Curve cur2 = new Curve(loc1, loc2, loc3);
		Curve cur3 = new Curve(loca1, loca2, loca3);
		Curve cur4 = new Curve(loca2, loc2, loca3);

		assertEquals(false, cur1.matches(null));
		assertEquals(false, cur2.matches(null));
		assertNotEquals(true, cur3.matches(null));
		assertNotEquals(true, cur4.matches(null));
		
		
	}
	@Test
	public void test4() {
		//tests that it matches the position correctly in the first location
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
		Location loca1 = Location.create(5, 21);
		Location loca2 = Location.create(15, 25);
		Location loca3 = Location.create(20, 30);
		
		
		Curve cur1 = new Curve(loc1, loc2, loc3);
		Curve cur2 = new Curve(loc1, loc2, loc3);
		Curve cur3 = new Curve(loca1, loca2, loca3);
		Curve cur4 = new Curve(loca1, loca2, loca3);
		
		assertEquals(true, cur1.matches(cur2));
		assertNotEquals(true, cur1.matches(cur3));
		assertNotEquals(true, cur1.matches(cur4));
		
		
		
	}
	@Test
	public void test5() {
		//tests that it matches the position correctly in the third location
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
		Location loca1 = Location.create(10, 2);
		Location loca2 = Location.create(15, 25);
		Location loca3 = Location.create(171, 328);
		
		
		Curve cur1 = new Curve(loc1, loc2, loc3);
		Curve cur2 = new Curve(loc1, loc2, loc3);
		Curve cur3 = new Curve(loca1, loca2, loca3);
		Curve cur4 = new Curve(loca1, loca2, loca3);
		
		assertEquals(true, cur1.matches(cur2));
		assertNotEquals(true, cur1.matches(cur3));
		assertNotEquals(true, cur1.matches(cur4));
	}


}
