package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MyAccount;
import pageObjects.NewsLetter;
import testBase.BaseClass;

@Test
public class TC_022_NewsLetter extends BaseClass {
	
	public void test_NewsLetter() throws InterruptedException
	{
		logger.info("Starting TC_022_MyAccountInformation");
		 
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
		
		NewsLetter nl = new NewsLetter(driver);
		
		nl.newsletter();
		logger.info("Clicked On The NewsLetter");
		Thread.sleep(2000);
		
		nl.continue_btn();
		logger.info("Clicked On The Continue Button");
		Thread.sleep(2000);
	}

}
