package com.ZMS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAnimalPage
{
	@FindBy(id="aname")
	private WebElement AnimalName; 
	

	@FindBy(id="cnum")
	private WebElement CageNo;


	@FindBy(id="fnum")
	private  WebElement Feedno;

	@FindBy(id="breed")
	private WebElement Breed;

	@FindBy(id="desc")
	private WebElement Description;
	
	@FindBy(name="submit")
	private WebElement subButton;



public AddAnimalPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getAnimalName() {
	return AnimalName;
}

public WebElement getCageNo() {
	return CageNo;
}

public WebElement getFeedno() {
	return Feedno;
}

public WebElement getBreed() {
	return Breed;
}

public WebElement getDescription() {
	return Description;
}

public WebElement getSubButton() {
	return subButton;
}
   



}
