package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyAccount;
import testBase.BaseClass;

@Test
public class TC_012_MyAccount extends BaseClass{
	
	public void test_MyAccount() throws InterruptedException {
		
		logger.info("Starting TC_012_MyAccount");
		
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
	    
	    mp.clickMyAccount();
	    logger.info("Clicked On The My Account");
	    Thread.sleep(2000);
	    
	    mp.logout();
	    logger.info("Clicked on The Logout");
	    Thread.sleep(2000);
	    
	    mp.affilate();
	    logger.info("Clicked On The Footer Section Text");
	    Thread.sleep(2000);
	    
	}
	


}
