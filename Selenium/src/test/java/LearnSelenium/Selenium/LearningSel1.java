package LearnSelenium.Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningSel1 {

	@Test
	public void Testwebsite() {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\webdrivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.cocubes.com/");

		dr.findElement(By.xpath("//input[@value='LOGIN']")).click();

		Set<String> Tabs = dr.getWindowHandles();

		Iterator<String> it = Tabs.iterator();
		String parent = it.next();

		String child = it.next();

		dr.switchTo().window(child);

		String ChildTitle = dr.getTitle();
		System.out.println(ChildTitle);

		dr.findElement(By.id("useridtextbox")).sendKeys("hello world");
		dr.findElement(By.id("passwdtextbox")).sendKeys("hello");
		dr.findElement(By.id("btnLogin")).click();

		String chilepageTitle = dr.getTitle();

		if (chilepageTitle == "hello") {

			System.out.println("If condition is passed");

		}

		else {
			dr.switchTo().window(parent);
			String ParentTitle = dr.getTitle();
			System.out.println(ParentTitle);

		}

		dr.quit();

		// Yet to be written the screen shot code
		// Generate the test report.

	}

}