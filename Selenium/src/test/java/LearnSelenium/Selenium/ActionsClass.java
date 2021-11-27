package LearnSelenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass {

	WebDriver dr;

	@Test
	public void ActionsClassEx() {

		System.setProperty("webdriver.edge.driver", "C:\\java\\webdrivers\\msedgedriver.exe");
		dr = new EdgeDriver();
		dr.get("https://www.amazon.in/");
		dr.manage().window().maximize();
		WebElement MouseHoverEle = dr.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a = new Actions(dr);
		a.moveToElement(MouseHoverEle).build().perform();
		dr.findElement(By.id("nav-flyout-ya-signin")).click();
	}

}