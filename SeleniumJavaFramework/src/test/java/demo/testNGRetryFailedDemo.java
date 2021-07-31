package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNGRetryFailedDemo {
	
	
	@Test
	public void test1() {
		System.out.println("~~~~~~Test 1 ");
	}
	
	
	@Test(retryAnalyzer =  listeners.RetryAnalyzer.class)
	public void test2() {
		System.out.println("~~~~~~Test 2 ");
		
		//int i=1/0;
	}
	
	
	
	@Test(retryAnalyzer =  listeners.RetryAnalyzer.class)
	public void test3() {
		System.out.println("~~~~~~Test 3 ");
		Assert.assertTrue(false);
	}

	
	
}
