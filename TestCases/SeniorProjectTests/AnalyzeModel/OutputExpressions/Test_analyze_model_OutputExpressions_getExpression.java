package SeniorProjectTests.AnalyzeModel.OutputExpressions;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.logisim.analyze.model.AnalyzerModel;
import com.cburch.logisim.analyze.model.Expression;
import com.cburch.logisim.analyze.model.OutputExpressions;

/*
 * 1. makes sure the output is the same when given the same input
 * 2. makes sure it returns null when string is null
 * 3. throws an exception when the wrong argument is given
 * 4. makes sure that the object returned is the correct one
 * 5. makes sure it returns the same output when called multiple times
 */

public class Test_analyze_model_OutputExpressions_getExpression {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//makes sure the output is the same when given the same input
		AnalyzerModel analy_test1 = new AnalyzerModel();
		AnalyzerModel analy_test2 = new AnalyzerModel();
		AnalyzerModel analy_test3 = new AnalyzerModel();
		OutputExpressions out_test1 = new OutputExpressions(analy_test1);
		OutputExpressions out_test2 = new OutputExpressions(analy_test2);
		OutputExpressions out_test3 = new OutputExpressions(analy_test3);
		Expression exp_test1 = null;
		Expression exp_test2 = null;
		Expression exp_test3 = null;
		
		out_test1.setExpression(null, exp_test1);
		out_test2.setExpression(null, exp_test2);
		out_test3.setExpression(null, exp_test3);
		exp_test1 = out_test1.getExpression(null);
		exp_test2 = out_test2.getExpression(null);
		exp_test3 = out_test2.getExpression(null);

		assertEquals(exp_test1, exp_test2);
		assertEquals(exp_test2, exp_test3);
		assertEquals(exp_test1, exp_test3);
		
	}
	
	@Test
	public void test2() {
		//makes sure it returns null when string input is null
		AnalyzerModel analy_test1 = new AnalyzerModel();
		AnalyzerModel analy_test2 = new AnalyzerModel();
		AnalyzerModel analy_test3 = new AnalyzerModel();
		OutputExpressions out_test1 = new OutputExpressions(analy_test1);
		OutputExpressions out_test2 = new OutputExpressions(analy_test2);
		OutputExpressions out_test3 = new OutputExpressions(analy_test3);
		Expression exp_test1 = null;
		Expression exp_test2 = null;
		Expression exp_test3 = null;
		
		out_test1.setExpression(null, exp_test1);
		out_test2.setExpression(null, exp_test2);
		out_test3.setExpression(null, exp_test3);
		exp_test1 = out_test1.getExpression(null);
		exp_test2 = out_test2.getExpression(null);
		exp_test3 = out_test2.getExpression(null);

		assertEquals(null, out_test1.getExpression(null));
		assertEquals(null, out_test2.getExpression(null));
		assertEquals(null, out_test3.getExpression(null));
	}
	
	@Test
	public void test3() {
		//throws an exception when the wrong argument is given
		AnalyzerModel analy_test1 = new AnalyzerModel();
		AnalyzerModel analy_test2 = new AnalyzerModel();
		AnalyzerModel analy_test3 = new AnalyzerModel();
		OutputExpressions out_test1 = new OutputExpressions(analy_test1);
		OutputExpressions out_test2 = new OutputExpressions(analy_test2);
		OutputExpressions out_test3 = new OutputExpressions(analy_test3);
		
		try
		{
			out_test1.getExpression("test1");
		}
		catch(IllegalArgumentException e)
		{
			System.out.print("Test 3 in OutputExpressions getExpression IllegalArgumentException: " + e + "\n");
		}
		try
		{
			out_test2.getExpression("test2");
		}
		catch(IllegalArgumentException e)
		{
			System.out.print("Test 3 in OutputExpressions getExpression IllegalArgumentException: " + e + "\n");
		}
		try
		{
			out_test3.getExpression("test3");
		}
		catch(IllegalArgumentException e)
		{
			System.out.print("Test 3 in OutputExpressions getExpression IllegalArgumentException: " + e + "\n");
		}
		
	}
	
	@Test
	public void test4() {
		//makes sure that the object returned is the correct one
		AnalyzerModel analy_test1 = new AnalyzerModel();
		AnalyzerModel analy_test2 = new AnalyzerModel();
		AnalyzerModel analy_test3 = new AnalyzerModel();
		OutputExpressions out_test1 = new OutputExpressions(analy_test1);
		OutputExpressions out_test2 = new OutputExpressions(analy_test2);
		OutputExpressions out_test3 = new OutputExpressions(analy_test3);
		Expression exp_test1 = null;
		Expression exp_test2 = null;
		Expression exp_test3 = null;
		List<String> istr = new ArrayList<String>(10);
		List<String> ostr = new ArrayList<String>(10);

		
		for(int i = 0; i <= 10; i++)
		{
			istr.add(i, "test input " + i);
			ostr.add(i, "test output " + i);
		}
		
		analy_test1.setVariables(istr, ostr);
		
		out_test1.setExpression(null, exp_test1);
		out_test2.setExpression(null, exp_test2);
		out_test3.setExpression(null, exp_test3);
		exp_test1 = out_test1.getExpression(null);
		exp_test2 = out_test2.getExpression(null);
		exp_test3 = out_test2.getExpression(null);
		
		assertEquals(out_test1.getClass(), out_test2.getClass());
		assertEquals(out_test1.getClass(), out_test3.getClass());
		assertEquals(out_test2.getClass(), out_test3.getClass());

	}
	
	@Test
	public void test5() {
		//
		AnalyzerModel analy_test1 = new AnalyzerModel();
		AnalyzerModel analy_test2 = new AnalyzerModel();
		AnalyzerModel analy_test3 = new AnalyzerModel();
		OutputExpressions out_test1 = new OutputExpressions(analy_test1);
		OutputExpressions out_test2 = new OutputExpressions(analy_test2);
		OutputExpressions out_test3 = new OutputExpressions(analy_test3);
		Expression exp_test1 = null;
		Expression exp_test2 = null;
		Expression exp_test3 = null;
		List<String> istr = new ArrayList<String>(10);
		List<String> ostr = new ArrayList<String>(10);

		
		for(int i = 0; i <= 10; i++)
		{
			istr.add(i, "test input " + i);
			ostr.add(i, "test output " + i);
		}
		
		analy_test1.setVariables(istr, ostr);
		
		out_test1.setExpression(null, exp_test1);
		out_test2.setExpression(null, exp_test2);
		out_test3.setExpression(null, exp_test3);
		exp_test1 = out_test1.getExpression(null);
		exp_test2 = out_test2.getExpression(null);
		exp_test3 = out_test2.getExpression(null);
		
		assertEquals(exp_test1, exp_test2);
		assertEquals(exp_test1, exp_test2);
		
		exp_test1 = out_test1.getExpression(null);
		exp_test2 = out_test2.getExpression(null);
		
		assertEquals(exp_test1, exp_test2);
		assertEquals(exp_test1, exp_test2);
		
	}

}
