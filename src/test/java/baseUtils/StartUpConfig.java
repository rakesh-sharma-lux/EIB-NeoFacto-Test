package baseUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpConfig {
	
	WebDriver driver;
	String chromeDriverPath = "C:\\software\\Selenium-Browser-Drivers\\chromedriver.exe";
	
	public WebDriver open(String fileName) {
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		String userDir = System.getProperty("user.dir");
		driver = new ChromeDriver();
		driver.get(userDir + "/src/test/java/baseUtils/" + fileName);
		return driver;
	}
	
}

