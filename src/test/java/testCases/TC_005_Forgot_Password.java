package testCases;

import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_005_Forgot_Password extends BaseClass {
	
	@Test
	public void test_Forgot_Password() throws InterruptedException
	{
	    logger.info("Starting TC_005_ForgotPassword");
	
	    driver.get(rb.getString("appURL"));
	    HomePage hp=new HomePage(driver);
	    logger.info("Home Page Displayed ");
	
	    driver.manage().window().maximize();
	   
	    hp.clickMyAccount();
		logger.info("Clicked on My Account ");
		hp.clickLogin();
		logger.info("Clicked on Login ");
		
		Thread.sleep(2000);
		
		ForgotPassword fp=new ForgotPassword(driver);
	    fp.setEmail(rb.getString("email"));
	   	logger.info("Provided Email ");
	   	Thread.sleep(3000);
	   	
	   	fp.ForgotPwd();
		Thread.sleep(3000);
        fp.FEmail("prasadtirth9006@gmail.com");
   	   logger.info("Provided confirmation email");
		Thread.sleep(2000);
		   
		fp.Continue();
		logger.info("Finished TC_009_ForgotPassword");
		Thread.sleep(3000);
	}

}
