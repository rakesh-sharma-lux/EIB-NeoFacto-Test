package test.exercise3;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import baseUtils.StartUpConfig;

import pages.GenericEventPage;

public class TC006_VerifyListItemSelection {

	WebDriver driver;
	StartUpConfig sc = new StartUpConfig();
	GenericEventPage eventPg;
	
	public void selectListItem() {
		
		//loading the page <GenericEventsPage> containing the list
		driver = sc.open("GenericEventsPage");
		
		eventPg = new GenericEventPage(driver);
		String str = eventPg.selectListElement(5);
		Assert.assertEquals(str, "D1 approval by Advisory Committee");
	}
}
