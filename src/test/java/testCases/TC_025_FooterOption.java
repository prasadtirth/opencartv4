package testCases;

import org.testng.annotations.Test;

import pageObjects.FooterOption;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;

@Test
public class TC_025_FooterOption extends BaseClass {
	
	public void test_FooterOption() throws InterruptedException
	{
		logger.info("Starting TC_025_FooterOption");
		 
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
		
		FooterOption fo= new FooterOption(driver);
		
		fo.brand_lnk();
		logger.info("Clicked On The Brand Link");
		Thread.sleep(2000);
		
		fo.canon_lnk();
		logger.info("Clicked On The Canon Link");
		Thread.sleep(2000);
		
		fo.grid_lnk();
		logger.info("Clicked on the Grid Link");
		Thread.sleep(2000);
		
		fo.cmp_pdt();
		logger.info("Clicked On The Compare Product");
		Thread.sleep(2000);
		
	}

}
