package testCases;

import org.testng.annotations.Test;

import pageObjects.MyAccount;
import pageObjects.OrderHistory;
import testBase.BaseClass;

@Test
public class TC_016_Order_History extends BaseClass {
	
	public void test_Order_History() throws InterruptedException
	{
		logger.info("Starting TC_016_MyAccountInformation");
		 
	    driver.get(rb.getString("appURL"));
		MyAccount mp = new MyAccount(driver);
	    logger.info("Home Page Displayed ");
	    
	    driver.manage().window().maximize();
	    
	    mp.clickMyAccount();
	    logger.info("Clicked On The My Account");
	    Thread.sleep(2000);
	    
	    mp.dashboardLogin();
	    logger.info("Clicked On the Login");
	    Thread.sleep(2000);
	    
	    mp.setEmail("prasadtirth9006@gmail.com");
	    logger.info("Provided Email Address ");
	    Thread.sleep(2000);
	    
	    mp.setPassword("test1234");
	    logger.info("Provided Password");
	    Thread.sleep(2000);
	    
	    mp.clickLogin();
	    logger.info("Clickded On THe Login Button");
	    Thread.sleep(2000);
	    
	    OrderHistory oh = new OrderHistory(driver);
	    
	    oh.order_history();
	    logger.info("Clicked On the Order History");
	    Thread.sleep(2000);
	    
	    oh.continue_button();
	    logger.info("Clicked On The Continue Button");
	    Thread.sleep(2000);
	    	
	}

}
