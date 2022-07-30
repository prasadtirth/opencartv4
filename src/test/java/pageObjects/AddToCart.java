package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	WebDriver driver;
	
	public AddToCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchtxt;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	WebElement searchbutton;
	
	@FindBy(xpath="//span[normalize-space()='Add to Cart']")
	WebElement addcart;
	
	
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement msgconfm;
	
	public void search_txt(String text)
	{
		searchtxt.sendKeys("MacBook");
	}
	
	public void search_button()
	{
		searchbutton.click();
	}
	
	public void addcart()
	{
		addcart.click();
	}
	
	
	
	public String getConfirmationMsg()
	{
		try
		{
			return(msgconfm.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}

	
}
