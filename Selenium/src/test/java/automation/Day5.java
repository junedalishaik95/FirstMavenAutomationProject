package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement Selecttag = driver.findElement(By.id("Skills"));
		
		Select Sel = new Select(Selecttag);		
		
		Sel.selectByVisibleText("Android");

		
	}

}
