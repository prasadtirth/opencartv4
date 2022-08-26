package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCart {
	
	WebDriver driver;
	
	public ShoppingCart(WebDriver driver)
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
	
	@FindBy(xpath="//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']")
	WebElement shopcart;
	
	@FindBy(xpath="//a[normalize-space()='Use Coupon Code']")
	WebElement drpusecouponcode;
	
	@FindBy(xpath="//input[@id='input-coupon']")
	WebElement textcoupon;
	
	@FindBy(xpath="//input[@id='button-coupon']")
	WebElement clkapplycoupon;
	
	@FindBy(xpath="//a[normalize-space()='Estimate Shipping & Taxes']//i[@class='fa fa-caret-down']")
	WebElement drpestshitax;
	
	@FindBy(xpath="//select[@id='input-country']")
	WebElement drpinputcountry;
	
	@FindBy(xpath="//select[@id='input-zone']")
	WebElement drpstate;
	
	
	@FindBy(xpath="//input[@id='input-postcode']")
	WebElement postalcode;
	
	@FindBy(xpath="//button[@id='button-quote']")
	WebElement getquotes;
	
	@FindBy(xpath="//a[normalize-space()='Use Gift Certificate']")
	WebElement usegiftcertificate;
	
	@FindBy(xpath="//input[@id='input-voucher']")
	WebElement textgiftcertificate;
	
	@FindBy(xpath="//input[@id='button-voucher']")
	WebElement btnaplygift;
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement continueshopping;
	
	
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
	
	public void shop_cart()
	{
		shopcart.click();
	}
	
	public void use_coupon_code()
	{
		drpusecouponcode.click();
	}
	
	public void text_coupon(String text)
	{
		textcoupon.sendKeys(text);
	}
	
	public void clk_apply_coupon()
	{
		clkapplycoupon.click();
	}
	
	public void est_shi_tax()
	{
		drpestshitax.click();
	}
	
	public void drp_input_country()
	{
		drpinputcountry.click();
	}
	
	
	public void select_country_list()
	{
		Select country=new Select(driver.findElement(By.id("input-country")));
		country.selectByVisibleText("Australia");
	}
	
	public void drp_select_state()
	{
		drpstate.click();
	}                           
	
	public void selectstate()
	{
		
		  Select zone= new Select(driver.findElement(By.id("input-zone")));
	      zone.selectByVisibleText("Kara");
		/*Select state = new Select(driver.findElement(By.id("input-zone")));
		state.selectByVisibleText("Angus"); */
	}
	
	public void postal_code(String text)
	{
		postalcode.sendKeys(text);
	}
	
	public void get_quotes()
	{
		getquotes.click();
	}

	public void use_gift_certificate()
	{
		usegiftcertificate.click();
	}
	
	public void text_gift_certificate(String text)
	{
		textgiftcertificate.sendKeys(text);;
	}
	
	public void btn_apply_gift()
	{
		btnaplygift.click();
	}
	
	public void continue_shopping()
	{
		continueshopping.click();
	}
	
	
	

}
