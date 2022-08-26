package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	
   WebDriver driver;
	
	public Checkout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);		
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchtxt;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	WebElement searchbutton;
	
	@FindBy(xpath="//img[@title='iMac']")
	WebElement searchedproduct;
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement addtocart;	
	
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']//i[@class='fa fa-shopping-cart']")
	WebElement viewcart;
	
	@FindBy(xpath="//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']")
	WebElement shopcart;
	
	@FindBy(xpath="//strong[normalize-space()='Checkout']")
	WebElement checkout;
	
	@FindBy(xpath="//input[@value='register']")
	WebElement regiacc;
	
	@FindBy(xpath="//input[@value='guest']")
	WebElement guessacc;
	
	@FindBy(xpath="//input[@id='button-account']")
	WebElement continue0;

	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	@FindBy(xpath="//input[@value='guest']")
	WebElement guesscheckout;
	
	@FindBy(xpath="//h1[normalize-space()='Your order has been placed!']")
	WebElement msgconfm;
	
	@FindBy(xpath="//input[@id='button-payment-address']")
	WebElement continue1;
	
	@FindBy(xpath="//input[@id='button-shipping-address']")
	WebElement continue2;
	
	@FindBy(xpath="//input[@id='button-shipping-method']")
	WebElement continue3;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement checkbox;
	
	@FindBy(xpath="//input[@id='button-payment-method']")
	WebElement continue4;
	
	@FindBy(xpath="//input[@id='button-confirm']")
	WebElement continueodr;
	
	public void search_txt(String text)
	{
		searchtxt.sendKeys(text);
	}
	
	public void search_button()
	{
		searchbutton.click();
	}
	
	public void searched_product()
	{
		searchedproduct.click();;
	}
	public void add_to_cart()
	{
		addtocart.click();
	}
	
	public void view_cart()
	{
		viewcart.click();
	}
	
	public void shop_cart()
	{
		shopcart.click();
	}
	
	public void check_out()
	{
		checkout.click();
	}
	
	public void register_account()
	{
		regiacc.click();
	}
	
	public void guess_account()
	{
		guessacc.click();
	}
	
	
	public void button0()
	{
		continue0.click();
	}
	
	public void setEmail(String email)
	{
		txtEmailAddress.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	public void guess_chckout()
	{
		guesscheckout.click();
	}
	
	
	
	public boolean isPagExists()
	{
		try
		{
			return (msgconfm.isDisplayed());					
		}
		catch(Exception e)
		{
			return(false);
		}
		
	}
	
	public void button1()
	{
		continue1.click();
	}
	
	public void button2()
	{
		continue2.click();
	}
	
	public void button3()
	{
		continue3.click();
	}
	
	public void checkbox_click()
	{
		checkbox.click();
	}
	
	public void button4()
	{
		continue4.click();
	}
	
	public void continueorder()
	{
		continueodr.click();
	}

	

	
	
	
	
	
	
}
