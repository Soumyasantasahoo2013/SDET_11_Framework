package com.ZMS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NormalTicket
{
	@FindBy(id="visitorname")
	private WebElement Visitorname;

	@FindBy(id="noadult")
	private WebElement Noadult;
	
	@FindBy(id="nochildren")
	private WebElement Nochildren;
	
	@FindBy(name="submit")
	private WebElement subButton;
	
	@FindBy(xpath="//a[@href='view-normal-ticket.php?viewid=162']")
	private WebElement View;
	
	@FindBy(xpath="//a[@href='manage-normal-ticket.php?id=162&del=delete']")
	private WebElement Delete;
	
	
	public WebElement getView() {
		return View;
	}


	public WebElement getDelete() {
		return Delete;
	}


	public NormalTicket(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getVisitorname() {
		return Visitorname;
	}

	public WebElement getNoadult() {
		return Noadult;
	}

	public WebElement getNochildren() {
		return Nochildren;
	}

	public WebElement getSubButton() {
		return subButton;
	}
	
	
	
	
}





