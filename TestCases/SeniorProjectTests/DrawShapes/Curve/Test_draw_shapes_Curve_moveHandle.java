package SeniorProjectTests.DrawShapes.Curve;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.model.Handle;
import com.cburch.draw.model.HandleGesture;
import com.cburch.draw.shapes.Curve;
import com.cburch.logisim.data.Location;

public class Test_draw_shapes_Curve_moveHandle {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
	
		Curve cur1 = new Curve(loc1, loc2, loc3);
		Curve cur2 = new Curve(loc3, loc1, loc3);
		Curve cur3 = new Curve(loc2, loc2, loc2);
		
		Handle handle1 = new Handle(cur1, 3, 2);
		Handle handle2 = new Handle(cur2, 8, 1);
		Handle handle3 = new Handle(cur3, 7, 3);
		Handle handle_test;
		
		HandleGesture handle_gesture = new HandleGesture(handle1, 13, 15, 0);
		

		handle_test = cur1.moveHandle(handle_gesture);
		
		System.out.println(handle_test.getLocation().toString());
		
		handle_test = cur2.moveHandle(handle_gesture);
		
		System.out.println(handle_test.getLocation().toString());
		
	}
	@Test
	public void test2() {
		fail("Not yet implemented");
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
