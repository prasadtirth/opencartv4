package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {
	
	WebDriver driver;
	
	public ContactUs(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Contact Us']")
	WebElement lnkcontactus;
	
	@FindBy(xpath="//input[@id='input-name']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//textarea[@id='input-enquiry']")
	WebElement enquiry;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement subbtn;
	
	public void contactus()
	{
		lnkcontactus.click();
	}
	
	public void yname(String text)
	{
		name.clear();
		name.sendKeys("Prashant Kumar");
	}
	
	public void yemail(String text)
	{
		email.clear();
		email.sendKeys(text);
	}
	
	public void yenquiry(String text)
	{
		enquiry.clear();
		enquiry.sendKeys(text);
	}
	
	public void submmit()
	{
		subbtn.click();
	}

}
