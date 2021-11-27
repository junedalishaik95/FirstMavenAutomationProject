package objectsRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookloginPage {

	WebDriver driver;

	public FacebookloginPage(WebDriver driver) {

		this.driver = driver;

	}

	By username = By.id("email");

	By password = By.id("pass");

	By login = By.name("login");

	public WebElement Email() {

		return driver.findElement(username);
	}

	public WebElement Password() {

		return driver.findElement(password);
	}

	public WebElement login() {

		return driver.findElement(login);
	}

}
