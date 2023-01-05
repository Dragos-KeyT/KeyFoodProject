package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class CheckoutPage extends SeleniumWrappers {

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

	public By termAndCondCheckbox = By.id("terms");
	public By placeOrderButton = By.id("place_order");
	public By mandatoryBillingAdressFields = By.cssSelector("ul[class='woocommerce-error']>li");
	
}
