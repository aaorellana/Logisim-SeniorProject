package SeniorProjectTests.DrawShapes.Line;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.model.Handle;
import com.cburch.draw.model.HandleGesture;
import com.cburch.draw.shapes.Line;
import com.cburch.logisim.data.Location;

/*
 * 1. makes sure that its returns the same object every time
 * 2. makes sure the correct handle is placed inside a list
 * 3. makes sure that the x and y values are not switch around when 
 *    placing the handle on the list
 */

public class Test_draw_shapes_Line_getHandles {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//makes sure that its returns the same object every time
		Line line1 = new Line(10, 13, 11, 5);
		Line line2 = new Line(10, 13, 11, 5);
		Line line3 = new Line(10, 13, 11, 5);
		
		
		assertEquals(line1.getHandles(null).getClass(), line2.getHandles(null).getClass());
		assertEquals(line2.getHandles(null).getClass(), line3.getHandles(null).getClass());
		assertEquals(line1.getHandles(null).getClass(), line3.getHandles(null).getClass());
		
	}
	@Test
	public void test2() {
		//makes sure the correct handle is placed inside a list
		Line line1 = new Line(10, 13, 11, 5);
		Line line2 = new Line(9, 32, 27, 8);
		Line line3 = new Line(15, 6, 9, 2);
		
		Handle handle = new Handle(line1, 0, 0);
		
		HandleGesture handle_gesture = new HandleGesture(handle, 13, 15, 1);
		
		assertEquals(Location.create(10, 13), line1.getHandles(handle_gesture).get(0).getLocation());
		assertEquals(Location.create(11, 5), line1.getHandles(handle_gesture).get(1).getLocation());
		assertEquals(Location.create(9, 32), line2.getHandles(handle_gesture).get(0).getLocation());
		assertEquals(Location.create(27, 8), line2.getHandles(handle_gesture).get(1).getLocation());
		assertEquals(Location.create(15, 6), line3.getHandles(handle_gesture).get(0).getLocation());
		assertEquals(Location.create(9, 2), line3.getHandles(handle_gesture).get(1).getLocation());
		
	}
	@Test
	public void test3() {
		//makes sure that the x and y values are not switch around when 
		//placing the handle on the list
		Line line1 = new Line(10, 13, 11, 5);
		Line line2 = new Line(9, 32, 27, 8);
		Line line3 = new Line(15, 6, 9, 2);
		
		Handle handle = new Handle(line1, 0, 0);
		
		HandleGesture handle_gesture = new HandleGesture(handle, 13, 15, 1);
		
		assertNotEquals(Location.create(13, 10), line1.getHandles(handle_gesture).get(0).getLocation());
		assertNotEquals(Location.create(5, 11), line1.getHandles(handle_gesture).get(1).getLocation());
		assertNotEquals(Location.create(32, 9), line2.getHandles(handle_gesture).get(0).getLocation());
		assertNotEquals(Location.create(8, 27), line2.getHandles(handle_gesture).get(1).getLocation());
		assertNotEquals(Location.create(6, 15), line3.getHandles(handle_gesture).get(0).getLocation());
		assertNotEquals(Location.create(2, 9), line3.getHandles(handle_gesture).get(1).getLocation());

	}

}
