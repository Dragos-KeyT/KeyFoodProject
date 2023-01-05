package utils;

import org.openqa.selenium.WebDriver;

import pages.CartPage;
import pages.CheckoutPage;
import pages.MenuPage;
import pages.MyAccountPage;
import pages.ProductPage;

public class BasePage  extends SeleniumWrappers{

	public BasePage(WebDriver driver) {
		super(driver);
	}
	
	public MenuPage menu  =  new MenuPage(driver);
	public MyAccountPage myAccountPage =  new MyAccountPage(driver);
	public ProductPage productPage =  new ProductPage(driver);
	public CartPage cartPage =  new CartPage(driver);
	public CheckoutPage checkoutPage =  new CheckoutPage(driver);

}
