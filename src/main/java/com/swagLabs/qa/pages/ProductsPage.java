package com.swagLabs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swagLabs.qa.base.TestBase;

public class ProductsPage extends TestBase {

	//webelement products label
	@FindBy(xpath="//div[@class='product_label']")
	WebElement ProductLebel;
	
	//Initialization the page object
	public ProductsPage(){
				PageFactory.initElements(driver, this);
			}
	
	public boolean validateProductsPage(){
		return ProductLebel.isDisplayed();
				}
			
	}
