package com.ZMS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageTypeTicket
{
	@FindBy(xpath="//a[@href='manage-ticket.php']")
	private WebElement ManageTypeTicket;

	@FindBy(xpath="//a[@href='edit-ticket.php?editid=1']")
	private WebElement Edit;
	
	@FindBy(id="tprice")
	private WebElement price;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement subButton;
	
	public ManageTypeTicket(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getManageTypeTicket() {
		return ManageTypeTicket;
	}

	public WebElement getEdit() {
		return Edit;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getSubButton() {
		return subButton;
	}
	
	
	
}
