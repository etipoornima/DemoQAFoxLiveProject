package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class AccountSuccessPage {
	
	//When ever "this" constructor is called by creating an object for this class all the "Page object Elements" present in the class 
	//should be initialized automatically as per the "POM" framework
	
	public AccountSuccessPage(){
		
	PageFactory.initElements(Base.driver, this);	//Here 'this' is "AccountSuccessPage" class
	
	}
	
	@FindBy(linkText="Success")
	public static WebElement successBreadcrumb;

}
