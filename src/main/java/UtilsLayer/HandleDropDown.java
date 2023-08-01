package UtilsLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{

	public HandleDropDown() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void selectByVisibleText(WebElement wb, String value)
	{
		if(wb.isDisplayed()&& wb.isEnabled())
		{
			new Select(wb).selectByVisibleText(value);
		}
	}
	
	public static void selectByValue(WebElement wb, String value)
	{
		if(wb.isDisplayed()&& wb.isEnabled())
		{
			new Select(wb).selectByValue(value);
		}
	}
	
	public static void selectByIndex(WebElement wb, int index)
	{
		if(wb.isDisplayed()&& wb.isEnabled())
		{
			new Select(wb).selectByIndex(index);
		}
	}
	
	public static String selctByVisibleTextAndCaptureValue(WebElement wb, String value)
	{
		if(wb.isDisplayed()&& wb.isEnabled())
		{
			new Select(wb).selectByVisibleText(value);
		}
		return new Select(wb).getFirstSelectedOption().getText();
	}
	
	public static String selectByValueAndCaptureValue(WebElement wb, String value)
	{
		if(wb.isDisplayed()&& wb.isEnabled())
		{
			new Select(wb).selectByValue(value);
		}
		return new Select(wb).getFirstSelectedOption().getText();
	}
	
	public static String selectByIndexAndCaptureValue(WebElement wb, int index) 
	{
		if(wb.isDisplayed()&& wb.isEnabled())
		{
			new Select(wb).selectByIndex(index);
		}
		return new Select(wb).getFirstSelectedOption().getText(); 
	}
}