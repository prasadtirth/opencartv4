package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RewardsPoint {
	
	WebDriver driver;
	
	public RewardsPoint(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	

	@FindBy(xpath="//a[normalize-space()='Your Reward Points']")
	WebElement rwdpnt;
	
	public void reward_point()
	{
		rwdpnt.click();
	}

}
