package com.testng.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest {

	@BeforeClass
	public void openBrowser()
	{
		System.out.println("Open Browser");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("Login");
	}
	
	@Test
	public void addTicket()
	{
		System.out.println("Adding Ticket");
	}
	
	@Test
	public void manageTicket()
	{
		System.out.println("Managing Ticket");
	}
	
	@AfterMethod
	public void logOut()
	{
		System.out.println("Logout");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Close Browser");
	}

}
