package testCases;

import org.testng.annotations.Test;

import pageObjects.MyAccount;
import testBase.BaseClass;

@Test
public class TC_013_MyAccountInformation extends BaseClass 
{
	public void test_MyAccountInformation() throws InterruptedException
	{	
	    logger.info("Starting TC_013_MyAccountInformation");
	 
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
	    
	    mp.setPassword("test123");
	    logger.info("Provided Password");
	    Thread.sleep(2000);
	    
	    mp.clickLogin();
	    logger.info("Clickded On THe Login Button");
	    Thread.sleep(2000);
	    
	    mp.my_acc_info();
	    logger.info("Clicked On The My Account Information");
	    Thread.sleep(2000);
	 
    }
}