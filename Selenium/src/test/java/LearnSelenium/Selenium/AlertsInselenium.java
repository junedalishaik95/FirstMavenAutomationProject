package LearnSelenium.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertsInselenium {
	@Test
	public void Alerts() {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\webdrivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.rediff.com/");
		dr.findElement(By.className("signin")).click();
		dr.findElement(By.name("proceed")).click();

		Alert alert = dr.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);

		alert.accept();

		dr.close();
	}

}
