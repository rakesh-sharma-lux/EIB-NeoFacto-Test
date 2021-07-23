package test.exercise1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseUtils.StartUpConfig;
import pages.Homepage;
import pages.LoginPage;

public class TC004_VerifyHomepage {

	WebDriver driver;
	StartUpConfig sc = new StartUpConfig();
	LoginPage loginPg;
	Homepage homePg;
	

	@Test
	public void usrlogin() {
		
		driver = sc.open("login.html");
		loginPg = new LoginPage(driver);
		homePg = new Homepage(driver);
		
		//Sending correct email “xxx” & password “yyy”
		loginPg.setLoginData("abc@gmail.com","password123");
		
		//verify the validation message considering it on the same page
		loginPg.verifyText("Success");
		
		//Verify successful redirection to Homepage
		homePg.verifyHomePageTitle("<<Home page title>>");
	}
}
