package com.testng.test;

import org.testng.annotations.Test;

public class DependsOnTest {

	@Test
	public void addTicket()
	{
		System.out.println("Adding ticket");
	}
	
	@Test(dependsOnMethods = "addTicket")
	public void addAnimal()
	{
		System.out.println("Adding Animal");
	}
	
	@Test(dependsOnMethods = "addAnimal")
	public void manageAnimal()
	{
		System.out.println("Manage Animals");
	}

}
