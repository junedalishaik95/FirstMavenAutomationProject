package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondsession {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		Thread.sleep(2000);

		driver.findElement(By.id("name")).sendKeys("");

		driver.findElement(By.id("alertbtn")).click();
		
		Thread.sleep(2000);

		String Alertmsg = driver.switchTo().alert().getText();

		System.out.println(Alertmsg);

		driver.switchTo().alert().accept();
		
		driver.close();

	}

}
