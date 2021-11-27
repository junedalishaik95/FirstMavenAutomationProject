package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		WebElement TargetElement = driver.findElement(By.xpath("//a[text()='SwitchTo']"));

		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		Actions action = new Actions(driver);

		action.moveToElement(TargetElement).build().perform();

		try {

			driver.findElement(By.xpath("(//ul[@class='dropdown-menu']/li/a)[1]")).click();

		}

		catch (Exception e) {

			driver.findElement(By.className("ns-7pv3r-e-17")).click();

			driver.findElement(By.xpath("(//ul[@class='dropdown-menu']/li/a)[1]")).click();
		
		}
		
		
	}

}
