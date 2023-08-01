package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import static UtilsLayer.UtilsClass.*;

import java.io.IOException;


public class LoginPage extends BaseClass
{
	
	@FindBy(name="user-name")
	WebElement userName;
	@FindBy(name="password")
	WebElement passWord;
	@FindBy(name="login-button")
	WebElement loginBtn;
	
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(getDriver(), this);
	}
	
	public void loginPageFunctinality(String username, String password) 
	{ 
		
		sendKeys(userName, username);
		sendKeys(passWord, password);
		click(loginBtn);
	}

}
