package SeniorProjectTests.DrawShapes.Poly;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.model.Handle;
import com.cburch.draw.shapes.Poly;
import com.cburch.logisim.data.Location;

/*
 * 1. makes sure it returns true when given a handle
 * 2. makes sure it returns true no matter what the handle is set to
 * 3. makes sure it returns true when given null
 * 4. makes sure it does not return false when given null
 * 5. makes sure it does not return false when given any handle
 */

public class Test_draw_shapes_Poly_canMoveHandle {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//makes sure it returns true when given a handle
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Poly poly1 = new Poly(true, loclist);
		Poly poly2 = new Poly(true, loclist);
		Poly poly3 = new Poly(true, loclist);
		
		Handle handle = new Handle(poly1, 0, 0);
		
		assertEquals(true, poly1.canMoveHandle(handle));
		assertEquals(true, poly2.canMoveHandle(handle));
		assertEquals(true, poly3.canMoveHandle(handle));
		
	}
	@Test
	public void test2() {
		//makes sure it returns true no matter what the handle is set to
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Poly poly1 = new Poly(true, loclist);
		Poly poly2 = new Poly(true, loclist);
		Poly poly3 = new Poly(true, loclist);
		
		Handle handle1 = new Handle(poly1, 13, 3);
		Handle handle2 = new Handle(poly2, 77, 5);
		Handle handle3 = new Handle(poly3, 23, 0);
		
		assertEquals(true, poly1.canMoveHandle(handle1));
		assertEquals(true, poly2.canMoveHandle(handle2));
		assertEquals(true, poly3.canMoveHandle(handle3));
		
	}
	@Test
	public void test3() {
		//makes sure it returns true when given null
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Poly poly1 = new Poly(true, loclist);
		Poly poly2 = new Poly(true, loclist);
		Poly poly3 = new Poly(true, loclist);
		
		assertEquals(true, poly1.canMoveHandle(null));
		assertEquals(true, poly2.canMoveHandle(null));
		assertEquals(true, poly3.canMoveHandle(null));
	}
	@Test
	public void test4() {
		//makes sure it does not return false when given null
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Poly poly1 = new Poly(true, loclist);
		Poly poly2 = new Poly(true, loclist);
		Poly poly3 = new Poly(true, loclist);
		
		assertNotEquals(false, poly1.canMoveHandle(null));
		assertNotEquals(false, poly2.canMoveHandle(null));
		assertNotEquals(false, poly3.canMoveHandle(null));
	}
	@Test
	public void test5() {
		//makes sure it does not return false when given any handle
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Poly poly1 = new Poly(true, loclist);
		Poly poly2 = new Poly(true, loclist);
		Poly poly3 = new Poly(true, loclist);
		
		Handle handle1 = new Handle(poly1, 13, 3);
		Handle handle2 = new Handle(poly2, 77, 5);
		Handle handle3 = new Handle(poly3, 23, 0);
		
		assertNotEquals(false, poly1.canMoveHandle(handle1));
		assertNotEquals(false, poly2.canMoveHandle(handle2));
		assertNotEquals(false, poly3.canMoveHandle(handle3));
	}

}
