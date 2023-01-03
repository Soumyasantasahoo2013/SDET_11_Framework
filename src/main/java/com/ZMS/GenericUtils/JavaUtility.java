package com.ZMS.GenericUtils;

import java.util.Random;

import com.github.javafaker.Faker;

public class JavaUtility
{
	Faker f=new Faker();
	public int random()
	{
	Random rn=new Random();
	int value=rn.nextInt(100);
     return value;
}
	
public String getvisitorname()
{
	return f.name().firstName();
}
public String getNoOfAdult()
{
	return f.number().digits(1);
}
public String getNoOfChild()
{
	return f.number().digits(1);
}
public long getCageno()
{
	return f.number().randomNumber();
}
public long getFeedno()
{
	return f.number().randomNumber();
}
public String getprice()
{
	return f.number().digits(3);

}

}