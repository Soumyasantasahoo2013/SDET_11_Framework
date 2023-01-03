package com.ZMS.GenericUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.ZMS.ObjectRepository.HomePage;
import com.ZMS.ObjectRepository.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public WebDriverUtilities wUtil;
	public PropertyFileUtility pUtil=new PropertyFileUtility();
	public static WebDriver sdriver;
	
	//@Parameters("browser")
	@BeforeClass
	public void launchlogin() throws Throwable
	{
		String browser = pUtil.readdatafrompropfile("browser");
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		
		wUtil=new WebDriverUtilities(driver);
		wUtil.maximize();
		sdriver=driver;
		
	}
	
	@BeforeMethod
	public void setLogin() throws Throwable
	{
		LoginPage lp=new LoginPage(driver);
		String URL = pUtil.readdatafrompropfile("url");
		String UN= pUtil.readdatafrompropfile("un");
		String PWD=pUtil.readdatafrompropfile("pwd");
		driver.get(URL);
		lp.LoginApp(UN, PWD);
	}
	
	@AfterMethod
	public void logOut()
	{
		HomePage hp=new HomePage(driver);
		hp.getLogout().click();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
