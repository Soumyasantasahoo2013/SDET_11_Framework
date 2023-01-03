package com.testng.test;

import org.testng.annotations.Test;

public class RetryAnalyserTest {

	@Test(retryAnalyzer = com.ZMS.GenericUtils.RetryAnalyser.class)
	public void retryTest()
	{
		System.out.println("Hii");
		int a=10/0;
		System.out.println(a);
	}

}
