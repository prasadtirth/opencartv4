package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareProduct {
	
	WebDriver driver;
	
	public CompareProduct(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);		
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchtxt;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	WebElement searchbutton;
	
	@FindBy(xpath="//i[@class='fa fa-exchange']")
	WebElement compareproduct;
	
	@FindBy(xpath="//a[@id='compare-total']")
	WebElement productlink;
	
	
	public void search_txt(String text)
    {
  	  searchtxt.sendKeys(text);
    }
	
	public void search_button() 
	{
		searchbutton.click();
	}
	
	public void product_compare()
	{
		compareproduct.click();
	}
	
	public void productcomparision()
	{
		productlink.click();
	}
	
}


