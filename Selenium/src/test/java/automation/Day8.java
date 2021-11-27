package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\java\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> WebTable = driver.findElements(By.xpath("//table[@id='product']/tbody"));
		
		for(int i=0;i<WebTable.size();i++) {
			
			String Text = WebTable.get(i).getText();
			
			System.out.println(Text);
		}
		
	}

}