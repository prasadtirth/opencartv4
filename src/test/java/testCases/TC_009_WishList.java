package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WishList;
import testBase.BaseClass;

@Test
public class TC_009_WishList extends BaseClass {
	
	public void test_wishlist() throws InterruptedException, IOException{
		
		logger.info("Starting TC_009_WishList");
		 try
		 {
		 driver.get(rb.getString("appURL"));
		  HomePage hp=new HomePage(driver);
		  logger.info("Home Page Displayed ");
		  
		  driver.manage().window().maximize();
		  
		  WishList wl =new WishList(driver);
		  
		  wl.search_txt("imac");
		  Thread.sleep(2000);
          logger.info("Enter any Product"); 
		
		  wl.search_button();
	      Thread.sleep(1000);
	      logger.info("clicked on the search button");
	      
	      wl.product_click();
	      Thread.sleep(1000);
	      logger.info("clicked on the searched image");
	      
	      wl.wish_list();
	      Thread.sleep(3000);
	      logger.info("Clicked on the WishList Symbol");
	      
	      wl.clickMyAccount();
	      Thread.sleep(2000);
	      logger.info("Clicked on MyAccount" );
	      
	      wl.clickLogin();
	      Thread.sleep(2000);
	      logger.info("Clicked on the Login");
	 
	      LoginPage lp= new LoginPage(driver);
	      
	      lp.setEmail(rb.getString("email"));
	      logger.info("Email is provided");
	      
	      lp.setPassword(rb.getString("password"));
	      logger.info("Password is Provided");
	      
	      lp.clickLogin();
	      logger.info("Clicked on Login Button");
	      
	      boolean targetpage =wl.isPageExists();
	      
	      if(targetpage)
	      {
	    	  logger.error("WishList Failed");
	    	  captureScreen(driver, "test_WishList");
	    	  Assert.assertTrue(false);
	      }
	      else
	      {
	    	  logger.info("Search Success");
	    	  Assert.assertTrue(true);
	      }
		 }
	      catch(Exception e)
	      {
	    	  logger.fatal("WishList Failed");
	    	  Assert.fail();
	      }
		
		 logger.info("TC_009_WishList Complited");
		 }
	}	 
