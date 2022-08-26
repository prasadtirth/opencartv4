package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressBook {
	
	WebDriver driver;
	
	public AddressBook(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(xpath="//a[normalize-space()='Modify your address book entries']")
	WebElement addressbook;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement newaddress;
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement backbutton;
	
	
	public void new_address_btn()
	{
		newaddress.click();
	}
	
	public void back_button()
	{
		backbutton.click();
	}
	
	public void address_book()
	{
		addressbook.click();
	}

	

}
