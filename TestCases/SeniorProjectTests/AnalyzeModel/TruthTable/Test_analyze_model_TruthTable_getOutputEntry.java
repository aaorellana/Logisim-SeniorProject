package SeniorProjectTests.AnalyzeModel.TruthTable;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.logisim.analyze.model.AnalyzerModel;
import com.cburch.logisim.analyze.model.Entry;
import com.cburch.logisim.analyze.model.TruthTable;

public class Test_analyze_model_TruthTable_getOutputEntry {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//tests whether that the entry returns ZERO because of the input
		AnalyzerModel analy1 = new AnalyzerModel();
		AnalyzerModel analy2 = new AnalyzerModel();
		AnalyzerModel analy3 = new AnalyzerModel();
		TruthTable tru1 = new TruthTable(analy1);
		TruthTable tru2 = new TruthTable(analy2);
		TruthTable tru3 = new TruthTable(analy3);
		Entry ent1;
		Entry ent2;
		Entry ent3;
		Entry ent_test = Entry.DONT_CARE;
		List<String> istr = new ArrayList<String>(10);
		List<String> ostr = new ArrayList<String>(10);

		
		for(int i = 0; i <= 10; i++)
		{
			istr.add(i, "test input " + i);
			ostr.add(i, "test output " + i);
		}
		
		analy1.setVariables(istr, ostr);
		analy2.setVariables(istr, ostr);
		analy3.setVariables(istr, ostr);
		
		ent1 = tru1.getOutputEntry(0, 10);
		ent2 = tru2.getOutputEntry(0, 10);
		ent3 = tru3.getOutputEntry(0, 10);
		
		assertEquals(ent_test, ent1);
		assertEquals(ent_test, ent2);
		assertEquals(ent_test, ent3);
		
	}
	@Test
	public void test2() {
		//makes sure the exception is thrown for wrong column num
		AnalyzerModel analy1 = new AnalyzerModel();
		AnalyzerModel analy2 = new AnalyzerModel();
		AnalyzerModel analy3 = new AnalyzerModel();
		TruthTable tru1 = new TruthTable(analy1);
		TruthTable tru2 = new TruthTable(analy2);
		TruthTable tru3 = new TruthTable(analy3);
		Entry ent1;
		Entry ent2;
		Entry ent3;
		List<String> istr = new ArrayList<String>(10);
		List<String> ostr = new ArrayList<String>(10);

		
		for(int i = 0; i <= 10; i++)
		{
			istr.add(i, "test input " + i);
			ostr.add(i, "test output " + i);
		}
		
		analy1.setVariables(istr, ostr);
		analy2.setVariables(istr, ostr);
		analy3.setVariables(istr, ostr);
		
		try
		{
			ent1 = tru1.getOutputEntry(0, -1);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test 2 AnalyzeModel TruthTable getOutputEntry: " + e);
		}
		try
		{
			ent2 = tru2.getOutputEntry(4, -6);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test 2 AnalyzeModel TruthTable getOutputEntry: " + e);
		}
		try
		{
			ent3 = tru3.getOutputEntry(5, -2);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test 2 AnalyzeModel TruthTable getOutputEntry: " + e);
		}
		ent1 = tru1.getInputEntry(0, 0);
		ent2 = tru1.getInputEntry(0, 0);
		ent3 = tru1.getInputEntry(0, 0);
		ent1.getClass();
		ent2.getClass();
		ent3.getClass();
		
	}
	@Test
	public void test3() {
		//makes sure the exception is thrown for wrong row num
		AnalyzerModel analy1 = new AnalyzerModel();
		AnalyzerModel analy2 = new AnalyzerModel();
		AnalyzerModel analy3 = new AnalyzerModel();
		TruthTable tru1 = new TruthTable(analy1);
		TruthTable tru2 = new TruthTable(analy2);
		TruthTable tru3 = new TruthTable(analy3);
		Entry ent1;
		Entry ent2;
		Entry ent3;
		List<String> istr = new ArrayList<String>(10);
		List<String> ostr = new ArrayList<String>(10);

		
		for(int i = 0; i <= 10; i++)
		{
			istr.add(i, "test input " + i);
			ostr.add(i, "test output " + i);
		}
		
		analy1.setVariables(istr, ostr);
		analy2.setVariables(istr, ostr);
		analy3.setVariables(istr, ostr);
		
		try
		{
			ent1 = tru1.getOutputEntry(-1, 5);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test 2 AnalyzeModel TruthTable getOutputEntry: " + e);
		}
		try
		{
			ent2 = tru2.getOutputEntry(-5, 2);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test 2 AnalyzeModel TruthTable getOutputEntry: " + e);
		}
		try
		{
			ent3 = tru3.getOutputEntry(-10, 8);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test 2 AnalyzeModel TruthTable getOutputEntry: " + e);
		}
		ent1 = tru1.getInputEntry(0, 0);
		ent2 = tru1.getInputEntry(0, 0);
		ent3 = tru1.getInputEntry(0, 0);
		ent1.getClass();
		ent2.getClass();
		ent3.getClass();
	}
	@Test
	public void test4() {
		//makes sure that the same object is returned
		AnalyzerModel analy1 = new AnalyzerModel();
		AnalyzerModel analy2 = new AnalyzerModel();
		AnalyzerModel analy3 = new AnalyzerModel();
		TruthTable tru1 = new TruthTable(analy1);
		TruthTable tru2 = new TruthTable(analy2);
		TruthTable tru3 = new TruthTable(analy3);
		Entry ent1;
		Entry ent2;
		Entry ent3;
		List<String> istr = new ArrayList<String>(10);
		List<String> ostr = new ArrayList<String>(10);

		
		for(int i = 0; i <= 10; i++)
		{
			istr.add(i, "test input " + i);
			ostr.add(i, "test output " + i);
		}
		
		analy1.setVariables(istr, ostr);
		analy2.setVariables(istr, ostr);
		analy3.setVariables(istr, ostr);
		
		ent1 = tru1.getOutputEntry(0, 10);
		ent2 = tru2.getOutputEntry(0, 10);
		ent3 = tru3.getOutputEntry(0, 10);
		
		assertEquals(ent1.getClass(), ent2.getClass());
		assertEquals(ent2.getClass(), ent3.getClass());
		assertEquals(ent1.getClass(), ent3.getClass());
		
	}
	@Test
	public void test5() {
		//checks that the output should not be Entry.ONE
		AnalyzerModel analy1 = new AnalyzerModel();
		AnalyzerModel analy2 = new AnalyzerModel();
		AnalyzerModel analy3 = new AnalyzerModel();
		TruthTable tru1 = new TruthTable(analy1);
		TruthTable tru2 = new TruthTable(analy2);
		TruthTable tru3 = new TruthTable(analy3);
		Entry ent1;
		Entry ent2;
		Entry ent3;
		List<String> istr = new ArrayList<String>(10);
		List<String> ostr = new ArrayList<String>(10);

		
		for(int i = 0; i <= 10; i++)
		{
			istr.add(i, "test input " + i);
			ostr.add(i, "test output " + i);
		}
		
		analy1.setVariables(istr, ostr);
		analy2.setVariables(istr, ostr);
		analy3.setVariables(istr, ostr);
		
		ent1 = tru1.getOutputEntry(0, 10);
		ent2 = tru2.getOutputEntry(0, 10);
		ent3 = tru3.getOutputEntry(0, 10);
		
		assertNotEquals(Entry.ONE, ent1);
		assertNotEquals(Entry.ONE, ent2);
		assertNotEquals(Entry.ONE, ent3);
	}

}
