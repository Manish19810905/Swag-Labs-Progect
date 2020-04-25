package com.swagLabs.qa.loginTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.swagLabs.qa.base.TestBase;
import com.swagLabs.qa.pages.LoginPage;



public class TC_001_Login_Page_Logo_Test extends TestBase {
	
	LoginPage loginPage;
	
	public TC_001_Login_Page_Logo_Test(){
		super();
		}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		}
	
	// validate login page logo
	@Test
	public void loginPageLogoTest(){
		loginPage.validate_Login_Page_Logo();
		}
	
	
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
		}
	
}




