package com.ZMS.GenericUtils;

import java.time.Duration;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities 
{
	WebDriver driver;
	public WebDriverUtilities(WebDriver driver)
	{
		this.driver=driver;
	}

	public void maximize()
	{
		driver.manage().window().maximize();
	}
	public void minimize()
	{
		driver.manage().window().minimize();
	}
	public void waitSynchro()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void dropdown(WebElement element,int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public void dropdown(WebElement element,String visibletext)
	{
		Select select=new Select(element);
		select.selectByVisibleText(visibletext);
	}
	public void dropdown(String value,WebElement element)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public void alertaccept()
	{
		driver.switchTo().alert().accept();
	}
	public void alertdismiss()
	{
		driver.switchTo().alert().dismiss();
	}

}
