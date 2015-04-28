package SeniorProjectTests.DrawShapes.Text;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.shapes.Text;
import com.cburch.draw.util.EditableLabel;
import com.cburch.logisim.data.Location;

public class Test_draw_shapes_Text_contains {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		Text text1 = new Text(10, 10, "Text Label");
		Text text2 = new Text(10, 10, "Text Label");
		Text text3 = new Text(10, 10, "Text Label");
		Location loc1 = Location.create(10, 32);
		Location loc2 = Location.create(10, 32);
		Location loc3 = Location.create(10, 32);
		
		EditableLabel label = new EditableLabel(10, 10, "String1", null);
		
		System.out.println(text1.contains(Location.create(10, 10), true));
		
	}
	@Test
	public void test2() {
		fail("Not yet implemented");
	}
	@Test
	public void test3() {
		fail("Not yet implemented");
	}

}
