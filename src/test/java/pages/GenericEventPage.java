package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenericEventPage {
	
	WebDriver driver;
	
	@FindBy (xpath = "//span[contains(@id,\"lgi_operationCalendarDtoOperationCalendarEventList\")]")
	public WebElement eventList;
	
	
	
	public GenericEventPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String selectListElement(int index) {
		eventList.click();
		return eventList.findElement(By.xpath("./ul/li[" + index +"]")).getText();
		
	}
	
	
}
