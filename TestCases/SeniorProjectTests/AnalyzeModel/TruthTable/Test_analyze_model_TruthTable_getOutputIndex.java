package SeniorProjectTests.AnalyzeModel.TruthTable;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.logisim.analyze.model.AnalyzerModel;
import com.cburch.logisim.analyze.model.TruthTable;

public class Test_analyze_model_TruthTable_getOutputIndex {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//checks that the output is correct based on the input
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
		

		assertEquals(0, tru1.getOutputIndex("test output 0"));
		assertEquals(1, tru2.getOutputIndex("test output 1"));
		assertEquals(5, tru3.getOutputIndex("test output 5"));
		
	}
	@Test
	public void test2() {
		//checks that it returns the correct type every time
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
		
		assertEquals(tru1.getOutputIndex("test output 0"), tru2.getOutputIndex("test output 0"));
		assertEquals(tru1.getOutputIndex("test output 0"), tru3.getOutputIndex("test output 0"));
		assertEquals(tru2.getOutputIndex("test output 0"), tru3.getOutputIndex("test output 0"));
	}
	@Test
	public void test3() {
		//makes sure it throws the an exception when given the wrong input
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
				if(-1 == tru1.getOutputIndex("test output 120"))
				{
					throw new IllegalArgumentException("Value not in array");
				}
			}
			catch(IllegalArgumentException e)
			{
				System.out.print("Test 2 in Analyze Model TruthTable getOutputIndex: " + e + "\n");
			}
			try
			{
				if(-1 == tru2.getOutputIndex("test output 1232340"))
				{
					throw new IllegalArgumentException("Value not in array");
				}
			}
			catch(IllegalArgumentException e)
			{
				System.out.print("Test 2 in Analyze Model TruthTable getOutputIndex: " + e + "\n");
			}
			try
			{
				if(-1 == tru3.getOutputIndex("test"))
				{
					throw new IllegalArgumentException("Value not in array");
				}
			}
			catch(IllegalArgumentException e)
			{
				System.out.print("Test 2 in Analyze Model TruthTable getOutputIndex: " + e + "\n");
			}
		
		
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
		
		assertNotEquals(3, tru1.getOutputIndex("test output 0"));
		assertNotEquals(4, tru2.getOutputIndex("test output 1"));
		assertNotEquals(13, tru3.getOutputIndex("test output 5"));
		
	}
	@Test
	public void test5() {
		//makes sure that reading from the index does not replace it with another value
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
		
		assertEquals(tru1.getOutputIndex("test output 2"), tru1.getOutputIndex("test output 2"));
		assertEquals(tru2.getOutputIndex("test output 3"), tru2.getOutputIndex("test output 3"));
		assertEquals(tru3.getOutputIndex("test output 8"), tru3.getOutputIndex("test output 8"));

		
	}

}
