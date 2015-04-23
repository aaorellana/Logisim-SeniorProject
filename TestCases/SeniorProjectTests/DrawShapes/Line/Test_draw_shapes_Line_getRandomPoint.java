package SeniorProjectTests.DrawShapes.Line;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.shapes.Line;
import com.cburch.logisim.data.Bounds;

/*
 * 1. testing the if statement in the method if(w > 1)
 * 2. makes sure the object returned is the same every time
 * 3. makes sure the to throw an exception when given null instead of a random value
 */

public class Test_draw_shapes_Line_getRandomPoint {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//testing the if statement in the method if(w > 1)
		Line line = new Line(10, 10, 50, 50);
		int width = 1;
		Bounds bounds = Bounds.create(10, 10, width, 50);
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++)
		{
			assert width > line.getRandomPoint(bounds, rand).getX();
		}

	}
	@Test
	public void test2() {
		//makes sure the object returned is the same every time
		Line line1 = new Line(10, 10, 50, 50);
		Line line2 = new Line(10, 10, 50, 50);
		Line line3 = new Line(10, 10, 50, 50);
		int width = 1;
		Bounds bounds = Bounds.create(10, 10, width, 50);
		Random rand = new Random();
		
		assertEquals(line1.getRandomPoint(bounds, rand).getClass(), line2.getRandomPoint(bounds, rand).getClass());
		assertEquals(line3.getRandomPoint(bounds, rand).getClass(), line2.getRandomPoint(bounds, rand).getClass());
		assertEquals(line1.getRandomPoint(bounds, rand).getClass(), line3.getRandomPoint(bounds, rand).getClass());
		
	}
	@Test
	public void test3() {
		//makes sure the to throw an exception when given null instead of a random value
		Line line = new Line(10, 10, 50, 50);
		int width = 1;
		Bounds bounds = Bounds.create(10, 10, width, 50);
		
		try
		{
			line.getRandomPoint(bounds, null);
		}
		catch(NullPointerException e)
		{
			System.out.println("Test 3 in DrawShapes Line getRandomPoint: " + e + " Expected Random value given null");
		}
		
	}

}
