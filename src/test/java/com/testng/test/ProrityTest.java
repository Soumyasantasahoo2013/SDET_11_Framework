package com.testng.test;

import org.testng.annotations.Test;

public class ProrityTest {

	@Test(priority = 1)
	public void addTicket()
	{
		System.out.println("Adding ticket");
	}
	
	@Test(priority = 2)
	public void addAnimal()
	{
		System.out.println("Adding Animal");
	}
	
	@Test(priority = 3)
	public void manageAnimal()
	{
		System.out.println("Manage Animals");
	}

}
