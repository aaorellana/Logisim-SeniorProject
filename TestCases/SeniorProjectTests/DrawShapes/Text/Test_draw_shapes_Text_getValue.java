package SeniorProjectTests.DrawShapes.Text;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.shapes.Text;
import com.cburch.logisim.data.Attribute;

/*
 * 1.
 * 2.
 * 3.
 * 4.
 * 5.
 */

public class Test_draw_shapes_Text_getValue {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		Text text1 = new Text(10, 10, "Hello");
		Attribute<V> attr1 = new Attribute("Hello", "Test");
		
		text1.getValue(attr);
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
