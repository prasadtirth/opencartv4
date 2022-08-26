package testCases;

import org.testng.annotations.Test;

import pageObjects.Affiliate;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;

@Test
public class TC_023_Affiliate extends BaseClass {
	
	public void test_Affiliate() throws InterruptedException
	{
		logger.info("Starting TC_023_MyAccountInformation");
		 
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
		
		Affiliate af = new Affiliate(driver);
		
		af.edit_affiliate();
		logger.info("Clicked On the Edit Affiliate Program");
		Thread.sleep(2000);
		
		af.company("macro");
		logger.info("Filled company Name");
		Thread.sleep(2000);
		
		af.website("macro@gmail.com");
		logger.info("Filled WebSite Name");
		Thread.sleep(2000);
		
		af.tax_id("9090");
		logger.info("Clicked On the Tax_id");
		Thread.sleep(2000);
		
		af.payment();
		logger.info("Selected Payment Method");
		Thread.sleep(2000);
		
		af.chqpayee("05521");
		logger.info("Clicked On the Cheque Payee");
		Thread.sleep(2000);
		
		af.continue_button();
		logger.info("Clicked On the Continue Button");
		Thread.sleep(2000);
	}

}
