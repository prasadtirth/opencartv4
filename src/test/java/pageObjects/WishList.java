package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList {
	
	WebDriver driver;
	
	public WishList(WebDriver driver)
    {
 	 this.driver=driver;
 	 PageFactory.initElements(driver,this);
    }
  
    @FindBy(xpath="//input[@placeholder='Search']")
	 WebElement searchtxt;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	WebElement searchbutton;
	
	@FindBy(xpath="//img[@title='iMac']")
	WebElement productclick;
	
	@FindBy(xpath="//button[@class='btn btn-default']//i[@class='fa fa-heart']")
	WebElement wishlistsymbol;
	
	@FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]")
	WebElement notfound;
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyAccount;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement lnkLogin;
	
	public void search_txt(String text)
	{
		searchtxt.sendKeys(text);
	}
	
	public void search_button()
	{
		searchbutton.click();
	}
	
	public void product_click()
	{
		productclick.click();
	}
	
	public void wish_list()
	{
		wishlistsymbol.click();
	}
	
	public void clickMyAccount()
	{
		lnkMyAccount.click();
	}
	
	public void clickLogin()
	{
		lnkLogin.click();
	}
	
	
	
	public boolean isPageExists()
	{
		try
		{
			return(notfound.isDisplayed());
		}
		
		catch(Exception e)
		{
			return(false);
		}
	}

	
	

}