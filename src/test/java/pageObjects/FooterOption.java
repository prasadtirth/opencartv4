package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterOption {
	
	WebDriver driver;
	
	public FooterOption(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Brands']")
	WebElement brandlnk;
	
	@FindBy(xpath="//a[normalize-space()='Canon']")
	WebElement canonlnk;
	
	@FindBy(xpath="//button[@id='grid-view']")
	WebElement grid;
	
	@FindBy(xpath="//i[@class='fa fa-exchange']")
	WebElement cmppdt;
	
	public void brand_lnk()
	{
		brandlnk.click();
	}
	
	public void canon_lnk()
	{
		canonlnk.click();
	}
	
	public void grid_lnk()
	{
		grid.click();
	}
	
	public void cmp_pdt()
	{
		cmppdt.click();
	}

	
	
	
	
	
	
	
	

}
