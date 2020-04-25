package com.swagLabs.qa.loginTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.swabLabs.qa.util.TestUtil;
import com.swagLabs.qa.base.TestBase;
import com.swagLabs.qa.pages.LoginPage;
import com.swagLabs.qa.pages.ProductsPage;

public class TC_003_Login_Test_With_Valid_User extends TestBase {

	LoginPage loginPage;
	ProductsPage productsPage;
	TestUtil testUtil;
	
	String sheetName = "Sheet1";
	
	public TC_003_Login_Test_With_Valid_User(){
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
	public void login_Test_Valid_User(String username, String password){
		
		productsPage = loginPage.login(username, password);
		productsPage.validateProductsPage();
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}
	

}



	

