package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ShoppingCart;
import testBase.BaseClass;

@Test
public class TC_010_ShoppingCart extends BaseClass{
	
	public void test_ShoppingCart() throws InterruptedException{
	
	logger.info("Starting TC_010_ShoppingCart");
	
	driver.get(rb.getString("appURL"));
	HomePage hp=  new HomePage(driver);
    logger.info("Home Page Displayed ");
    
    driver.manage().window().maximize();
    
    ShoppingCart sc =new ShoppingCart(driver);
    sc.search_txt("imac");
    logger.info("Enter Any Product");
    Thread.sleep(1000);	
    
    sc.search_button();
    logger.info("Clicked OnThe Search Button Icon");
    Thread.sleep(1000);
    
    sc.searched_product();
    logger.info("clicked On The Searched Product");
    Thread.sleep(1000);
    
    sc.add_to_cart();
    logger.info("Clicked On Add To Cart");
    Thread.sleep(1000);
    
    sc.shop_cart();
    logger.info("Clicked On Shop Cart");
    Thread.sleep(1000);
    
    sc.use_coupon_code();
    logger.info("Clicked on Use Coupon Code");
    Thread.sleep(1000);
    
    sc.text_coupon("ABC23pqr");
    logger.info("Entered Coupon Code");
    Thread.sleep(1000);                  
    
    sc.clk_apply_coupon();
    logger.info("Clickd On Apply Coupon");
    Thread.sleep(3000);
    
  /*  sc.est_shi_tax();
    logger.info("Clicked on the Estimate Shipping And Taxes in DropDown");
    Thread.sleep(1000);
    
    sc.drp_input_country();
    logger.info("Clicked on The Country DropDown");
    Thread.sleep(1000);
    
    sc.select_country_list();
    logger.info("Selected the Country");
    Thread.sleep(3000);        */
    
  /*  sc.drp_select_state();
    logger.info("Clicked On The Select State");
    Thread.sleep(3000);     */  
    
 /*   sc.selectstate();
    logger.info("Selected the State");
    Thread.sleep(2000);
    
    sc.postal_code("416125");
    logger.info("Provided Pincode");
    Thread.sleep(2000);
    
    sc.get_quotes();
    logger.info("Clicked on the Get Quotes Button ");
    Thread.sleep(1000);   */
    
    sc.use_gift_certificate();
    logger.info("Clicked on the Use Gift Certificate ");    
    Thread.sleep(1000);
    
    sc.text_gift_certificate("pqr12ABC");
    logger.info("Clicked on The Gift Certificate Code");
    Thread.sleep(1000);
    
    
    
    
    
    
    
    
	}	

}
