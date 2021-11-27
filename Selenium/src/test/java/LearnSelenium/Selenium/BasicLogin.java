package LearnSelenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BasicLogin {

	@Test
	public void ScrollingUsingJS() {

		System.setProperty("webdriver.gecko.driver", "C:\\java\\webdrivers\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();

		dr.close();

	}

}
