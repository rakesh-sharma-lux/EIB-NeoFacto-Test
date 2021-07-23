package test.exercise2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.*;

import baseUtils.StartUpConfig;

public class TC005_VerifyRadioBtnSelection {

	WebDriver driver;
	StartUpConfig sc = new StartUpConfig();

	@Test
	public void radioSelection() {

		driver = sc.open("QuestionnariePage.html");

		// Take all rows in a list
		List<WebElement> eList = driver.findElements(By.xpath("//tbody//tr/td[*]//tr"));

		for (WebElement e : eList) {
			// Generate Random number to select the radio button
			Random rand = new Random();
			int randomNum = rand.nextInt(20) + 1;

			// Selecting the radio button based on even/odd output
			if (randomNum % 2 == 0)
				e.findElement(By.xpath("./td[1]/input")).click();
			else
				e.findElement(By.xpath("./td[2]/input")).click();

		}

	}
}
