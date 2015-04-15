package SeniorProjectTests.AnalyzeModel.OutputExpressions;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.cburch.logisim.analyze.model.AnalyzerModel;
import com.cburch.logisim.analyze.model.OutputExpressions;

/*
 * 1. makes sure that when given null it returns ""
 * 2. makes sure that the object returned is the correct one
 * 3. makes sure it returns the same output when called multiple times with null 
 * 	  as the input
 * 4. throws and error when given the wrong input
 * 5. makes sure the returned type is the correct type
 */
//not done
public class Test_analyze_model_OutputExpressions_getExpressionString {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	

	@Test
	public void test1() {
		//makes sure that when given null it returns ""
		AnalyzerModel analy_test1 = new AnalyzerModel();
		AnalyzerModel analy_test2 = new AnalyzerModel();
		AnalyzerModel analy_test3 = new AnalyzerModel();
		OutputExpressions out_test1 = new OutputExpressions(analy_test1);
		OutputExpressions out_test2 = new OutputExpressions(analy_test2);
		OutputExpressions out_test3 = new OutputExpressions(analy_test3);
		
		assertEquals("", out_test1.getExpressionString(null));
		assertEquals("", out_test2.getExpressionString(null));
		assertEquals("", out_test3.getExpressionString(null));
		
	}
	@Test
	public void test2() {
		//makes sure that the object returned is the correct one
		AnalyzerModel analy_test1 = new AnalyzerModel();
		AnalyzerModel analy_test2 = new AnalyzerModel();
		AnalyzerModel analy_test3 = new AnalyzerModel();
		OutputExpressions out_test1 = new OutputExpressions(analy_test1);
		OutputExpressions out_test2 = new OutputExpressions(analy_test2);
		OutputExpressions out_test3 = new OutputExpressions(analy_test3);
		
		assertEquals(out_test1.getExpressionString(null).getClass(), out_test2.getExpressionString(null).getClass());
		assertEquals(out_test1.getExpressionString(null).getClass(), out_test3.getExpressionString(null).getClass());
		assertEquals(out_test3.getExpressionString(null).getClass(), out_test2.getExpressionString(null).getClass());
	}
	@Test
	public void test3() {
		//makes sure it returns the same output when called multiple times
		AnalyzerModel analy_test1 = new AnalyzerModel();
		OutputExpressions out_test1 = new OutputExpressions(analy_test1);

		assertEquals("", out_test1.getExpressionString(null));
		assertEquals("", out_test1.getExpressionString(null));
		assertEquals("", out_test1.getExpressionString(null));
		
	}
	@Test
	public void test4() {
		//throws and error when given the wrong input
		AnalyzerModel analy_test1 = new AnalyzerModel();
		AnalyzerModel analy_test2 = new AnalyzerModel();
		AnalyzerModel analy_test3 = new AnalyzerModel();
		OutputExpressions out_test1 = new OutputExpressions(analy_test1);
		OutputExpressions out_test2 = new OutputExpressions(analy_test2);
		OutputExpressions out_test3 = new OutputExpressions(analy_test3);
		
		try
		{
			out_test1.getExpressionString("Test");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test 4 in AnalyzeModel OutputExpressions getExpressionString: "+ e);
		}
		try
		{
			out_test2.getExpressionString("Test23e3");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test 4 in AnalyzeModel OutputExpressions getExpressionString: "+ e);
		}
		try
		{
			out_test3.getExpressionString("Test234234");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test 4 in AnalyzeModel OutputExpressions getExpressionString: "+ e);
		}
	}
	@Test
	public void test5() {
		//makes sure the returned type is the correct type
		AnalyzerModel analy_test1 = new AnalyzerModel();
		OutputExpressions out_test1 = new OutputExpressions(analy_test1);

		String test;

		test = out_test1.getExpressionString(null);
		
		assertEquals("", out_test1.getExpressionString(null));
		assertEquals(test.length(), out_test1.getExpressionString(null).length());
		assertNotEquals(1, out_test1.getExpressionString(null));
		assertNotEquals(true, out_test1.getExpressionString(null));
		assertNotEquals(false, out_test1.getExpressionString(null));
		test.length();

	}
	


}
