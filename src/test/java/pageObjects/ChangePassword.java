package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePassword {
	
	WebDriver driver;
	
	public ChangePassword(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);     
	}
	
	@FindBy(xpath="//a[normalize-space()='Change your password']")
	WebElement chgpass;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement confpassword;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continuebtn;
	
	public void change_password()
	{
		chgpass.click();
	}
	
	public void password(String text)
	{
		password.sendKeys(text);
	}
	
	public void conf_password(String text)
	{
		confpassword.sendKeys(text);
	}
	
	public void continue_btn()
	{
		continuebtn.click();
	}

}
