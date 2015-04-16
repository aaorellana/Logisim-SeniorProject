package SeniorProjectTests.AnalyzeModel.OutputExpressions;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.logisim.analyze.model.AnalyzerModel;
import com.cburch.logisim.analyze.model.Expression;
import com.cburch.logisim.analyze.model.OutputExpressions;

/*
 * 1. throws and error when given null
 * 2.
 * 3.
 * 4.
 * 5.
 */

public class Test_analyze_model_OutputExpressions_isExpressionMinimal {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		//throws and error when given null
		AnalyzerModel analy_test1 = new AnalyzerModel();
		AnalyzerModel analy_test2 = new AnalyzerModel();
		AnalyzerModel analy_test3 = new AnalyzerModel();
		OutputExpressions out_test1 = new OutputExpressions(analy_test1);
		OutputExpressions out_test2 = new OutputExpressions(analy_test2);
		OutputExpressions out_test3 = new OutputExpressions(analy_test3);

		try
		{
			out_test1.isExpressionMinimal(null);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test 1 in AnalyzeModel OutputExpressions isEspressionMinimal: " + e);
		}
		try
		{
			out_test2.isExpressionMinimal(null);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test 1 in AnalyzeModel OutputExpressions isEspressionMinimal: " + e);
		}
		try
		{
			out_test3.isExpressionMinimal(null);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test 1 in AnalyzeModel OutputExpressions isEspressionMinimal: " + e);
		}
		
		
	}
	@Test
	public void test2() {
		AnalyzerModel analy_test1 = new AnalyzerModel();
		AnalyzerModel analy_test2 = new AnalyzerModel();
		AnalyzerModel analy_test3 = new AnalyzerModel();
		OutputExpressions out_test1 = new OutputExpressions(analy_test1);
		OutputExpressions out_test2 = new OutputExpressions(analy_test2);
		OutputExpressions out_test3 = new OutputExpressions(analy_test3);
		Expression exp_test1 = null;
		Expression exp_test2 = null;
		Expression exp_test3 = null;
		
		//out_test1.setExpression(output, expr, exprString);
		
	}
	@Test
	public void test3() {
		fail("Not yet implemented");
	}
	@Test
	public void test4() {
		fail("Not yet implemented");
	}
	@Test
	public void test5() {
		fail("Not yet implemented");
	}

}
