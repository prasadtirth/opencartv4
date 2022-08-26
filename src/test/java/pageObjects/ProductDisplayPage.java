package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayPage
   {
     WebDriver driver;
     
     public ProductDisplayPage(WebDriver driver)
       {
    	 this.driver=driver;
    	 PageFactory.initElements(driver,this);
         }
     
     @FindBy(xpath="//input[@placeholder='Search']")
	 WebElement searchtxt;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	WebElement searchbutton;
	
	@FindBy(xpath="//img[@title='iMac']")
	WebElement img;
	
	@FindBy(xpath="//img[@title='iMac']")
	WebElement product;
	
	@FindBy(xpath="//button[@title='Next (Right arrow key)']")
	WebElement rightarrowkey;
	
	@FindBy(xpath="//button[@title='Previous (Left arrow key)']")
	WebElement leftarrowkey;
	
	@FindBy(xpath="//button[@title='Close (Esc)']")
	WebElement escbutton;
	
	public void search_txt(String text)
	{
		searchtxt.sendKeys(text);
	}
	
	public void search_button()
	{
		searchbutton.click();
	}
	
	public void i_mg()
	{
		img.click();
	}
	
	public void product()
	{
		product.click();
	}
	
	public void rightarrowkey()
	{
		rightarrowkey.click();
	}
	
	public void leftarrowkey()
	{
		leftarrowkey.click();
	}
	
	public void escbutton()
	{
		escbutton.click();
	}

	
	
	
   }