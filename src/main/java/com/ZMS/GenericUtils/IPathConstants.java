package com.ZMS.GenericUtils;

public interface IPathConstants 
{
	/* In this interface we will store all the file paths
	 * In his interface every variable is public,static and final by default
	 * In interface every method is abstract by default
	 */
		
	String USERDIR=System.getProperty("user.dir");
	public static final String filepath1=USERDIR+"./ProjectCredentials.properties";
	public static final String excelpath=USERDIR+"./Exceldata.xlsx";
			

}
