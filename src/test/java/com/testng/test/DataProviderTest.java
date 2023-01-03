package com.testng.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "provideData")
	public void addAnimals(String animalName, double price)
	{
		System.out.println(animalName+" price is "+price);
	}
	
	@DataProvider
	public Object[][] provideData()
	{
		Object [][] objArr=new Object[3][2];
		
		objArr[0][0]="Tiger";
		objArr[0][1]=1000;
		
		objArr[1][0]="Lion";
		objArr[1][1]=2000;

		objArr[2][0]="Horse";
		objArr[2][1]=500;
		
		return objArr;
	}

}
