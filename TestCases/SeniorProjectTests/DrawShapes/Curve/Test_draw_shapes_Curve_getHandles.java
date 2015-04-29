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
 * 2.
 * 3.
 * 4.
 * 5.
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
		
		Handle handle = new Handle(cur1, 0, 0);
		
		HandleGesture handle_gesture = new HandleGesture(handle, 13, 15, 1);
		
		assertEquals(cur1.getHandles(null).getClass(), cur2.getHandles(null).getClass());
		assertEquals(cur2.getHandles(null).getClass(), cur3.getHandles(null).getClass());
		assertEquals(cur1.getHandles(null).getClass(), cur3.getHandles(null).getClass());
		
	}
	@Test
	public void test2() {
		//
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
	
		Curve cur1 = new Curve(loc1, loc2, loc3);
		Curve cur2 = new Curve(loc1, loc2, loc3);
		Curve cur3 = new Curve(loc1, loc2, loc3);
		
		Handle handle = new Handle(cur1, 0, 0);
		
		HandleGesture handle_gesture = new HandleGesture(handle, 13, 15, 1);
		
		//System.out.println(ges.toString());
		//System.out.println(cur1.getHandles(null));
		assertEquals(cur1.getHandles(null), cur1.getHandles(handle_gesture));
		//System.out.println(cur1.getHandles(handle_gesture));
		
	}
	@Test
	public void test3() {
		fail("Not yet implemented");
	}
	@Test
	public void test4() {
		fail("Not yet implemented");
	}
	@Test
	public void test5() {
		fail("Not yet implemented");
	}

}
