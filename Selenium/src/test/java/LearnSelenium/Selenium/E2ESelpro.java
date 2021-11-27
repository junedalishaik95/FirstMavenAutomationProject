package LearnSelenium.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class E2ESelpro {

	WebDriver driver;

	@Test
	public void Salesforcelogin() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		List<WebElement> Vegies = driver.findElements(By.className("product-name"));
		int Vegiescount = Vegies.size();
		for (int i = 0; i < Vegiescount; i++) {

			String Vegname = Vegies.get(i).getText();

			System.out.println(Vegname);

			if (Vegname.equalsIgnoreCase("Tomato - 1 Kg")) {

				driver.findElement(By.className("increment")).click();

			}

		}
	}

}