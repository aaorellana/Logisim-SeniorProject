package SeniorProjectTests.DrawShapes.Text;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.shapes.Text;
import com.cburch.draw.util.EditableLabel;
import com.cburch.logisim.data.Location;

/*
 * 1. throws an error when given null instead of a location
 * 2.
 * 3.
 */

public class Test_draw_shapes_Text_contains {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//throws an error when given null instead of a location
		Text text1 = new Text(50, 0, "Text Label");
		Text text2 = new Text(3, 1, "Text Label");
		Text text3 = new Text(80, 6, "Text Label");
		
		try
		{
			text1.contains(null, true);
		}
		catch(NullPointerException e)
		{
			System.out.println("Test 1 in contains Text DrawShapes :" + e + "; null was given where it expected a Location");
		}
		try
		{
			text2.contains(null, true);
		}
		catch(NullPointerException e)
		{
			System.out.println("Test 1 in contains Text DrawShapes :" + e + "; null was given where it expected a Location");
		}
		try
		{
			text3.contains(null, true);
		}
		catch(NullPointerException e)
		{
			System.out.println("Test 1 in contains Text DrawShapes :" + e + "; null was given where it expected a Location");
		}
		
	}
	@Test
	public void test2() {
		Text text1 = new Text(100, 100, "Text Label");
		Text text2 = new Text(10, 10, "Text Label");
		Text text3 = new Text(10, 10, "Text Label");
		Location loc1 = Location.create(10, 32);
		Location loc2 = Location.create(10, 32);
		Location loc3 = Location.create(10, 32);
		
		EditableLabel label = new EditableLabel(10, 10, "String1", null);
		
		label = text1.getLabel();
		
		
		//System.out.println(text1.getLocation());
		//System.out.println(label.contains(0, 0));
		//System.out.println(text1.contains(Location.create(10, 14), true));
		System.out.println(label.RIGHT);
		for(int i = 0; i <= 50; i++)
		{
			for(int j = 0; j <= 50; j++)
			{
				if(text1.contains(Location.create(i, j), true) == true)
				{
					System.out.println("I = " + i + "J = " + j);
				}
				//System.out.println(text1.contains(Location.create(i, j), true));
			}
		}
		//System.out.println(text1.contains(loc1, true));
	}
	@Test
	public void test3() {
		fail("Not yet implemented");
	}

}
