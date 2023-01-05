package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.testng.annotations.Test;

import utils.BaseTest;

public class CannotPostOrderWithoutBillingAdressTest extends BaseTest{
	
	
	
	@Test
	public void cannotOrderWithoutBillingAdressTest() {
		
		app.sendKeys(app.menu.searchField, "Organic Maple Syrup");
		app.sendEnter();
		
		assertEquals(driver.getCurrentUrl(), "https://keyfood.ro/product/organic-maple-syrup/");
		
		Double pricePerPiece = app.productPage.getProductSalePrice();
		app.productPage.increaseProductQty(4);
		app.click(app.productPage.addToCartButton);
		System.out.println(app.productPage.getAddedToCartAlertMessage());
		
		assertEquals(app.productPage.getAddedToCartAlertMessage(), "5 × “Organic Maple Syrup” have been added to your cart.");
		
		app.click(app.menu.cartLink);
		
		DecimalFormat df = new DecimalFormat();
		assertEquals(app.cartPage.getTotalPrice(), Double.parseDouble(df.format(pricePerPiece*5)));
		
		BigDecimal bd = new BigDecimal(5*pricePerPiece);	
		System.out.println("BD :"+ bd.setScale(2, RoundingMode.HALF_UP).doubleValue());
		
		app.click(app.cartPage.proccedTOCheckoutButton);
		app.click(app.checkoutPage.termAndCondCheckbox);
		app.click(app.checkoutPage.placeOrderButton);
		
		
		assertFalse(app.getWebElementList(app.checkoutPage.mandatoryBillingAdressFields).size() == 0);
		
	}
	

}
