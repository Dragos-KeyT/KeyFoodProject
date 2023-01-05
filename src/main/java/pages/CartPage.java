package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class CartPage extends SeleniumWrappers{

	public CartPage(WebDriver driver) {
		super(driver);
	}

	public By totalPrice = By.cssSelector("td[data-title='Total'] span[class*='woocommerce-Price-amount']");
	public By proccedTOCheckoutButton = By.linkText("Proceed to checkout");
	
	public double getTotalPrice() {
		
		return Double.parseDouble(driver.findElement(totalPrice).getText().substring(1));
		
	}
	
	
}
