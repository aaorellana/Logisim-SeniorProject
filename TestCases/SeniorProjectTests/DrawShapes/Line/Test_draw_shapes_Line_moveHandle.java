package SeniorProjectTests.DrawShapes.Line;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.model.Handle;
import com.cburch.draw.model.HandleGesture;
import com.cburch.draw.shapes.Line;
import com.cburch.logisim.data.Bounds;
import com.cburch.logisim.data.Location;

/*
 * 1. checks that x and y get incremented
 * 2. checks that bounds get decremented when comparing x0 and y0
 * 3. checks that bounds get incremented when comparing x1 and y1 and they are equal
 * 	  to the handle x and y
 * 4. when the x0, y0 and x1, y1 are not the same as the handle x and y
 * 	  then it should return null
 */

public class Test_draw_shapes_Line_moveHandle {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//when handle x y is similar to line x0 y0 it adds the handle gesture x and y 
		//to the x and y on the current line, then it decreases the bounds by the gesture x and y
		
		//checks that x and y get incremented
		Line line1 = new Line(5, 5, 22, 23);
		Line line2 = new Line(5, 5, 22, 23);
		
		Handle handle1 = new Handle(line1, 5, 5);
		Handle handle2 = new Handle(line1, 5, 5);
		
		HandleGesture handle_gesture = new HandleGesture(handle1, 10, 10, 0);
		HandleGesture handle_gesture1 = new HandleGesture(handle2, 1, 1, 0);

		
		line1.moveHandle(handle_gesture);
		
		assertEquals(Location.create(15, 15), line1.getEnd0());
		
		line2.moveHandle(handle_gesture1);
		
		assertEquals(Location.create(6, 6), line2.getEnd0());

	}
	@Test
	public void test2() {
		//checks that bounds get decremented when comparing x0 and y0
		Line line1 = new Line(5, 5, 22, 23);
		Line line2 = new Line(5, 5, 22, 23);
		
		Handle handle1 = new Handle(line1, 5, 5);
		Handle handle2 = new Handle(line1, 5, 5);
		
		HandleGesture handle_gesture = new HandleGesture(handle1, 10, 10, 0);
		HandleGesture handle_gesture1 = new HandleGesture(handle2, 1, 1, 0);
		
		
		line1.moveHandle(handle_gesture);
		
		assertEquals(Bounds.create(15, 15, 8, 9), line1.getBounds());
		
		line2.moveHandle(handle_gesture1);

		assertEquals(Bounds.create(6, 6, 17, 18), line2.getBounds());
	}
	@Test
	public void test3() {
		//checks that bounds get incremented when comparing x1 and y1 and they are equal
		//to the handle x and y
		Line line1 = new Line(5, 5, 22, 23);
		Line line2 = new Line(5, 5, 22, 23);
		
		Handle handle1 = new Handle(line1, 22, 23);
		Handle handle2 = new Handle(line1, 22, 23);
		
		HandleGesture handle_gesture = new HandleGesture(handle1, 10, 10, 0);
		HandleGesture handle_gesture1 = new HandleGesture(handle2, 1, 1, 0);
		
		
		assertEquals(Bounds.create(5, 5, 18, 19), line1.getBounds());

		line1.moveHandle(handle_gesture);
		
		assertEquals(Bounds.create(5, 5, 28, 29), line1.getBounds());
		
		line2.moveHandle(handle_gesture1);

		assertEquals(Bounds.create(5, 5, 19, 20), line2.getBounds());
		
	}
	@Test
	public void test4() {
		//when the x0, y0 and x1, y1 are not the same as the handle x and y
		//then it should return null
		Line line1 = new Line(5, 5, 22, 23);
		Line line2 = new Line(5, 5, 22, 23);
		
		Handle handle1 = new Handle(line1, 0, 0);
		Handle handle2 = new Handle(line1, 50, 100);
		
		HandleGesture handle_gesture = new HandleGesture(handle1, 10, 10, 0);
		HandleGesture handle_gesture1 = new HandleGesture(handle2, 1, 1, 0);
		
		assertEquals(null, line1.moveHandle(handle_gesture));

		assertEquals(null, line2.moveHandle(handle_gesture1));

	}

}
