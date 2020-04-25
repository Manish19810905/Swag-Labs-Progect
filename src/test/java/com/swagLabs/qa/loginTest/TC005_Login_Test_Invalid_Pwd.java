package com.swagLabs.qa.loginTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.swabLabs.qa.util.TestUtil;
import com.swagLabs.qa.base.TestBase;
import com.swagLabs.qa.pages.LoginPage;
import com.swagLabs.qa.pages.ProductsPage;

public class TC005_Login_Test_Invalid_Pwd extends TestBase {
	
	LoginPage loginPage;
	ProductsPage productsPage;
	TestUtil testUtil;
	
	String sheetName = "Sheet3";
	
	public TC005_Login_Test_Invalid_Pwd(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		
		initialization();
		loginPage = new LoginPage();
		}
	
	@DataProvider
	public Object[][] getSwagLabsestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider="getSwagLabsestData")
	public void login_Test_Locked_User(String username, String password){
		loginPage.login(username, password);
		loginPage.login_test_invalid_password();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}
	

}



	






