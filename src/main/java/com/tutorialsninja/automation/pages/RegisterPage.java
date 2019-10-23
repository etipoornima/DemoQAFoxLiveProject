package com.tutorialsninja.automation.pages;

import java.util.Map;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPage {
	
	//When ever "this" constructor is called by creating an object for this class all the "Page object Elements" present in the class 
	//should be initialized automatically as per the "POM" framework
		
	public RegisterPage(){
		
		PageFactory.initElements(Base.driver, this);	//Here 'this' is "RegisterPage" class
	}
	
	//-----------------------------------------------------------------------------------------------
	//Code to find the WebElements on the Register Page by using 'POM' framework
	@FindBy(id="input-firstname")
	public static WebElement firstName;
	
	@FindBy(id="input-lastname")
	public static WebElement lastName;
		
	@FindBy(id="input-email")
	public static WebElement email;
		
	@FindBy(id="input-telephone")
	public static WebElement telephone;
		
	@FindBy(id="input-password")
	public static WebElement password;
		
	@FindBy(id="input-confirm")
	public static WebElement confirmPassword;
	
	@FindBy(name="agree")
	public static WebElement privacyPolicy;
	
	@FindBy(css="input[type='submit'][value='Continue']")
	public static WebElement continueButton;
	
	@FindBy(linkText="Register")
	public static WebElement registerBreadcrumb;
	
	@FindBy(css="input[name='newsletter'][value='1']")
	public static WebElement yesToNewsLetter;
	
	//-------------------------------------------------------------------------------------------------------
	//Below code is for finding the WebElements for all the Warning messages displayed on the Register Page
	@FindBy(css="input[id='input-firstname']+div")
	public static WebElement firstNameWarning;
	
	@FindBy(css="input[id='input-lastname']+div")
	public static WebElement lastNameWarning;
	
	@FindBy(css="input[id='input-email']+div")
	public static WebElement emailWarning;
	
	@FindBy(css="input[id='input-telephone']+div")
	public static WebElement telephoneWarning;
	
	@FindBy(css="input[id='input-password']+div")
	public static WebElement passwordWarning;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement mainWarning;
	
	
	//---------------------------------------------------------------------------------------------------------
	//Creating a re-usable method for dataTable
	public static void enterAllRegistrationDetails(DataTable dataTable,String detailsType) {
			Map<String,String> map = dataTable.asMap(String.class,String.class);	
			Elements.TypeText(RegisterPage.firstName, map.get("FirstName"));
			Elements.TypeText(RegisterPage.lastName, map.get("LastName"));
			Elements.TypeText(RegisterPage.telephone, map.get("Telephone"));
			Elements.TypeText(RegisterPage.password, map.get("Password"));
			Elements.TypeText(RegisterPage.confirmPassword, map.get("Password"));
			
			if(detailsType.equalsIgnoreCase("duplicate"))
				Elements.TypeText(RegisterPage.email,map.get("Email"));
			else
				Elements.TypeText(RegisterPage.email,System.currentTimeMillis()+map.get("Email"));
				
	}

	
	
	
}
