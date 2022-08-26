package testCases;

import org.testng.annotations.Test;

import pageObjects.ChangePassword;
import pageObjects.MyAccount;
import testBase.BaseClass;

@Test
public class TC_014_ChangePassword extends BaseClass 
{	
	public void test_Change_password() throws InterruptedException
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
		    
		    mp.setPassword("test1234");
		    logger.info("Provided Password");
		    Thread.sleep(2000);
		    
		    mp.clickLogin();
		    logger.info("Clickded On THe Login Button");
		    Thread.sleep(2000);
		    
		    ChangePassword cp = new ChangePassword(driver);
		    
		    cp.change_password();
		    logger.info("Clicked on The Change Password");
		    Thread.sleep(2000);

		    cp.password("test1234");
		    logger.info("Clicked on the password");
		    Thread.sleep(2000);
		    
		    cp.conf_password("test1234");
		    logger.info("Clicked on the confpassword");
		    Thread.sleep(2000);
		    
		    cp.continue_btn();
		    logger.info("Clicked On The Continue Button");
		    Thread.sleep(2000);
		    
	}

}
