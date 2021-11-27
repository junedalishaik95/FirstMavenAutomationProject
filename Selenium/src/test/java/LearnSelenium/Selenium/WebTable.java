package LearnSelenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {

	@Test
	public void WebTablesinSelenium() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.goindigo.in/");

		driver.manage().window().maximize();

	}

}