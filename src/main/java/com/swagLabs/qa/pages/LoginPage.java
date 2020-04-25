package com.swagLabs.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.swagLabs.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
//page factory 
	
//webelement username
@FindBy(xpath="//input[@id='user-name']")
WebElement username;
		
//webelement password
@FindBy(xpath="//input[@id='password']")
WebElement password;
		
//webelement login button 
@FindBy(xpath = "//input[@type='submit']")
WebElement loginBtn;
	
//webelement loginLogo
@FindBy(xpath="//div[@class='login_logo']")
WebElement loginLogoele;

//webelement error msg for locked user
@FindBy(xpath="//*[@id='login_button_container']/div/form/h3")
WebElement lockederrorMsgEle;

//webelement error msg for invalid password
@FindBy(xpath="//*[@id='login_button_container']/div/form/h3")
WebElement invalidPwderrorMsgEle;




String  lockedErrMsg = "Epic sadface: Sorry, this user has been locked out.";
String invalidPwdErrMsg = "Epic sadface: Username and password do not match any user in this service";
	
		
		
//Initialization the page object
public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
// Function to validate page title
public void validate_Login_Page_Title(){
String title = driver.getTitle();
System.out.println("Login page title is:" +title);
Assert.assertEquals(title, "Swag Labs", "Login page title not matched");
		}
		
// Funcation to validate login page logo
public void validate_Login_Page_Logo(){
boolean flag = loginLogoele.isDisplayed();
Assert.assertTrue(flag);
		}

// login test with valid user
public ProductsPage login(String un, String pwd){
	
	username.sendKeys(un);
	password.sendKeys(pwd);
	loginBtn.click();
	
	return new ProductsPage();
		}

public void login_test_locked_user(){
	
	String acpectedResult = lockedErrMsg;
	System.out.println("Acpected result is: "+acpectedResult);
	String actualErrMsg = lockederrorMsgEle.getText();
	System.out.println("Actual error massage is: "+actualErrMsg);
	Assert.assertEquals(actualErrMsg, acpectedResult);
		}

public void login_test_invalid_password(){
	
	String acpectedResult = invalidPwdErrMsg;
	System.out.println("Acpected result is: "+acpectedResult);
	String actualErrMsg = invalidPwderrorMsgEle.getText();
	System.out.println("Actual error massage is: "+invalidPwderrorMsgEle);
	Assert.assertEquals(actualErrMsg, acpectedResult);
		}

			}
