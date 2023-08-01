package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

import static UtilsLayer.UtilsClass.*;

import java.io.IOException;

import static UtilsLayer.HandleDropDown.*;


public class SwagLabPage extends BaseClass{

	@FindBy(name="add-to-cart-sauce-labs-backpack")
	WebElement backPack;
	@FindBy(name="add-to-cart-sauce-labs-bike-light")
	WebElement bikeLight;
	@FindBy(name="add-to-cart-test.allthethings()-t-shirt-(red)")
	WebElement tShirt;
	@FindBy(xpath="//select[@class='product_sort_container']")
	WebElement nameDropdown;
	
	public SwagLabPage() throws IOException
	{
		super();
		PageFactory.initElements(getDriver(),this);
	}
	
	public void swagLabPagefunctinality(String namedropdown) 
	{
		
		click(backPack);
		click(bikeLight);
		click(tShirt);
		selectByVisibleText(nameDropdown, namedropdown);
	}
}
