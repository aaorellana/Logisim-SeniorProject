package SeniorProjectTests.DrawShapes.Text;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.draw.shapes.Text;

/*
 * 1. Should return false when the labels are not the same
 * 2. Should return false when the labels are the same but the x position is different
 * 3. Should return false when the labels are the same but the y position is different
 * 4. Should return false when the labels are the same but the x and y position are different
 * 5. Should return false when given null
 */

public class Test_draw_shapes_Text_matches {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//Should return false when the labels are not the same
		Text text1 = new Text(10, 10, "Hello World1");
		Text text2 = new Text(10, 10, "Hello World2");
		Text text3 = new Text(10, 10, "Hello World3");
		
		assertEquals(false, text1.matches(text2));
		assertEquals(false, text2.matches(text3));
		assertEquals(false, text3.matches(text2));
		assertEquals(false, text3.matches(text1));
	
	}
	@Test
	public void test2() {
		//Should return false when the labels are the same but the x position is different
		Text text1 = new Text(13, 5, "Hello World");
		Text text2 = new Text(8, 5, "Hello World");
		Text text3 = new Text(35, 5, "Hello World");
		
		assertEquals(false, text1.matches(text2));
		assertEquals(false, text2.matches(text3));
		assertEquals(false, text3.matches(text2));
		assertEquals(false, text3.matches(text1));
	}
	@Test
	public void test3() {
		//Should return false when the labels are the same but the y position is different
		Text text1 = new Text(13, 4, "Hello World");
		Text text2 = new Text(13, 25, "Hello World");
		Text text3 = new Text(13, 55, "Hello World");
		
		assertEquals(false, text1.matches(text2));
		assertEquals(false, text2.matches(text3));
		assertEquals(false, text3.matches(text2));
		assertEquals(false, text3.matches(text1));
	}
	@Test
	public void test4() {
		//Should return false when the labels are the same but the x and y position are different
				Text text1 = new Text(1, 4, "Hello World");
				Text text2 = new Text(312, 25, "Hello World");
				Text text3 = new Text(12, 55, "Hello World");
				
				assertEquals(false, text1.matches(text2));
				assertEquals(false, text2.matches(text3));
				assertEquals(false, text3.matches(text2));
				assertEquals(false, text3.matches(text1));
	}
	@Test
	public void test5() {
		//Should return false when given null
		Text text1 = new Text(1, 4, "Hello World");
		Text text2 = new Text(312, 25, "Hello World");
		Text text3 = new Text(12, 55, "Hello World");
		
		assertEquals(false, text1.matches(null));
		assertEquals(false, text2.matches(null));
		assertEquals(false, text3.matches(null));
	}

}
