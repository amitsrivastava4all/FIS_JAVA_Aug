package com.srivastava.testcases;

import org.junit.Assert;
import org.junit.Test;

public class TestDemo {
	@Test
	   public void testAdd() {
	      String str = "welcome user";
	      Assert.assertEquals("welcome user",str);
	   }
}
