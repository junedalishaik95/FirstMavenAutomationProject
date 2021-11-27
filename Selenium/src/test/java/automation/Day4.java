package automation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("input[value='radio2']")).click();

		List<WebElement> Names = driver.findElements(By.xpath("//table[@id='product']/tbody"));

		for (int i = 0; i < Names.size(); i++) {

			String ExtractedValues = Names.get(i).getText();

			if (ExtractedValues.equalsIgnoreCase("Appium (Selenium)"))

			{

				System.out.println("My condition is pass");
			}

			System.out.println(ExtractedValues);

		}
		
		driver.findElement(By.id("openwindow")).click();
		
		Set<String> NW = driver.getWindowHandles();
		
		Iterator<String> Parent = NW.iterator();
		
		Iterator<String> child = NW.iterator();
		
		System.out.println(driver.getTitle());
	}

}
