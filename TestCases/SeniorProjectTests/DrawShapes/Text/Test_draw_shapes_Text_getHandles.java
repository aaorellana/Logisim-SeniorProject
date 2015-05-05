package SeniorProjectTests.DrawShapes.Text;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.model.Handle;
import com.cburch.draw.model.HandleGesture;
import com.cburch.draw.shapes.Text;
import com.cburch.logisim.data.Location;

/*
 * 1. makes sure it returns the same object every time the method is called
 * 2. should return the same location it was set on for every item in the list
 * 	  when bounds is 0x0
 * 3. makes sure that the x and y values are not switch around when 
 * 	  placing the handle on the list
 */

public class Test_draw_shapes_Text_getHandles {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//makes sure it returns the same object every time the method is called
		Text text1 = new Text(10, 20, "Hello");
		Text text2 = new Text(10, 20, "Hello");
		Text text3 = new Text(10, 20, "Hello");
		
		assertEquals(text1.getHandles(null).getClass(), text2.getHandles(null).getClass());
		assertEquals(text1.getHandles(null).getClass(), text3.getHandles(null).getClass());
		assertEquals(text2.getHandles(null).getClass(), text3.getHandles(null).getClass());
		
	}
	@Test
	public void test2() {
		//should return the same location it was set on for every item in the list
		//when bounds is 0x0
		Text text1 = new Text(10, 20, "Hello");
		Text text2 = new Text(15, 25, "Hello");
		Text text3 = new Text(1, 3, "Hello");
		
		Handle handle = new Handle(text1, 0, 0);
		
		HandleGesture handle_gesture = new HandleGesture(handle, 13, 15, 1);
		
		assertEquals(Location.create(10, 20), text1.getHandles(handle_gesture).get(0).getLocation());
		assertEquals(Location.create(10, 20), text1.getHandles(handle_gesture).get(1).getLocation());
		assertEquals(Location.create(10, 20), text1.getHandles(handle_gesture).get(2).getLocation());
		assertEquals(Location.create(15, 25), text2.getHandles(handle_gesture).get(0).getLocation());
		assertEquals(Location.create(15, 25), text2.getHandles(handle_gesture).get(1).getLocation());
		assertEquals(Location.create(15, 25), text2.getHandles(handle_gesture).get(2).getLocation());
		assertEquals(Location.create(1, 3), text3.getHandles(handle_gesture).get(0).getLocation());
		assertEquals(Location.create(1, 3), text3.getHandles(handle_gesture).get(1).getLocation());
		assertEquals(Location.create(1, 3), text3.getHandles(handle_gesture).get(2).getLocation());
		
	}
	@Test
	public void test3() {
		//makes sure that the x and y values are not switch around when 
		//placing the handle on the list
		Text text1 = new Text(10, 20, "Hello");
		Text text2 = new Text(15, 25, "Hello");
		Text text3 = new Text(1, 3, "Hello");
		
		Handle handle = new Handle(text1, 0, 0);
		
		HandleGesture handle_gesture = new HandleGesture(handle, 13, 15, 1);
		
		assertNotEquals(Location.create(20, 10), text1.getHandles(handle_gesture).get(0).getLocation());
		assertNotEquals(Location.create(20, 10), text1.getHandles(handle_gesture).get(1).getLocation());
		assertNotEquals(Location.create(20, 10), text1.getHandles(handle_gesture).get(2).getLocation());
		assertNotEquals(Location.create(25, 15), text2.getHandles(handle_gesture).get(0).getLocation());
		assertNotEquals(Location.create(25, 15), text2.getHandles(handle_gesture).get(1).getLocation());
		assertNotEquals(Location.create(25, 15), text2.getHandles(handle_gesture).get(2).getLocation());
		assertNotEquals(Location.create(3, 1), text3.getHandles(handle_gesture).get(0).getLocation());
		assertNotEquals(Location.create(3, 1), text3.getHandles(handle_gesture).get(1).getLocation());
		assertNotEquals(Location.create(3, 1), text3.getHandles(handle_gesture).get(2).getLocation());
		
	}

}
