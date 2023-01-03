package com.ZMS.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.ZMS.GenericUtils.BaseClass;
import com.ZMS.GenericUtils.ExcelFileUtility;
import com.ZMS.GenericUtils.PropertyFileUtility;
import com.ZMS.GenericUtils.JavaUtility;
import com.ZMS.GenericUtils.WebDriverUtilities;
import com.ZMS.ObjectRepository.HomePage;
import com.ZMS.ObjectRepository.LoginPage;
import com.ZMS.ObjectRepository.ManageTypeTicket;

public class ManageTicketTest extends BaseClass
{
	@Test
	public void manageticket() throws Exception
	{
		ExcelFileUtility eUtil=new ExcelFileUtility();
		JavaUtility jUtil=new JavaUtility();

		String price1=eUtil.readdatafromexcel("Sheet2", 1, 0)+jUtil.getprice();

		wUtil.waitSynchro();	

		Thread.sleep(3000);

		ManageTypeTicket mt=new ManageTypeTicket(driver);
		mt.getManageTypeTicket().click();
		mt.getEdit().click();
		Thread.sleep(2000);
		mt.getPrice().clear();
		Thread.sleep(2000);
		mt.getPrice().sendKeys(price1);
		mt.getSubButton().click();
		Thread.sleep(2000);

		wUtil.alertaccept();
		mt.getManageTypeTicket().click();

		String price=driver.findElement(By.xpath("//td[.=' $ "+price1+"']")).getText();

		String Actualprice= "$"+" "+price1  ;
		if(price.equals(Actualprice))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}	
		HomePage hm =new HomePage(driver);
		hm.getAdmin().click();
	}
}