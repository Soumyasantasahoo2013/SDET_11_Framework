package com.testng.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {

	@Test
	public void assertTest()
	{
		System.out.println("Hii");
		Assert.assertEquals("A", "B");
		System.out.println("Hello");
	}

}
