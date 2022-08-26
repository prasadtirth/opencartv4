package testCases;

import org.testng.annotations.Test;

import pageObjects.ContactUs;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;

@Test
public class TC_024_ContactUs extends BaseClass {
	
	public void test_ContactUs() throws InterruptedException
	{
		logger.info("Starting TC_024_MyAccountInformation");
		 
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
	    
	    LoginPage lp=new LoginPage(driver);
		
		lp.setEmail(rb.getString("email"));
		logger.info("Provided Email ");
		
		lp.setPassword(rb.getString("password"));
		logger.info("Provided Password ");
		
		lp.clickLogin();
		logger.info("Clicked on Login");
		
		ContactUs cu = new ContactUs(driver);
		
		cu.contactus();
		logger.info("Clicked On The Contsct Us ");
		Thread.sleep(2000);
		
		cu.yname("Prashant Kumar");
		logger.info("Entered The Name");
		Thread.sleep(2000);
		
		cu.yemail("macro@gmail.com");
		logger.info("Entered The Email");
		Thread.sleep(2000);
		
		cu.yenquiry("imac");
		logger.info("Entered Product NAme");
		Thread.sleep(2000);
		
		cu.submmit();
		logger.info("Clicked On The Submmit Button");
		Thread.sleep(2000);
		
	}
	

}
