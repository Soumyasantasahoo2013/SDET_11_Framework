package com.ZMS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{

	@FindBy(xpath="//span[.='Animals Details']")
	private WebElement AnimalDetails;

	@FindBy(xpath="//a[@href='add-animals.php']")
	private WebElement Add_Animal;


	@FindBy(xpath="//a[@href='manage-animals.php']")
	private WebElement	Manage_Animals;

	@FindBy(xpath="//h4[@data-toggle='dropdown']")
	private WebElement Admin;

	@FindBy(xpath="//a[.='Log Out']")
	private WebElement Logout;


	@FindBy(xpath="//span[text()='Normal Ticket']")
	private WebElement NormalTicket;	
	
	@FindBy(xpath="//a[@href='add-normal-ticket.php']")
	private WebElement AddTicket;
	

	@FindBy(xpath="//a[@href='manage-normal-ticket.php']")
	private WebElement ManageTicket;
	
	
	public WebElement getManageTicket() {
		return ManageTicket;
	}

	public WebElement getAddTicket() {
		return AddTicket;
	}

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getManage_Animals() {
		return Manage_Animals;
	}

	public WebElement getNormalTicket() {
		return NormalTicket;
	}

	public WebElement getAnimalDetails() {
		return AnimalDetails;
	}

	public WebElement getAdd_Animal() {
		return Add_Animal;
	}

	public WebElement getAdmin() {
		return Admin;
	}

	public WebElement getLogout() {
		return Logout;
	}








}
