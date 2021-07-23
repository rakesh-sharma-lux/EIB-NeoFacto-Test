package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;
	
	
	@FindBy(id = "username")
	WebElement userName;
	
	@FindBy(id = "password")
	WebElement userPwd;
	
	@FindBy(id = "kc-login")
	WebElement btnLogin;
	
	@FindBy(id = "<<id-of-the-validation-message>>")
	public WebElement valMessage;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setLoginData(String usrName, String pwd) {
		userName.sendKeys(usrName);
		userPwd.sendKeys(pwd);
		btnLogin.click();
		
	}
	
	public void verifyText(String expectedText) {
		Assert.assertEquals(valMessage.getText(),expectedText);
	}
}
