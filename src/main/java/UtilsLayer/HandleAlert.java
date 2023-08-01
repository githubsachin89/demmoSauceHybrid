package UtilsLayer;


import java.io.IOException;

import BaseLayer.BaseClass;

public class HandleAlert extends BaseClass{
	public HandleAlert() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void clickOnOkButton()
	{
		getDriver().switchTo().alert().accept();
	}
	
	public static void clickOnCancelButton()
	{
		getDriver().switchTo().alert().dismiss();
	}
	
	public static void captureText()
	{
		getDriver().switchTo().alert().getText();
	}
	
	public static void  sendKeys(String value)
	{
		getDriver().switchTo().alert().sendKeys(value);
	}
	
	public static String captureValueAndClickOnOkButton()
	{
		String value = getDriver().switchTo().alert().getText();
		getDriver().switchTo().alert().accept();
		return value;
	}
	
	public static String captureValueAndClickOnCancelButton()
	{
		String value = getDriver().switchTo().alert().getText();
		getDriver().switchTo().alert().dismiss();
		return value;
	}
	
	public static void enterValueAndClickOnOkButton(String value)
	{
		getDriver().switchTo().alert().sendKeys(value);
		getDriver().switchTo().alert().accept();
	}
	
	public static void enterValueAndClickOnCancelButton(String value)
	{
		getDriver().switchTo().alert().sendKeys(value);
		getDriver().switchTo().alert().dismiss();
	}
}

	