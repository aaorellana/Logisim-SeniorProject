package SeniorProjectTests.DrawShapes.Poly;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.model.Handle;
import com.cburch.draw.model.HandleGesture;
import com.cburch.draw.shapes.Poly;
import com.cburch.logisim.data.Location;

/*
 * 1. makes sure it returns null when given a gesture
 * 2. makes sure it returns null when given a gesture
 * 3. makes sure it returns null when given null
 */

public class Test_draw_shapes_Poly_moveHandles {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//makes sure it returns null when given a gesture
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Poly poly1 = new Poly(true, loclist);
		Poly poly2 = new Poly(true, loclist);
		Poly poly3 = new Poly(true, loclist);
		
		Handle handle = new Handle(poly1, 0, 0);
		
		HandleGesture handle_gesture = new HandleGesture(handle, 13, 15, 1);
		
		assertEquals(null, poly1.moveHandle(handle_gesture));
		assertEquals(null, poly2.moveHandle(handle_gesture));
		assertEquals(null, poly3.moveHandle(handle_gesture));
		
	}
	@Test
	public void test2() {
		//makes sure it returns null when given a gesture
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Poly poly1 = new Poly(true, loclist);
		
		Handle handle = new Handle(poly1, 0, 0);
		
		HandleGesture handle_gesture1 = new HandleGesture(handle, 1, 93, 41);
		HandleGesture handle_gesture2 = new HandleGesture(handle, 3, 76, 12);
		HandleGesture handle_gesture3 = new HandleGesture(handle, 445, 61, 3);
		
		assertEquals(null, poly1.moveHandle(handle_gesture1));
		assertEquals(null, poly1.moveHandle(handle_gesture2));
		assertEquals(null, poly1.moveHandle(handle_gesture3));

	}
	@Test
	public void test3() {
		//makes sure it returns null when given null
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Poly poly1 = new Poly(true, loclist);
		Poly poly2 = new Poly(true, loclist);
		Poly poly3 = new Poly(true, loclist);
		
		assertEquals(null, poly1.moveHandle(null));
		assertEquals(null, poly2.moveHandle(null));
		assertEquals(null, poly3.moveHandle(null));
		
	}

}
