package SeniorProjectTests.DrawShapes.Line;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.model.Handle;
import com.cburch.draw.shapes.Line;
import com.cburch.logisim.data.Location;

/*
 * 1. makes sure it returns true when given a handle
 * 2. makes sure it returns true no matter what the handle is set to
 * 3. makes sure it returns true when given null
 * 4. makes sure it does not return false when given null
 * 5. makes sure it does not return false when given any handle
 */

public class Test_draw_shapes_Line_canMoveHandle {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//makes sure it returns true when given a handle
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Line line1 = new Line(10, 34, 20, 34);
		Line line2 = new Line(1, 4, 2, 4);
		Line line3 = new Line(12, 34, 56, 67);
		
		Handle handle = new Handle(line1, 0, 0);
		
		assertEquals(true, line1.canMoveHandle(handle));
		assertEquals(true, line2.canMoveHandle(handle));
		assertEquals(true, line3.canMoveHandle(handle));
		
	}
	@Test
	public void test2() {
		//makes sure it returns true no matter what the handle is set to
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Line line1 = new Line(10, 34, 20, 34);
		Line line2 = new Line(1, 4, 2, 4);
		Line line3 = new Line(12, 34, 56, 67);
		
		Handle handle1 = new Handle(line1, 13, 3);
		Handle handle2 = new Handle(line2, 77, 5);
		Handle handle3 = new Handle(line3, 23, 0);
		
		assertEquals(true, line1.canMoveHandle(handle1));
		assertEquals(true, line2.canMoveHandle(handle2));
		assertEquals(true, line3.canMoveHandle(handle3));
		
	}
	@Test
	public void test3() {
		//makes sure it returns true when given null
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Line line1 = new Line(10, 34, 20, 34);
		Line line2 = new Line(1, 4, 2, 4);
		Line line3 = new Line(12, 34, 56, 67);
		
		assertEquals(true, line1.canMoveHandle(null));
		assertEquals(true, line2.canMoveHandle(null));
		assertEquals(true, line3.canMoveHandle(null));
	}
	@Test
	public void test4() {
		//makes sure it does not return false when given null
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Line line1 = new Line(10, 34, 20, 34);
		Line line2 = new Line(1, 4, 2, 4);
		Line line3 = new Line(12, 34, 56, 67);
		
		assertNotEquals(false, line1.canMoveHandle(null));
		assertNotEquals(false, line2.canMoveHandle(null));
		assertNotEquals(false, line3.canMoveHandle(null));
	}
	@Test
	public void test5() {
		//makes sure it does not return false when given any handle
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(10, 29));
		loclist.add(Location.create(5, 9));
		loclist.add(Location.create(7, 3));
		
		Line line1 = new Line(10, 34, 20, 34);
		Line line2 = new Line(1, 4, 2, 4);
		Line line3 = new Line(12, 34, 56, 67);
		
		Handle handle1 = new Handle(line1, 13, 3);
		Handle handle2 = new Handle(line2, 77, 5);
		Handle handle3 = new Handle(line3, 23, 0);
		
		assertNotEquals(false, line1.canMoveHandle(handle1));
		assertNotEquals(false, line2.canMoveHandle(handle2));
		assertNotEquals(false, line3.canMoveHandle(handle3));
	}

}
