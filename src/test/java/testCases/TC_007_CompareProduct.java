package testCases;

import pageObjects.HomePage;

import org.testng.annotations.Test;

import pageObjects.CompareProduct;
import testBase.BaseClass;

@Test

public class TC_007_CompareProduct extends BaseClass {
	
	public void test_compareproduct () throws InterruptedException 
	{
		logger.info("Strating TC_007_ProductCompare");
		
		 driver.get(rb.getString("appURL"));
		 HomePage hp=  new HomePage(driver);
		 logger.info("Home Page Displayed ");
		 
		 driver.manage().window().maximize();
		 
		 CompareProduct pc = new CompareProduct(driver);
		 pc.search_txt("iMac");
		 

		    Thread.sleep(3000);
			logger.info("Enter any Product"); 
			
			pc.search_button();
			Thread.sleep(3000);
			logger.info("product displayed on HomePage");
			
			
			pc.product_compare();
			Thread.sleep(3000);
			logger.info("products comparing");
			
			pc.productcomparision();
			Thread.sleep(3000);
			
		
	}

}
