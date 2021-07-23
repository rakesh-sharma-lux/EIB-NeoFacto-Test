package test.exercise1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseUtils.StartUpConfig;
import pages.LoginPage;

public class TC003_VerifyLoginWithWrongEmail {

	WebDriver driver;
	StartUpConfig sc = new StartUpConfig();
	LoginPage loginPg;
	

	@Test
	public void usrlogin() {
		
		driver = sc.open("login.html");
		loginPg = new LoginPage(driver);
		
		//Sending wrong email “xxx” & password “yyy”
		loginPg.setLoginData("xxx@gmail.com","password123");
		
		//verify the validation message considering it on the same page
		loginPg.verifyText("enter correct email");
		
	}
}
