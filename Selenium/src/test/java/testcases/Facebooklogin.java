package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectsRepo.FacebookloginPage;

public class Facebooklogin {

	@Test
	public void FacebookLogin() {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		FacebookloginPage fb = new FacebookloginPage(driver);
		fb.Email().sendKeys("Hello all");
		fb.Password().sendKeys("Bye");
		fb.login().click();
		driver.close();

	}

}
