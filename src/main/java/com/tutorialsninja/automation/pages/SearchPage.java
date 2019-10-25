package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class SearchPage {
	
	public SearchPage(){
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	
	@FindBy(css="img[class='img-responsive'][title='Samsung SyncMaster 941BW']")
	public static WebElement searchResult;
	
	@FindBy(css="input[id='button-search']+h2+p")
	public static WebElement noResultMessage;
	
	
}
