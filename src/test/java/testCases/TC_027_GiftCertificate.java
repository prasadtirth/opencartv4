package testCases;

import org.testng.annotations.Test;

import pageObjects.GiftCertificate;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;

@Test
public class TC_027_GiftCertificate extends BaseClass {
	
	public void test_GiftCertificate() throws InterruptedException
	{
		logger.info("Starting TC_027_FooterOption");
		 
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
		
		GiftCertificate gc = new GiftCertificate(driver);
		
		gc.gift_lnk();
		logger.info("Clicked On The Gift Certificate Link");
		Thread.sleep(2000);
		
		gc.reci_name("Omkar Chalke");
		logger.info("Entered Reciepent Name ");
		Thread.sleep(2000);
		
		gc.reci_email("omkarchalke1234@gmail.com");
		logger.info("Entered Recipient Email");
		Thread.sleep(2000);
		
		gc.your_name("Omkar Pawar");
		logger.info("Enter Your Name ");
		Thread.sleep(2000);
		
		gc.your_email("omkarpawar@5678@gmail.com");
		logger.info("Entered your Email");
		Thread.sleep(2000);
		
		gc.radio_btn();
		logger.info("Clicked On THE Radio Button");
		Thread.sleep(2000);
		
		gc.msa_box("done");
		logger.info("Entered the Description");
		Thread.sleep(2000);
		
		gc.amount_box("1000");
		logger.info("Enterred Amount");
		Thread.sleep(2000);
		
		gc.terms_box();
		logger.info("Clicked On The Agree Box ");
		Thread.sleep(2000);
		
		gc.con_btn();
		logger.info("Clicked On The Continue Button");
		Thread.sleep(2000);
		
		
	}

}
