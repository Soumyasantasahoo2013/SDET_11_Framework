package com.ZMS.GenericUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility 
{
	public String readdatafrompropfile(String key) throws Exception
	{
		FileInputStream f=new FileInputStream(IPathConstants.filepath1);
		Properties p=new Properties();
		p.load(f);
		String value=p.getProperty(key);
		return value;
		
	
		
		
	}

}
