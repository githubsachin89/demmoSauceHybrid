package UtilsLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass
{
	public UtilsClass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void sendKeys(WebElement wb,String value)
	{
		if(wb.isDisplayed()&& wb.isEnabled())
		{
		wb.sendKeys(value);
		}
	}
	
	public static void click(WebElement wb)
	{
		if(wb.isDisplayed()&& wb.isEnabled())
		{
		wb.click();
		}
	}
}
