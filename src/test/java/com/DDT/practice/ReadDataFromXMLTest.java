package com.DDT.practice;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromXMLTest {
	
	@Test
	public void readDataFromXML(XmlTest xml)
	{
		String URL=xml.getParameter("url");
		System.out.println(URL);
	}
	
}
