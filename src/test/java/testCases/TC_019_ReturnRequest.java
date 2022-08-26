package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MyAccount;
import pageObjects.ReturnRequest;
import testBase.BaseClass;

@Test
public class TC_019_ReturnRequest extends BaseClass {
	
	public void test_ReturnRequest() throws InterruptedException
	{
	
	logger.info("Starting TC_019_MyAccountInformation");
	 
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
	
	ReturnRequest rr= new ReturnRequest(driver);
	
	rr.Returnreq();
	logger.info("Clicked On The Return Request");
	Thread.sleep(2000);
	
	}

}
