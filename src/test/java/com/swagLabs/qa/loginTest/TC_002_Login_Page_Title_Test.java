package com.swagLabs.qa.loginTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.swagLabs.qa.base.TestBase;
import com.swagLabs.qa.pages.LoginPage;

public class TC_002_Login_Page_Title_Test extends TestBase {

LoginPage loginPage;
	
public TC_002_Login_Page_Title_Test(){
		super();
		}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		}
	
	// validate login page title
	
	@Test
	public void loginPageTitleTest() throws InterruptedException{
		loginPage.validate_Login_Page_Title();
		
		}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}
	

}


