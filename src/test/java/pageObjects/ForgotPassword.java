package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ForgotPassword {
	 WebDriver driver;
	  
	  public ForgotPassword(WebDriver driver)
	  {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	  }
	  
	  @FindBy(xpath="//span[normalize-space()='My Account']")
		WebElement lnkMyAccount;
		
	  @FindBy(xpath="//a[normalize-space()='Login']")
		WebElement lnkLogin;
		
	
	  @FindBy(xpath="//input[@id='input-email']")
	  WebElement TxtEmailAddress;
	  
	  @FindBy(xpath="//div[@class='form-group']//a[normalize-space()='Forgotten Password']")
	  WebElement FPwd;

	  @FindBy(xpath="//input[@id='input-email']")
	  WebElement Email;
	  
	  @FindBy(xpath="//input[@value='Continue']")
	  WebElement Continue;
	  
	  public void ClickMyAccount()
	  {
		  lnkMyAccount.click();
	  }
	  
	  public void ClickLogin()
	  {
		  lnkLogin.click();
	  }
	  
	  public void setEmail(String email)
	  {
		  TxtEmailAddress.sendKeys(email);
	  }
	  
	  public void ForgotPwd()
	  {
		  FPwd.click();
	  }
	  
	  public void FEmail(String text)
	  {
		  Email.sendKeys(text); 
	  }
	  
	  public void Continue()
	  {
		  Continue.click();
	  }
	  
	  
	  
}
