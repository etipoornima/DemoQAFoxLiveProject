package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;


public class HeadersSection {
	
	//When ever "this" constructor is called by creating an object for this class all the "Page object Elements" present in the class 
	//should be initialized automatically as per the "POM" framework
	
	public HeadersSection(){
		
		PageFactory.initElements(Base.driver, this);		//Here 'this' is "HeaderSection" class
	}
	
	
	@FindBy(xpath="//span[text()=\"My Account\"]")
	public static WebElement myAccountLink;
	
	@FindBy(xpath="//a[text()=\"Register\"]")
	public static WebElement register;

}
