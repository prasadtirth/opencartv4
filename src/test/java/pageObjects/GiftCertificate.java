package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCertificate {
	
	WebDriver driver;
	
	public GiftCertificate(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Gift Certificates']")
	WebElement giftlnk;
	
	@FindBy(xpath="//input[@id='input-to-name']")
	WebElement recname;
	
	@FindBy(xpath="//input[@id='input-to-email']")
	WebElement recemail;
	
	@FindBy(xpath="//input[@id='input-from-name']")
	WebElement yname;
	
	@FindBy(xpath="//input[@id='input-from-email']")
	WebElement yemail;
	
	@FindBy(xpath="//input[@value='7']")
	WebElement radio;
	
	@FindBy(xpath="//textarea[@id='input-message']")
	WebElement msgbox;
	
	@FindBy(xpath="//input[@id='input-amount']")
	WebElement amtbox;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement termbox;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement contbtn;
	
	public void gift_lnk()
	{
		giftlnk.click();
	}
	
	public void reci_name(String text)
	{
		recname.clear();
		recname.sendKeys(text);
	}
	
	public void reci_email(String text)
	{
		recemail.clear();
		recemail.sendKeys(text);
	}
	
	public void your_name(String text)
	{
		yname.clear();
		yname.sendKeys(text);
	}
	
	public void your_email(String text)
	{
		yemail.clear();
		yemail.sendKeys(text);
	}
	
	public void radio_btn()
	{
		radio.click();
	}
	
	public void msa_box(String text)
	{
		msgbox.sendKeys(text);
	}
	
	public void amount_box(String text)
	{
		amtbox.sendKeys(text);
	}
	
	public void terms_box()
	{
		termbox.click();
	}
	
	public void con_btn()
	{
		contbtn.click();
	}

	
}
