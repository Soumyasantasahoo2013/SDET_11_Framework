package com.testng.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ZMS.GenericUtils.BaseClass;

@Listeners(com.ZMS.GenericUtils.ListenerImp.class)
public class ListenerTest extends BaseClass {

	@Test
	public void listenerTest()
	{
		System.out.println("Hii");
		int a=10/0;
		System.out.println(a);
	}

}
