package com.testng.test;

import java.util.Date;

import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void generatingDate()
	{
		new Date().toString().replace(":", "_").replace(" ", "_");

	}

}
