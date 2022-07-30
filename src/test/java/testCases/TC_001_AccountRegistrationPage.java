package testCases;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.logging.log4j.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

@Test
public class TC_001_AccountRegistrationPage extends BaseClass

{
    
	 
    	@Test(groups={"regression","master"})
		
     public void test_Account_Registration() throws InterruptedException, IOException
     {
    	 logger.info("Strating TC_001_AccountRegistration");
    	try
    	{
    		driver.get(rb.getString("appURL"));//dynamacially get data from the properties file
    		logger.info("Home Page Displayed ");
    	 
    		driver.manage().window().maximize();
 		
 		 
    		HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on My Account ");
			hp.clickRegister();
			logger.info("Clicked on Register ");
			
    	 AccountRegistrationPage regpage =new AccountRegistrationPage(driver);
    	 regpage.setFirstName("Akash");
    	 logger.info("Provided First Name ");
    	 
    	 regpage.setLastName("Patil");
    	 logger.info("Provided Last Name ");
    	 
    	 regpage.setEmail(randomestring()+"@gmail.com");//randomly generated the email
    //	 regpage.setEmail("jackjons1234gmail.com");
    	 logger.info("Provided Email ");
    	 
    	 regpage.setTelephone("2456789145");
    	 logger.info("Provided Telephone ");
    	 
 		 regpage.setPassword("Akash1234");
 		logger.info("Provided Password ");
 		
 		 regpage.setConfirmPassword("Akash1234");
 		logger.info("Provided Confrmed Password ");
 		
    	 regpage.setPrivacyPolicy();
    	 logger.info("Set Privacy Policy ");
    	 
    	 regpage.clickContinue();
    	 logger.info("Clicked on Continue ");
    	 
    	     	 Thread.sleep(5000);
    	 
         String confmsg=regpage.getConfirmationMsg();
         
       if(confmsg.equals("Your Account Has Been Created!"))
        	// if(confmsg.equals("Your Account Has Been Created!"))//Intensely failing
 		{
        	 logger.info("Account Registration Success ");
 			  Assert.assertTrue(true);
 		}
 		else
 		{
 			logger.error("Account Registration Failed ");
			captureScreen(driver, "test_account_Registration"); //Capturing screenshotin the screenshot folder==>we mentioned caputescreen method in the base class
			
			Assert.assertTrue(false);
 			
 		}
    	}
    	catch(Exception e)
    	{
    		
    	captureScreen(driver, "test_account_Registration");	
    	logger.fatal("Account Registration Failed");//Fatal means blocker
    	Assert.fail();
    	
    	}
    	logger.info("Finished TC_001_AccountRegistration");
    	
     } 
    
}

	