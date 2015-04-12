package SeniorProjectTests.AnalyzeModel.VariableList;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.logisim.analyze.model.VariableList;

/*
 * 1. makes sure it gives the correct output based on the input
 * 2. makes sure it returns false when the input is null
 * 3. makes sure it returns false when given the input is wrong
 * 4. checks that the output is correct if the input is wrong or right
 * 5. makes sure that the return type is always the same type
 */

public class Test_analyze_model_VariableList_contains {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//makes sure it gives the correct output based on the input
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		VariableList vlist3 = new VariableList(5);
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
			vlist2.add("test var " + i);
			vlist3.add("test var " + i);
		}
		
		assertEquals(true, vlist1.contains("test var 1"));
		assertEquals(true, vlist2.contains("test var 1"));
		assertEquals(true, vlist3.contains("test var 1"));
		
	}
	@Test
	public void test2() {
		//makes sure it returns false when the input is null
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		VariableList vlist3 = new VariableList(5);
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
			vlist2.add("test var " + i);
			vlist3.add("test var " + i);
		}
		
		assertEquals(false, vlist1.contains(null));
		assertEquals(false, vlist2.contains(null));
		assertEquals(false, vlist3.contains(null));
		
	}
	@Test
	public void test3() {
		//makes sure it returns false when given the input is wrong
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		VariableList vlist3 = new VariableList(5);
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
			vlist2.add("test var " + i);
			vlist3.add("test var " + i);
		}
		
		assertEquals(false, vlist1.contains("and"));
		assertEquals(false, vlist1.contains("test"));
		assertEquals(false, vlist1.contains("ubuntu"));
		
	}
	@Test
	public void test4() {
		//checks that the output is correct if the input is wrong or right
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		VariableList vlist3 = new VariableList(5);
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
			vlist2.add("test var " + i);
			vlist3.add("test var " + i);
		}
		
		assertEquals(true, vlist1.contains("test var 3"));
		assertNotEquals(true, vlist1.contains("testing"));
		assertNotEquals(true, vlist1.contains("linux"));
		
	}
	@Test
	public void test5() {
		//makes sure that the return type is always the same type
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		VariableList vlist3 = new VariableList(5);
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
			vlist2.add("test var " + i);
			vlist3.add("test var " + i);
		}
		
		assertEquals(vlist1.contains("test var 3"), vlist1.contains("test var 3"));
		assertEquals(vlist2.contains("test var 3"), vlist3.contains("test var 3"));
		assertEquals(vlist1.contains("test var 3"), vlist3.contains("test var 3"));
		
		
	}

}
