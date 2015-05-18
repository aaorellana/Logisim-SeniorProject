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
 * 1.
 * 2.
 * 3.
 * 4.
 * 5.
 */

public class Test_draw_shapes_Poly_canInsertHandle {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(1, 1));
		loclist.add(Location.create(5, 5));
		loclist.add(Location.create(10, 10));
		
		Poly poly1 = new Poly(true, loclist);
		
		Handle handle = new Handle(poly1, 0, 0);
		
		HandleGesture handle_gesture = new HandleGesture(handle, 13, 15, 1);
		/*
		for(int i = 0; i <= 20; i++)
		{
			for(int j = 0; j <= 20; j++)
			{
				System.out.println(poly1.canInsertHandle(Location.create(i, j)) + " " + i + " "+ j);
			}
		}
		*/
		assertEquals(Location.create(2, 2), poly1.canInsertHandle(Location.create(1, 2)).getLocation());
		assertEquals(Location.create(9, 9), poly1.canInsertHandle(Location.create(8, 10)).getLocation());
		//System.out.println(poly1.canInsertHandle(Location.create(1, 2)));
	}
	@Test
	public void test2() {
		//
		ArrayList<Location> loclist = new ArrayList<Location>();
		
		loclist.add(Location.create(1, 1));
		loclist.add(Location.create(5, 5));
		loclist.add(Location.create(10, 10));
		
		Poly poly1 = new Poly(true, loclist);
		Poly poly2 = new Poly(true, loclist);
		Poly poly3 = new Poly(true, loclist);
		
		Handle handle = new Handle(poly1, 0, 0);
		
		HandleGesture handle_gesture = new HandleGesture(handle, 13, 15, 1);
		
		try
		{
			poly1.canInsertHandle(null);
		}
		catch(NullPointerException e)
		{
			System.out.println("Test 2 in canInsertHandle Poly DrawShapes: " + e + "; given null where expexted a location value");
		}
		try
		{
			poly2.canInsertHandle(null);
		}
		catch(NullPointerException e)
		{
			System.out.println("Test 2 in canInsertHandle Poly DrawShapes: " + e + "; given null where expexted a location value");
		}
		try
		{
			poly3.canInsertHandle(null);
		}
		catch(NullPointerException e)
		{
			System.out.println("Test 2 in canInsertHandle Poly DrawShapes: " + e + "; given null where expexted a location value");
		}
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
