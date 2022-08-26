package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpecialOffer {
	
	WebDriver driver;
	
	public SpecialOffer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Specials']")
	WebElement spec;
	
	public void Specials()
	{
		spec.click();
	}
	
	 

}
