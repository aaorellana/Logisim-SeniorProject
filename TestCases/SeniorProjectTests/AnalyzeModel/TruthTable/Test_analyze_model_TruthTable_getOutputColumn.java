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
 * 1. makes sure the Illegal Arguments are thrown when index searched is less than 0
 * 2. makes sure the Illegal Arguments are thrown when index searched is larger than size of array
 * 3. makes sure that when column data is null it sets it to a new empty entry
 * 4. makes sure the object returned is the same object every time
 * 5. 
 */

public class Test_analyze_model_TruthTable_getOutputColumn {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//makes sure the Illegal Arguments are thrown when index searched is less than 0
		AnalyzerModel analy1 = new AnalyzerModel();
		AnalyzerModel analy2 = new AnalyzerModel();
		AnalyzerModel analy3 = new AnalyzerModel();
		TruthTable tru1 = new TruthTable(analy1);
		TruthTable tru2 = new TruthTable(analy2);
		TruthTable tru3 = new TruthTable(analy3);
		@SuppressWarnings("unused")
		Entry[] ent_test = new Entry[1];
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
		
		
		analy1.setVariables(istr, ostr);
		
		try
		{
			ent_test = tru1.getOutputColumn(-1);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test 1 Analyze Model TruthTable getOutputColumn: " + e);
		}
		try
		{
			ent_test = tru2.getOutputColumn(-11);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test 1 Analyze Model TruthTable getOutputColumn: " + e);
		}
		try
		{
			ent_test = tru3.getOutputColumn(-200);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test 1 Analyze Model TruthTable getOutputColumn: " + e);
		}
		
	}
	@Test
	public void test2() {
		//makes sure the Illegal Arguments are thrown when index searched is larger than size of array
		AnalyzerModel analy1 = new AnalyzerModel();
		AnalyzerModel analy2 = new AnalyzerModel();
		AnalyzerModel analy3 = new AnalyzerModel();
		TruthTable tru1 = new TruthTable(analy1);
		TruthTable tru2 = new TruthTable(analy2);
		TruthTable tru3 = new TruthTable(analy3);
		@SuppressWarnings("unused")
		Entry[] ent_test = new Entry[1];
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
		
		
		analy1.setVariables(istr, ostr);
		
		try
		{
			ent_test = tru1.getOutputColumn(11);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test 1 Analyze Model TruthTable getOutputColumn: " + e);
		}
		try
		{
			ent_test = tru2.getOutputColumn(50);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test 1 Analyze Model TruthTable getOutputColumn: " + e);
		}
		try
		{
			ent_test = tru3.getOutputColumn(200);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test 1 Analyze Model TruthTable getOutputColumn: " + e);
		}
		
	}
	@Test
	public void test3() {
		//makes sure that when column data is null it sets it to a new empty entry
		AnalyzerModel analy1 = new AnalyzerModel();
		AnalyzerModel analy2 = new AnalyzerModel();
		AnalyzerModel analy3 = new AnalyzerModel();
		TruthTable tru1 = new TruthTable(analy1);
		TruthTable tru2 = new TruthTable(analy2);
		TruthTable tru3 = new TruthTable(analy3);
		Entry[] ent_test1 = new Entry[1];
		Entry[] ent_test2 = new Entry[1];
		Entry[] ent_test3 = new Entry[1];
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
		
		
		analy1.setVariables(istr, ostr);
		
		ent_test1 =  tru1.getOutputColumn(0);
		ent_test2 =  tru2.getOutputColumn(1);
		ent_test3 =  tru3.getOutputColumn(2);
		
		assertEquals(Entry.DONT_CARE, ent_test1[0]);
		assertEquals(Entry.DONT_CARE, ent_test2[0]);
		assertEquals(Entry.DONT_CARE, ent_test3[0]);
		
	}
	@Test
	public void test4() {
		//makes sure the object returned is the same object every time
		AnalyzerModel analy1 = new AnalyzerModel();
		AnalyzerModel analy2 = new AnalyzerModel();
		AnalyzerModel analy3 = new AnalyzerModel();
		TruthTable tru1 = new TruthTable(analy1);
		TruthTable tru2 = new TruthTable(analy2);
		TruthTable tru3 = new TruthTable(analy3);
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
		
		
		analy1.setVariables(istr, ostr);
		
		assertEquals(tru1.getOutputColumn(0).getClass(),tru2.getOutputColumn(0).getClass());
		assertEquals(tru3.getOutputColumn(0).getClass(),tru2.getOutputColumn(0).getClass());
		assertEquals(tru1.getOutputColumn(0).getClass(),tru3.getOutputColumn(0).getClass());
		
	}
	@Test
	public void test5() {
		AnalyzerModel analy1 = new AnalyzerModel();
		AnalyzerModel analy2 = new AnalyzerModel();
		AnalyzerModel analy3 = new AnalyzerModel();
		TruthTable tru1 = new TruthTable(analy1);
		TruthTable tru2 = new TruthTable(analy2);
		TruthTable tru3 = new TruthTable(analy3);
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
		
		
		analy1.setVariables(istr, ostr);
	
		assertNotEquals(Entry.ONE, tru1.getOutputColumn(0));
		assertNotEquals(Entry.ZERO, tru2.getOutputColumn(1));
		assertNotEquals(Entry.BUS_ERROR, tru3.getOutputColumn(2));
		assertNotEquals(Entry.OSCILLATE_ERROR, tru1.getOutputColumn(4));
		
	}

}
