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
 * 1. makes sure it returns the object its suppose to
 * 2. makes sure that the same positions given are returned into a list of handles
 * 3. making sure that setting false in Poly wont affect the handles
 */

public class Test_draw_shapes_Poly_getHandles {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//makes sure it returns the object its suppose to
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Poly poly1 = new Poly(true, loclist);
		Poly poly2 = new Poly(true, loclist);
		Poly poly3 = new Poly(true, loclist);
		
		assertEquals(poly1.getHandles(null).getClass(), poly2.getHandles(null).getClass());
		assertEquals(poly2.getHandles(null).getClass(), poly3.getHandles(null).getClass());
		assertEquals(poly3.getHandles(null).getClass(), poly1.getHandles(null).getClass());
	}
	@Test
	public void test2() {
		//makes sure that the same positions given are returned into a list of handles
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Poly poly1 = new Poly(true, loclist);
		
		Handle handle = new Handle(poly1, 0, 0);
		
		HandleGesture handle_gesture = new HandleGesture(handle, 13, 15, 1);
		
		assertEquals(Location.create(10, 29), poly1.getHandles(handle_gesture).get(0).getLocation());
		assertEquals(Location.create(5, 9), poly1.getHandles(handle_gesture).get(1).getLocation());
		assertEquals(Location.create(7, 3), poly1.getHandles(handle_gesture).get(2).getLocation());
	}
	@Test
	public void test3() {
		//making sure that setting false in Poly wont affect the handles
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Poly poly1 = new Poly(false, loclist);
		
		Handle handle = new Handle(poly1, 0, 0);
		
		HandleGesture handle_gesture = new HandleGesture(handle, 13, 15, 1);
		
		assertEquals(Location.create(10, 29), poly1.getHandles(handle_gesture).get(0).getLocation());
		assertEquals(Location.create(5, 9), poly1.getHandles(handle_gesture).get(1).getLocation());
		assertEquals(Location.create(7, 3), poly1.getHandles(handle_gesture).get(2).getLocation());
	}

}
