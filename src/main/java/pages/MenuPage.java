package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class MenuPage extends SeleniumWrappers {

	//public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		//this.driver = driver;
		super(driver);
	}
	
	public By myAccountLink = By.linkText("My account");
	public By searchField = By.id("dgwt-wcas-search-input-1");
	public By cartLink = By.linkText("CART");
}
