package com.DDT.practice;

import org.testng.annotations.Test;

public class ReadDataFromCMDTest {

	@Test
	public void readDataFromCMD()
	{
		String URL = System.getProperty("url");
		String UN = System.getProperty("un");
		String PWD = System.getProperty("pwd");
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);
	}

}
