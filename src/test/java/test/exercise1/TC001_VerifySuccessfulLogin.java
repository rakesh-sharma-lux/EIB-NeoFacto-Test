package test.exercise1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseUtils.StartUpConfig;
import pages.LoginPage;

public class TC001_VerifySuccessfulLogin {

	
		WebDriver driver;
		StartUpConfig sc = new StartUpConfig();
		LoginPage loginPg;
		
	
		@Test
		public void usrlogin() {
			
			driver = sc.open("login.html");
			loginPg = new LoginPage(driver);
			
			//Sending correct email “xxx” & password “yyy”
			loginPg.setLoginData("abc@gmail.com","password123");
			
			//verify the validation message considering it on the same page
			loginPg.verifyText("Success");
			//Assert.assertEquals(loginPg.valMessage.getText(), "Success");
		}

	
}
