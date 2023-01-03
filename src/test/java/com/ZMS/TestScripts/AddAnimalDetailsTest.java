package com.ZMS.TestScripts;

import org.testng.annotations.Test;

import com.ZMS.GenericUtils.BaseClass;
import com.ZMS.GenericUtils.ExcelFileUtility;
import com.ZMS.GenericUtils.PropertyFileUtility;
import com.ZMS.GenericUtils.JavaUtility;
import com.ZMS.GenericUtils.WebDriverUtilities;
import com.ZMS.ObjectRepository.AddAnimalPage;
import com.ZMS.ObjectRepository.HomePage;
import com.ZMS.ObjectRepository.LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAnimalDetailsTest extends BaseClass
{
	@Test
	public void addanimal() throws Exception
	{
		ExcelFileUtility eUtil=new ExcelFileUtility();
		JavaUtility jUtil=new JavaUtility();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Thread.sleep(3000);

		HomePage hm=new HomePage(driver);
		hm.getAnimalDetails().click();
		hm.getAdd_Animal().click();

		String Animalname=eUtil.readdatafromexcel("Sheet1", 1, 0)+jUtil.random();
		String Cagenumber=eUtil.readdatafromexcel("Sheet1", 1, 1)+jUtil.getCageno();
		String feednumber=eUtil.readdatafromexcel("Sheet1", 1, 2)+jUtil.getFeedno();
		String Breed=eUtil.readdatafromexcel("Sheet1", 1, 3);
		String Desc=eUtil.readdatafromexcel("Sheet1", 1, 4);	

		AddAnimalPage aap=new AddAnimalPage(driver);
		aap.getAnimalName().sendKeys(Animalname);
		Thread.sleep(2000);
		driver.findElement(By.id("image")).sendKeys("C:\\Users\\SOUMYASANTA SAHOO\\Desktop\\Standing_white_tiger.jpg");
		aap.getCageNo().sendKeys(Cagenumber);
		aap.getFeedno().sendKeys(feednumber);
		aap.getBreed().sendKeys(Breed);
		aap.getDescription().sendKeys(Desc);
		Thread.sleep(4000);
		aap.getSubButton().click();

		wUtil.alertaccept();

		hm.getAnimalDetails().click();
		hm.getManage_Animals().click();

		String name1=driver.findElement(By.xpath("//td[text()='"+Animalname+"("+Breed+")"+"']")).getText();
		String Actualname=Animalname+"("+Breed+")";
		if(name1.equalsIgnoreCase(Actualname))
		{ 
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test Failed");
		}

		hm.getAdmin().click();
		Thread.sleep(2000);
	}
}