package SeniorProjectTests.AnalyzeModel.VariableList;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.logisim.analyze.model.VariableList;

/*
 * 1. makes sure when the input is null to return -1
 * 2. makes sure it returns the correct output
 * 3. makes sure it returns -1 when the indexOf is not found
 * 4. makes sure that it returns the correct type
 * 5. makes sure it returns the correct element in the array
 */

public class Test_analyze_model_VariableList_indexOf {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//makes sure when the input is null to return -1
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		VariableList vlist3 = new VariableList(5);
		
		assertEquals(-1, vlist1.indexOf(null));
		assertEquals(-1, vlist2.indexOf(null));
		assertEquals(-1, vlist3.indexOf(null));
		
	}
	@Test
	public void test2() {
		//makes sure it returns the correct output
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		VariableList vlist3 = new VariableList(5);
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
			vlist2.add("test var " + i);
			vlist3.add("test var " + i);
		}
		
		assertEquals(4, vlist1.indexOf("test var 5"));
		assertEquals(3, vlist2.indexOf("test var 4"));
		assertEquals(0, vlist3.indexOf("test var 1"));
		
	}
	@Test
	public void test3() {
		//makes sure it returns -1 when the indexOf is not found
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		VariableList vlist3 = new VariableList(5);
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
			vlist2.add("test var " + i);
			vlist3.add("test var " + i);
		}
		
		assertEquals(-1, vlist1.indexOf("test"));
		assertEquals(-1, vlist2.indexOf("test123"));
		assertEquals(-1, vlist3.indexOf("asdffq34"));
		
	}
	@Test
	public void test4() {
		//makes sure that it returns the correct type
		//checks the correct type by assigning to the correct type and checking 
		//other types 
		VariableList vlist1 = new VariableList(5);
		int test;
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
		}
		
		test = vlist1.indexOf("test var 5");
		
		assertEquals(test, 4);
		assertNotEquals(-1, vlist1.indexOf("test var 5"));
		assertNotEquals("", vlist1.indexOf("test var 5"));
		assertNotEquals(true, vlist1.indexOf("test var 5"));
	
	}
	@Test
	public void test5() {
		//makes sure it returns the correct element in the array
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		VariableList vlist3 = new VariableList(5);
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
			vlist2.add("test var " + i);
			vlist3.add("test var " + i);
		}
		
		assertEquals(vlist1.indexOf("test var 5"), vlist2.indexOf("test var 5"));
		assertEquals(vlist3.indexOf("test var 5"), vlist2.indexOf("test var 5"));
		assertEquals(vlist1.indexOf("test var 5"), vlist3.indexOf("test var 5"));
		
	}

}
