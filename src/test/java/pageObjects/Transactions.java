package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class Transactions extends BaseClass {
	
	WebDriver driver;	

	public Transactions(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	

	@FindBy(xpath="//a[normalize-space()='Your Transactions']")
	WebElement trans;
	
	public void Transactions()
	{
		trans.click();
	}

}
