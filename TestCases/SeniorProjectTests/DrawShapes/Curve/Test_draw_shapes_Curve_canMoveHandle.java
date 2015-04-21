package SeniorProjectTests.DrawShapes.Curve;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.model.Handle;
import com.cburch.draw.shapes.Curve;
import com.cburch.logisim.data.Location;

/*
 * 1. makes sure that its returns true at all times
 * 2. makes sure the object typed returned is the type its suppose to return
 */

public class Test_draw_shapes_Curve_canMoveHandle {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//makes sure that its returns true at all times
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
	
		Curve cur1 = new Curve(loc1, loc2, loc3);
		Curve cur2 = new Curve(loc1, loc2, loc3);
		Curve cur3 = new Curve(loc1, loc2, loc3);
		
		Handle handle1 = new Handle(cur1, 1, 5);
		Handle handle2 = new Handle(cur2, 3, 6);
		Handle handle3 = new Handle(cur3, 8, 1);
		
		assertEquals(true, cur1.canMoveHandle(handle1));
		assertEquals(true, cur2.canMoveHandle(handle2));
		assertEquals(true, cur3.canMoveHandle(handle3));
	}
	@Test
	public void test2() {
		//makes sure the object typed returned is the type its suppose to return
		Location loc1 = Location.create(10, 20);
		Location loc2 = Location.create(15, 25);
		Location loc3 = Location.create(20, 30);
	
		Curve cur1 = new Curve(loc1, loc2, loc3);
		Curve cur2 = new Curve(loc1, loc2, loc3);
		Curve cur3 = new Curve(loc1, loc2, loc3);
		
		Handle handle1 = new Handle(cur1, 1, 5);
		Handle handle2 = new Handle(cur2, 3, 6);
		Handle handle3 = new Handle(cur3, 8, 1);
		
		Boolean test1;
		Boolean test2;
		Boolean test3;
		
		test1 = cur1.canMoveHandle(handle1);
		test2 = cur2.canMoveHandle(handle2);
		test3 = cur3.canMoveHandle(handle3);
		
		assertEquals(true, test1);
		assertEquals(true, test2);
		assertEquals(true, test3);
		assertNotEquals(1, test1);
		assertNotEquals(false, test2);
		assertNotEquals("true", test3);

	}


}
