package SeniorProjectTests.DrawShapes.Curve;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.model.Handle;
import com.cburch.draw.model.HandleGesture;
import com.cburch.draw.shapes.Curve;
import com.cburch.logisim.data.Location;

/*
 * 1. makes sure that its returns the same object every time
 * 2. makes sure the correct handle is placed inside a list
 * 3. makes sure that the x and y values are not switch around when 
 *    placing the handle on the list
 */

public class Test_draw_shapes_Curve_getHandles {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//makes sure that its returns the same object every time
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
	
		Curve cur1 = new Curve(loc1, loc2, loc3);
		Curve cur2 = new Curve(loc1, loc2, loc3);
		Curve cur3 = new Curve(loc1, loc2, loc3);
		
		
		assertEquals(cur1.getHandles(null).getClass(), cur2.getHandles(null).getClass());
		assertEquals(cur2.getHandles(null).getClass(), cur3.getHandles(null).getClass());
		assertEquals(cur1.getHandles(null).getClass(), cur3.getHandles(null).getClass());
		
	}
	@Test
	public void test2() {
		//makes sure the correct handle is placed inside a list
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
	
		Curve cur1 = new Curve(loc1, loc2, loc3);

		
		Handle handle = new Handle(cur1, 0, 0);
		
		HandleGesture handle_gesture = new HandleGesture(handle, 13, 15, 1);
		
		assertEquals(10, cur1.getHandles(handle_gesture).get(0).getX());
		assertEquals(20, cur1.getHandles(handle_gesture).get(0).getY());
		assertEquals(20, cur1.getHandles(handle_gesture).get(1).getX());
		assertEquals(30, cur1.getHandles(handle_gesture).get(1).getY());
		assertEquals(15, cur1.getHandles(handle_gesture).get(2).getX());
		assertEquals(25, cur1.getHandles(handle_gesture).get(2).getY());
		
	}
	@Test
	public void test3() {
		//makes sure that the x and y values are not switch around when 
		//placing the handle on the list
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
	
		Curve cur1 = new Curve(loc1, loc2, loc3);
		
		Handle handle = new Handle(cur1, 0, 0);
		
		HandleGesture handle_gesture = new HandleGesture(handle, 13, 15, 1);
		
		assertNotEquals(20, cur1.getHandles(handle_gesture).get(0).getX());
		assertNotEquals(10, cur1.getHandles(handle_gesture).get(0).getY());
		assertNotEquals(30, cur1.getHandles(handle_gesture).get(1).getX());
		assertNotEquals(20, cur1.getHandles(handle_gesture).get(1).getY());
		assertNotEquals(25, cur1.getHandles(handle_gesture).get(2).getX());
		assertNotEquals(15, cur1.getHandles(handle_gesture).get(2).getY());

	}


}
