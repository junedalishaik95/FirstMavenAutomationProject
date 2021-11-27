package automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("openwindow")).click();

		Set<String> AllWindows = driver.getWindowHandles();

		Iterator<String> I1 = AllWindows.iterator();

		String Parent = I1.next();

		String Child = I1.next();

		driver.switchTo().window(Child);

		driver.manage().window().maximize();

		try {

			String Title = driver.getTitle();

			System.out.println(Title);

		}

		catch (Exception e) {

			driver.findElement(By.xpath("(//div[@class='sumome-react-wysiwyg-move-handle'])[6]/div/button")).click();

			String Title = driver.getTitle();

			System.out.println(Title);

		}
		
		

	}

}
