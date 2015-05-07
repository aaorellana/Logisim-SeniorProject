package SeniorProjectTests.DrawShapes.Poly;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.shapes.Poly;
import com.cburch.logisim.data.Location;

/*
 * 1. makes sure it returns false when given null
 * 2. makes sure it does not return true when given null
 * 3. when compared to itself it should return true
 * 4. makes sure that when compared to itself it does not return false
 * 5. when boolean is set to false and compared to itself it should return true
 * 	  because the boolean is not used in this method
 * 6. when boolean is set to false and compared to itself it should not return false
 * 	  because the boolean is not used in this method
 */

public class Test_draw_shapes_Poly_matches {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//makes sure it returns false when given null
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Poly poly1 = new Poly(true, loclist);
		Poly poly2 = new Poly(true, loclist);
		Poly poly3 = new Poly(true, loclist);
		
		assertEquals(false, poly1.matches(null));
		assertEquals(false, poly2.matches(null));
		assertEquals(false, poly3.matches(null));
		
	}
	@Test
	public void test2() {
		//makes sure it does not return true when given null
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Poly poly1 = new Poly(true, loclist);
		Poly poly2 = new Poly(true, loclist);
		Poly poly3 = new Poly(true, loclist);
		
		assertNotEquals(true, poly1.matches(null));
		assertNotEquals(true, poly2.matches(null));
		assertNotEquals(true, poly3.matches(null));
		
	}
	@Test
	public void test3() {
		//when compared to itself it should return true
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Poly poly1 = new Poly(true, loclist);
		Poly poly2 = new Poly(true, loclist);
		Poly poly3 = new Poly(true, loclist);
		
		assertEquals(true, poly1.matches(poly1));
		assertEquals(true, poly2.matches(poly2));
		assertEquals(true, poly3.matches(poly3));
		
	}
	@Test
	public void test4() {
		//makes sure that when compared to itself it does not return false
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Poly poly1 = new Poly(true, loclist);
		Poly poly2 = new Poly(true, loclist);
		Poly poly3 = new Poly(true, loclist);
		
		assertNotEquals(false, poly1.matches(poly1));
		assertNotEquals(false, poly2.matches(poly2));
		assertNotEquals(false, poly3.matches(poly3));
	}	
	@Test
	public void test5() {
		//when boolean is set to false and compared to itself it should return true
		//because the boolean is not used in this method
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Poly poly1 = new Poly(false, loclist);
		Poly poly2 = new Poly(false, loclist);
		Poly poly3 = new Poly(false, loclist);
		
		assertEquals(true, poly1.matches(poly1));
		assertEquals(true, poly2.matches(poly2));
		assertEquals(true, poly3.matches(poly3));
		
	}
	@Test
	public void test6() {
		//when boolean is set to false and compared to itself it should not return false
		//because the boolean is not used in this method
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Poly poly1 = new Poly(false, loclist);
		Poly poly2 = new Poly(false, loclist);
		Poly poly3 = new Poly(false, loclist);
		
		assertNotEquals(false, poly1.matches(poly1));
		assertNotEquals(false, poly2.matches(poly2));
		assertNotEquals(false, poly3.matches(poly3));
		
	}

}
