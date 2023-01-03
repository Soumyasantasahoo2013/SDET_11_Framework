package com.testng.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

	@Test
	public void softAssertTest()
	{
		System.out.println("Hii");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("A", "B");
		System.out.println("Hello");
		
		sa.assertAll();
	}

}
