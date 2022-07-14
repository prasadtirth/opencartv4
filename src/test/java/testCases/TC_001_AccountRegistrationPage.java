package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;


public class TC_001_AccountRegistrationPage extends BaseClass
{

	@Test(groups= {"regression","master"})
	public void test_account_registration()
	{
		logger.info("Starting TC_001_AccountRegistrationPage");
		try
		{
		driver.get(rb.getString("appURL"));	
	    driver.manage().window().maximize();
		
	    logger.info("Clicking on MyAccount under Register Link ");
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		logger.info("Provided Customer First Name");
		regpage.setFirstName("Paras");
		
		logger.info("Provided Customer Last Name");
		regpage.setLastName("Pachore");
		
		logger.info("Provided Customer Gmail");
		regpage.setEmail(randomString()+"@gmail.com");
		
		logger.info("Provided Customer Telephone Number");
	    regpage.setTelephone("987456123");
	    
	    logger.info("Set Password and Confirm Password");
		regpage.setPassword("Paras1234");
		regpage.setConfirmPassword("Paras1234");
		
		logger.info("Clicked On Privacy Policy");
		regpage.setPrivacyPolicy();
		
		logger.info("Clicked On Continue Button");
	    regpage.clickContinue();	
	    
	    		
		String confmsg=regpage.getConfirmationMsg();
		
		logger.info("Provided Login Information");
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			logger.info("Registration Test Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Registration Test Failed");
			Assert.assertFalse(false);
		}
		}
		catch(Exception e)
		{
			logger.fatal("Registration Test Failed");
			Assert.fail();
		}
	}
	
}
