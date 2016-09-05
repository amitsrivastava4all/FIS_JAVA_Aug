package com.srivastava.testcases;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;;

public class TestDemo2 {
	@BeforeClass
	public void start(){
		
	}
	
	

	 @Before 
	   public void setUp() {
	      
	   }
	
	 // @Test(expected = ArithmeticException.class)
	 //  @Test(timeout = 1000)
	 //@Ignore
	@Test
	public void test() {
		// assertEquals(boolean expected, boolean actual)
		
		Assert.assertTrue(10>2);
		Assert.assertFalse(10 > 6);
	Assert.assertNotNull(null);  //assertNull
	}
	
	
	@After
	   public void tearDown() {
	      
	   }

	@AfterClass
	public void stop(){
		
	}
}
