package SeniorProjectTests.AnalyzeModel.TruthTable;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.logisim.analyze.model.AnalyzerModel;
import com.cburch.logisim.analyze.model.Entry;
import com.cburch.logisim.analyze.model.TruthTable;

/*
 * 1. makes sure it throws the an exception when given the wrong input
 * 2. makes sure that it returns the correct output
 * 3. make sure it returns the correct object
 * 4. fails because the output is correct
 * 5. throws an exception when the index is out of the array
 */

public class Test_analyze_model_TruthTable_getOutputHeader {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//makes sure it throws the an exception when given the wrong input
		AnalyzerModel analy1 = new AnalyzerModel();
		AnalyzerModel analy2 = new AnalyzerModel();
		AnalyzerModel analy3 = new AnalyzerModel();
		TruthTable tru1 = new TruthTable(analy1);
		TruthTable tru2 = new TruthTable(analy2);
		TruthTable tru3 = new TruthTable(analy3);
		Entry[] ent1 = null;
		Entry[] ent2 = null;
		Entry[] ent3 = null;
		
		try
		{
			tru1.setOutputColumn(0, ent1);
			tru1.getOutputHeader(0);
		}
		catch(IllegalArgumentException e)
		{
			System.out.print("Test 1 in Analyze Model TruthTable getOutputHeader: " + e + "\n");
		}
		try
		{
			tru2.setOutputColumn(0, ent2);
			tru2.getOutputHeader(0);
		}
		catch(IllegalArgumentException e)
		{
			System.out.print("Test 1 in Analyze Model TruthTable getOutputHeader: " + e + "\n");
		}
		try
		{
			tru3.setOutputColumn(0, ent3);
			tru3.getOutputHeader(0);
		}
		catch(IllegalArgumentException e)
		{
			System.out.print("Test 1 in Analyze Model TruthTable getOutputHeader: " + e + "\n");
		}
	}
	@Test
	public void test2() {
		//makes sure that it returns the correct output
		AnalyzerModel analy1 = new AnalyzerModel();
		TruthTable tru1 = new TruthTable(analy1);
		List<String> istr = new ArrayList<String>(10);
		List<String> ostr = new ArrayList<String>(10);

		
		for(int i = 0; i <= 10; i++)
		{
			istr.add(i, "test input " + i);
			ostr.add(i, "test output " + i);
		}
		
		analy1.setVariables(istr, ostr);
		
		assertEquals("test output 0", tru1.getOutputHeader(0));
		assertEquals("test output 1", tru1.getOutputHeader(1));
		assertEquals("test output 2", tru1.getOutputHeader(2));

	}
	@Test
	public void test3() {
		//make sure it returns the correct object
		AnalyzerModel analy1 = new AnalyzerModel();
		AnalyzerModel analy2 = new AnalyzerModel();
		AnalyzerModel analy3 = new AnalyzerModel();
		TruthTable tru1 = new TruthTable(analy1);
		TruthTable tru2 = new TruthTable(analy2);
		TruthTable tru3 = new TruthTable(analy3);
		List<String> istr1 = new ArrayList<String>(10);
		List<String> ostr1 = new ArrayList<String>(10);
		List<String> istr2 = new ArrayList<String>(10);
		List<String> ostr2 = new ArrayList<String>(10);
		List<String> istr3 = new ArrayList<String>(10);
		List<String> ostr3 = new ArrayList<String>(10);
		
		for(int i = 0; i <= 10; i++)
		{
			istr1.add(i, "test input " + i);
			ostr1.add(i, "test output " + i);
			istr2.add(i, "test input " + i);
			ostr2.add(i, "test output " + i);
			istr3.add(i, "test input " + i);
			ostr3.add(i, "test output " + i);
		}
		
		analy1.setVariables(istr1, ostr1);
		analy2.setVariables(istr2, ostr2);
		analy3.setVariables(istr3, ostr3);

		
		assertEquals(tru1.getOutputHeader(0).getClass(), tru2.getOutputHeader(0).getClass());
		assertEquals(tru2.getOutputHeader(0).getClass(), tru3.getOutputHeader(0).getClass());
		assertEquals(tru1.getOutputHeader(0).getClass(), tru3.getOutputHeader(0).getClass());
		
	}
	@Test
	public void test4() {
		//fails because the output is correct
		AnalyzerModel analy1 = new AnalyzerModel();
		AnalyzerModel analy2 = new AnalyzerModel();
		AnalyzerModel analy3 = new AnalyzerModel();
		TruthTable tru1 = new TruthTable(analy1);
		TruthTable tru2 = new TruthTable(analy2);
		TruthTable tru3 = new TruthTable(analy3);
		List<String> istr1 = new ArrayList<String>(10);
		List<String> ostr1 = new ArrayList<String>(10);
		List<String> istr2 = new ArrayList<String>(10);
		List<String> ostr2 = new ArrayList<String>(10);
		List<String> istr3 = new ArrayList<String>(10);
		List<String> ostr3 = new ArrayList<String>(10);
		
		for(int i = 0; i <= 10; i++)
		{
			istr1.add(i, "test input " + i);
			ostr1.add(i, "test output " + i);
			istr2.add(i, "test input " + i);
			ostr2.add(i, "test output " + i);
			istr3.add(i, "test input " + i);
			ostr3.add(i, "test output " + i);
		}
		
		analy1.setVariables(istr1, ostr1);
		analy2.setVariables(istr2, ostr2);
		analy3.setVariables(istr3, ostr3);
		
		assertNotEquals("test output 1", tru1.getOutputHeader(0));
		assertNotEquals("test output 2", tru2.getOutputHeader(1));
		assertNotEquals("test output 0", tru3.getOutputHeader(2));
		
	}
	@Test
	public void test5() {
		//throws an exception when the index is out of the array
		AnalyzerModel analy1 = new AnalyzerModel();
		AnalyzerModel analy2 = new AnalyzerModel();
		AnalyzerModel analy3 = new AnalyzerModel();
		TruthTable tru1 = new TruthTable(analy1);
		TruthTable tru2 = new TruthTable(analy2);
		TruthTable tru3 = new TruthTable(analy3);
		List<String> istr1 = new ArrayList<String>(10);
		List<String> ostr1 = new ArrayList<String>(10);
		List<String> istr2 = new ArrayList<String>(10);
		List<String> ostr2 = new ArrayList<String>(10);
		List<String> istr3 = new ArrayList<String>(10);
		List<String> ostr3 = new ArrayList<String>(10);
		
		for(int i = 0; i <= 10; i++)
		{
			istr1.add(i, "test input " + i);
			ostr1.add(i, "test output " + i);
			istr2.add(i, "test input " + i);
			ostr2.add(i, "test output " + i);
			istr3.add(i, "test input " + i);
			ostr3.add(i, "test output " + i);
		}
		
		analy1.setVariables(istr1, ostr1);
		analy2.setVariables(istr2, ostr2);
		analy3.setVariables(istr3, ostr3);
		
		try
		{
			tru1.getOutputHeader(11);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.print("Test 5 in Analyze Model TruthTable getOutputHeader: " + e + "\n");
		}
		try
		{
			tru2.getOutputHeader(11);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.print("Test 5 in Analyze Model TruthTable getOutputHeader: " + e + "\n");
		}
		try
		{
			tru3.getOutputHeader(11);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.print("Test 5 in Analyze Model TruthTable getOutputHeader: " + e + "\n");
		}
		
	}

}
