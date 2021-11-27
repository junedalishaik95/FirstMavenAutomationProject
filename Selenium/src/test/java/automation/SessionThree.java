package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionThree {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		Thread.sleep(4000);

		if(driver.findElement(By.id("dkfdf")).isEnabled()) {
			
			driver.findElement(By.xpath("dkfndkf")).click();
		}
		
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

	}

}
