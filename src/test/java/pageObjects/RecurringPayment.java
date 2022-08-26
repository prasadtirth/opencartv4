package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecurringPayment {
	
	WebDriver driver;
	public RecurringPayment(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="//ul[@class='list-unstyled']//a[normalize-space()='Recurring payments']")
	WebElement recpay;
	
	public void recurring_payment()
	{
		recpay.click();
	}

	

}
