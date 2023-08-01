package TestLayer;



import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;


public class LoginPageTest extends BaseClass{
	
	public LoginPageTest() throws IOException {
		super();
		initialization("edge");
	}

	@BeforeTest
	public void setUP() throws IOException 
	{
		
	}
	
	@Test
	public void validateloginPageFunctinality() throws IOException 
	{
		LoginPage logPage=new LoginPage();
		logPage.loginPageFunctinality("standard_user","secret_sauce");
	}
	@AfterTest
	public void tearDown()
	{
		//driver.close();
	}
}
