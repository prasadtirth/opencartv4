package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class Affiliate extends BaseClass {
	
	WebDriver driver;

	public Affiliate(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Edit your affiliate information']")
	WebElement regafiacc;
	
	@FindBy(xpath="//input[@id='input-company']")
	WebElement cmp;
	
	@FindBy(xpath="//input[@id='input-website']")
	WebElement web;
	
	@FindBy(xpath="//input[@id='input-tax']")
	WebElement tax;
	
	@FindBy(xpath="//input[@name='payment']")
	WebElement pay;
	
	@FindBy(xpath="//input[@id='input-cheque']")
	WebElement chqpaye;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkbox;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement conbtn;
	
	public void edit_affiliate()
	{
		regafiacc.click();
	}
	
	public void company(String text)
	{
		cmp.sendKeys(text);
	}
	
	public void website(String text)
	{
		web.sendKeys(text);
	}
	
	public void tax_id(String text)
	{
		tax.sendKeys(text);
	}
	
	public void payment()
	{
		pay.click();
	}
	
	public void chqpayee(String text)
	{
		chqpaye.sendKeys(text);
	}
	
	public void check_box()
	{
		chkbox.click();
	}
	
	public void continue_button()
	{
		conbtn.click();
	}
	
	
	
	

}
