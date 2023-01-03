package com.ZMS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	 @FindBy(id="username")
      private WebElement Un;		 
		
	@FindBy(name="password")
	 private WebElement pwd;
	
	@FindBy(id="form_submit")
	private	WebElement subButton;
	

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);

}

public WebElement getUn() {
	return Un;
}


public WebElement getPwd() {
	return pwd;
}


public WebElement getSubButton() {
	return subButton;
}
public void LoginApp(String username,String password)
{
	Un.sendKeys(username);
	pwd.sendKeys(password);
	subButton.click();
}
}
