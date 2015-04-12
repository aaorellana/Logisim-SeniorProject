package SeniorProjectTests.AnalyzeModel.VariableList;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.logisim.analyze.model.VariableList;

/*
 * 1. makes sure it returns the correct output based on the input
 * 2. makes sure the array is set correctly
 * 3. not equals because the output is correct
 * 4. throws an error when null is the input
 * 5. checks that the correct type is returned
 */

public class Test_analyze_model_VariableList_toArray {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//makes sure it returns the correct output based on the input
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		VariableList vlist3 = new VariableList(5);
		String[] str1 = new String[1];
		String[] str2 = new String[1];
		String[] str3 = new String[1];
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
			vlist2.add("test var " + i);
			vlist3.add("test var " + i);
		}
		
		str1 = vlist1.toArray(str1);
		str2 = vlist1.toArray(str2);
		str3 = vlist1.toArray(str3);
		assertEquals("test var 1", str1[0]);
		assertEquals("test var 1", str2[0]);
		assertEquals("test var 1", str3[0]);

		
	}
	@Test
	public void test2() {
		//makes sure the array is set correctly
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		VariableList vlist3 = new VariableList(5);
		String[] str1 = new String[5];
		String[] str2 = new String[3];
		String[] str3 = new String[7];
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
			vlist2.add("test var " + i);
			vlist3.add("test var " + i);
		}
		
		str1 = vlist1.toArray(str1);
		str2 = vlist1.toArray(str2);
		str3 = vlist1.toArray(str3);
		
		assertEquals("test var 5", str1[4]);
		assertEquals("test var 3", str2[2]);
		assertEquals("test var 2", str3[1]);
		
	}
	@Test
	public void test3() {
		//not equals because the output is correct
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		VariableList vlist3 = new VariableList(5);
		String[] str1 = new String[5];
		String[] str2 = new String[3];
		String[] str3 = new String[7];
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
			vlist2.add("test var " + i);
			vlist3.add("test var " + i);
		}
		
		str1 = vlist1.toArray(str1);
		str2 = vlist1.toArray(str2);
		str3 = vlist1.toArray(str3);
		
		assertNotEquals("test", str1[0]);
		assertNotEquals("ubuntu", str2[0]);
		assertNotEquals("mac", str3[0]);
		
	}
	@Test
	public void test4() {
		//throws an error when null is the input
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		VariableList vlist3 = new VariableList(5);
		String[] str1 = new String[5];
		String[] str2 = new String[3];
		String[] str3 = new String[7];
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
			vlist2.add("test var " + i);
			vlist3.add("test var " + i);
		}
		
		try
		{
			str1 = vlist1.toArray(null);
		}
		catch(NullPointerException e)
		{
			System.out.println("Test 4 AnalyzeModel VariableList toArray: " + e);
		}
		try
		{
			str2 = vlist2.toArray(null);
		}
		catch(NullPointerException e)
		{
			System.out.println("Test 4 AnalyzeModel VariableList toArray: " + e);
		}
		try
		{
			str3 = vlist3.toArray(null);
		}
		catch(NullPointerException e)
		{
			System.out.println("Test 4 AnalyzeModel VariableList toArray: " + e);
		}
		
		str1 = vlist1.toArray(str1);
		str2 = vlist1.toArray(str2);
		str3 = vlist1.toArray(str3);
		
	}
	@Test
	public void test5() {
		//checks that the correct type is returned
		VariableList vlist1 = new VariableList(5);
		VariableList vlist2 = new VariableList(5);
		VariableList vlist3 = new VariableList(5);
		String[] str1 = new String[5];
		String[] str2 = new String[3];
		String[] str3 = new String[7];
		String[] test = new String[1];
		String[] test1 = new String[1];
		
		for(int i = 1; i <= 5; i++)
		{
			vlist1.add("test var " + i);
			vlist2.add("test var " + i);
			vlist3.add("test var " + i);
		}
		
		
		test[0] = "test var 1";
		str1 = vlist1.toArray(str1);
		str2 = vlist1.toArray(str2);
		str3 = vlist1.toArray(str3);
		test1[0] = str1[0];
		
		assertEquals(test[0], str1[0]);
		assertNotEquals(1, vlist1.toArray(str1));
		assertNotEquals("", vlist1.toArray(str1));
		assertNotEquals(true, vlist1.toArray(str1));
		
	}

}
