package week4.day1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWithTitle {

	public static void main(String[] args) {
		// Step 1: Declaring BrowserDriver
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Maximizing window
		driver.manage().window().maximize();
		// Step 2: declare the URL of the application/Website
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.findElement(By.xpath("(//li[@class='ui-menuitem-submenu'])[2]")).click();
		driver.findElement(By.id("menuform:m_window")).click();
		driver.findElement(By.xpath("//span[text()='Open']")).click();

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);

		// Dashboard, Window
		String childWindow = "Dashboard";

		for (String st : allWindows) {
			driver.switchTo().window(st);
			if (driver.getTitle().contains(childWindow)) {
				driver.findElement(By.id("email")).sendKeys("abcd@efgh.com");
			}

		}

	}
}