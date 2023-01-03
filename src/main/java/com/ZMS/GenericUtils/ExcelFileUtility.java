package com.ZMS.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility
{
	public String readdatafromexcel(String sheetname,int row,int cell) throws Exception
	{
		FileInputStream f=new FileInputStream(IPathConstants.excelpath);
		Workbook w=WorkbookFactory.create(f);//abstract methods are present in WorkbookFactory class.
		String value=w.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;
	     
	}
	public String readdatafromeexcel(String path,String sheetname,int row,int cell) throws Exception
	{
		FileInputStream f=new FileInputStream(path);
		Workbook w=WorkbookFactory.create(f);
		String value=w.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
	

}
