package LearnSelenium.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TRdandTDs {
	@Test
	public void Testcalendar() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\webdrivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.makemytrip.com/");
		dr.manage().window().maximize();

		try {

			dr.findElement(By.xpath("//li[@class='menu_Hotels']/a")).click();

		}

		catch (Exception Exe) {

			dr.findElement(By.xpath("//li[@data-cy='account']")).click();
			dr.findElement(By.xpath("//li[@class='menu_Hotels']/a")).click();

		}

		dr.findElement(By.id("city")).click();
		dr.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Hyder");

		List<WebElement> PlaceNames = dr
				.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));

		int TotalCount = PlaceNames.size();

		for (int i = 0; i < TotalCount; i++) {

			String Value = PlaceNames.get(i).getText();
			System.out.println(Value);

		}

	}
}
