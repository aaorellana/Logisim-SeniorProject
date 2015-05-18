package SeniorProjectTests.DrawShapes.Curve;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.model.Handle;
import com.cburch.draw.model.HandleGesture;
import com.cburch.draw.shapes.Curve;
import com.cburch.logisim.data.Location;
//method is not actually used make sure to check back before finishing the project
/*
 * 1. makes sure that the method returns modified values
 * 2. makes sure it returns the correct object
 * 3. 
 * 4.
 * 5.
 */

public class Test_draw_shapes_Curve_moveHandle {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//makes sure that the method returns the correct values
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
	
		Curve cur1 = new Curve(loc1, loc2, loc3);
		
		Handle handle1 = new Handle(cur1, 3, 2);
		Handle handle_test = new Handle(cur1, 3, 5);
		Handle handle_test1 = new Handle(cur1, 3, 5);
		Handle handle_test2 = new Handle(cur1, 3, 5);
		Handle handle_test3 = new Handle(cur1, 3, 5);
		
		HandleGesture handle_gesture = new HandleGesture(handle1, 1, 1, 0);

		handle_test = cur1.moveHandle(handle_gesture);
		
		//handle_test.getLocation() should return (15, 25)
		assertNotEquals(handle_test1.getLocation(), handle_test.getLocation());
		assertNotEquals(handle_test2.getLocation(), handle_test.getLocation());
		assertNotEquals(handle_test3.getLocation(), handle_test.getLocation());
		
	}
	@Test
	public void test2() {
		//makes sure that the method returns modified values
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
	
		Curve cur1 = new Curve(loc1, loc2, loc3);
		Curve cur2 = new Curve(loc3, loc1, loc3);
		Curve cur3 = new Curve(loc2, loc2, loc2);
		
		Handle handle1 = new Handle(cur1, 3, 2);
		
		HandleGesture handle_gesture = new HandleGesture(handle1, 1, 1, 0);

		cur1.moveHandle(handle_gesture);
		cur2.moveHandle(handle_gesture);
		cur3.moveHandle(handle_gesture);
		
		assertEquals(cur1.moveHandle(handle_gesture).getClass(), cur2.moveHandle(handle_gesture).getClass());
		assertEquals(cur3.moveHandle(handle_gesture).getClass(), cur2.moveHandle(handle_gesture).getClass());
		assertEquals(cur1.moveHandle(handle_gesture).getClass(), cur3.moveHandle(handle_gesture).getClass());
	}
	@Test
	public void test3() {
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
	
		Curve cur1 = new Curve(loc1, loc2, loc3);
		
		Handle handle1 = new Handle(cur1, 3, 2);
		Handle handle_test = new Handle(cur1, 3, 5);
		Handle handle_test1 = new Handle(cur1, 3, 5);
		Handle handle_test2 = new Handle(cur1, 3, 5);
		Handle handle_test3 = new Handle(cur1, 3, 5);
		
		HandleGesture handle_gesture = new HandleGesture(handle1, 1, 1, 0);

		handle_test = cur1.moveHandle(handle_gesture);
		
		//System.out.println(cur1.getEnd1());
		
		//System.out.println(cur1.moveHandle(handle_gesture).getLocation());
		
	}
	@Test
	public void test4() {
		//
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
	
		Curve cur1 = new Curve(loc1, loc2, loc3);
		
		Handle handle1 = new Handle(cur1, 0, 0);
		Handle handle_test = new Handle(cur1, 3, 5);
		Handle handle_test1 = new Handle(cur1, 3, 5);
		Handle handle_test2 = new Handle(cur1, 3, 5);
		Handle handle_test3 = new Handle(cur1, 3, 5);
		
		HandleGesture handle_gesture = new HandleGesture(handle1, 0, 0, 1);
		
		//System.out.println(cur1.getEnd0());
		//System.out.println(cur1.getEnd1());
		//System.out.println(cur1.getControl());
		System.out.println(cur1.getBounds());
		handle_test = cur1.moveHandle(handle_gesture);
		System.out.println();
		System.out.println(cur1.getBounds());
		System.out.println(handle_test.getLocation());
		//System.out.println(cur1.getEnd0());
		//System.out.println(cur1.getEnd1());
		//System.out.println(cur1.getControl());
	}
	@Test
	public void test5() {
		fail("Not yet implemented");
	}

}
