package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.AddressBook;
import pageObjects.MyAccount;
import testBase.BaseClass;

@Test
public class TC_015_AddressBook extends BaseClass {
	
	public void test_AddressBook() throws InterruptedException
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
		    
		    AddressBook ac = new AddressBook(driver);
		    
		    ac.address_book();
		    logger.info("Clicked On The Address Book");
		    Thread.sleep(2000);
		    
		    ac.new_address_btn();
		    logger.info("Clicked On The New Address Button");
		    Thread.sleep(2000);
		    
		    ac.back_button();
		    logger.info("Clicked On The BAck Button");
		    Thread.sleep(2000);
		    
	}

}
