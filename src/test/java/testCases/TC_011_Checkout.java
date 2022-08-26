package testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Checkout;
import pageObjects.HomePage;

import testBase.BaseClass;

@Test
public class TC_011_Checkout extends BaseClass {
	
	public void test_Checkout() throws InterruptedException {
		
		logger.info("Starting TC_010_ShoppingCart");
		try
		{
		driver.get(rb.getString("appURL"));
		HomePage hp=  new HomePage(driver);
	    logger.info("Home Page Displayed ");
	    
	    driver.manage().window().maximize();
	    
	    Checkout co= new Checkout(driver);
	    
	    co.search_txt("imac");
	    logger.info("Enter Any Product");
	    Thread.sleep(1000);	
	    
	    co.search_button();
	    logger.info("Clicked OnThe Search Button Icon");
	    Thread.sleep(1000);
	    
	    co.searched_product();
	    logger.info("clicked On The Searched Product");
	    Thread.sleep(1000);
	    
	    co.add_to_cart();
	    logger.info("Clicked On Add To Cart");
	    Thread.sleep(1000);
	    
	    co.view_cart();
	    logger.info("Clicked on the View Cart");
	    Thread.sleep(2000);
	    
	    co.check_out();
	    logger.info("Clicked on The Checkout");
	    Thread.sleep(2000);
	    
	/*    co.register_account();
	    logger.info("Clicked On The REgister Accountt");
	    Thread.sleep(2000);
	    
	    co.guess_chckout();
	    logger.info("Clicked on The Guess Account");
	    Thread.sleep(3000);
	    
	    co.button0();
	    logger.info("Clicked On The Continue Button");
	    Thread.sleep(5000);    
	    
	  
	    
	    co.setEmail(rb.getString("prasadtirth9006@gmail.com"));
	    logger.info("Provided Email");
	    
	    co.setPassword(rb.getString("test123"));
	    logger.info("Provided  Password");
	    
	    co.clickLogin();
	    logger.info("Clicked on Login");    */
	    
	    co.setEmail("prasadtirth9006@gmail.com");
	    logger.info("Email Provided");
	    
	    co.setPassword("test123");
	    logger.info("Password Provided");
	    
	    co.clickLogin();
	    logger.info("Clicked On The Login");
	    
        co.button1();
	    Thread.sleep(2000);
	    
	    co.button2();
	    Thread.sleep(3000);
	    
		co.button3();
		Thread.sleep(3000);
		
		co.checkbox_click();
		Thread.sleep(1000);
		
		co.button4();
		Thread.sleep(2000);
		
		co.continueorder();
		Thread.sleep(3000);       
		
	    boolean targetpage=co.isPagExists();
	    
	    if(targetpage)
	    {
	    	logger.info("Checkout Failed ");
	    	captureScreen(driver, "test_checkout");
			Assert.assertTrue(false);
	    }
	    
	    else
		{
			logger.info("Checkout Success ");
			
			Assert.assertTrue(true);
		}
	}	
	catch(Exception e)
	{
		logger.fatal("Checkout Failed ");
		Assert.fail();
	}
	
	logger.info(" Finished TC_011_Checkout ");
	
}
}	