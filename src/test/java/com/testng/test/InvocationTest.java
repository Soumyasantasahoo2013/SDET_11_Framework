package com.testng.test;

import org.testng.annotations.Test;

public class InvocationTest {

	@Test(invocationCount = 5)
	public void addTicket()
	{
		System.out.println("Adding ticket");
	}
	
	@Test(enabled = true)
	public void addAnimal()
	{
		System.out.println("Adding Animal");
	}
	
	

}
