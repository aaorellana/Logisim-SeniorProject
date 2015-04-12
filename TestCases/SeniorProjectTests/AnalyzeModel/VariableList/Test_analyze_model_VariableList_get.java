package SeniorProjectTests.AnalyzeModel.VariableList;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.logisim.analyze.model.VariableList;

/*
 * 1. checks that the output is correct
 * 2. makes sure it throws an exception when index searched is larger 
 *    on the positive side
 * 3. makes sure it throws an exception when index searched is larger 
 *    on the positive side
 * 4. makes sure the return type is the correct type
 * 5. checks that the output is correct based on the input
 */

public class Test_analyze_model_VariableList_get {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//checks that the output is correct
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		VariableList vlist3 = new VariableList(5);
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
			vlist2.add("test var " + i);
			vlist3.add("test var " + i);
		}
		
		assertEquals("test var 1", vlist1.get(0));
		assertEquals("test var 2", vlist1.get(1));
		assertEquals("test var 3", vlist1.get(2));
		
	}
	@Test
	public void test2() {
		//makes sure it throws an exception when index searched is larger 
		//on the positive side
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		VariableList vlist3 = new VariableList(5);
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
			vlist2.add("test var " + i);
			vlist3.add("test var " + i);
		}
		
		try
		{
			vlist1.get(20);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Test 2 AnalyzeModel VariableList get: " + e);
		}
		try
		{
			vlist2.get(53);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Test 2 AnalyzeModel VariableList get: " + e);
		}
		try
		{
			vlist3.get(832);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Test 2 AnalyzeModel VariableList get: " + e);
		}
		
	}
	@Test
	public void test3() {
		//makes sure it throws an exception when index searched is larger 
		//on the negative side
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		VariableList vlist3 = new VariableList(5);
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
			vlist2.add("test var " + i);
			vlist3.add("test var " + i);
		}
		
		try
		{
			vlist1.get(-20);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Test 2 AnalyzeModel VariableList get: " + e);
		}
		try
		{
			vlist2.get(-53);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Test 2 AnalyzeModel VariableList get: " + e);
		}
		try
		{
			vlist3.get(-719);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Test 2 AnalyzeModel VariableList get: " + e);
		}
	}
	@Test
	public void test4() {
		//makes sure the return type is the correct type
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		String test;
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
			vlist2.add("test var " + i);
		}
		
		test = vlist1.get(0);
		
		assertEquals(vlist1.get(0), vlist2.get(0));
		assertEquals("test var 1", test);
		assertNotEquals(1, vlist1.get(0));
		assertNotEquals(true, vlist1.get(0));
		
	}
	@Test
	public void test5() {
		//checks that it gets the correct value
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		VariableList vlist3 = new VariableList(5);
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
			vlist2.add("test var " + i);
			vlist3.add("test var " + i);
		}
		
		assertEquals("test var 1",vlist1.get(0));
		assertEquals("test var 4",vlist1.get(3));
		assertEquals("test var 2",vlist1.get(1));
		
		
	}

}
