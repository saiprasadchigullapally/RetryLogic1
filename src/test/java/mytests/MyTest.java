package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;



public class MyTest {

	@Test()// retryAnalyzer is keyword (retryAnalyzer=analyzer.RetryAnalyzwer.class)
	public void test1() {
		Assert.assertEquals(false, true);
	}
	
	@Test()
	public void test2() {
		
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void test3() {
		
		Assert.assertEquals(true,true);
	}
}
