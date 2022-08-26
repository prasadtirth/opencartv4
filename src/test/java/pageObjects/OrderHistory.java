package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistory {
	
	WebDriver driver;
	
	public OrderHistory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	

	@FindBy(xpath="//a[normalize-space()='View your order history']")
	WebElement ordhistory;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement conbtn;
	
	public void order_history()
	{
		ordhistory.click();
	}
	
	public void continue_button()
	{
		conbtn.click();
	}

	
	

}
