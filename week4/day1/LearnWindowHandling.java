package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

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
		// driver.findElement(By.id("email")).sendKeys("abcd@efgh.com"); -
		// org.openqa.selenium.NoSuchElementException
		// To print the current window address - 6B5598C87FE08D93BAE9FA8F6A24381A
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		// To print the current window title.
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		// getWindowHandles();
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println(childWindow);
		// Switch to childWindow
		// Declare emptyList
		List<String> getWindow = new ArrayList<String>(childWindow);
		driver.switchTo().window(getWindow.get(1));
		// To print the Child window title.
		String childTitle = driver.getTitle();
		System.out.println(childTitle);
		driver.findElement(By.id("email")).sendKeys("abcd@efgh.com");
		driver.close();
		//Switching to defaultContent
		//driver.switchTo().defaultContent();
		driver.switchTo().window(getWindow.get(0));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> ThirdWindow = driver.getWindowHandles();
		List<String> thirdWindow = new ArrayList<String>(ThirdWindow);
		System.out.println(ThirdWindow);
		driver.switchTo().window(thirdWindow.get(1));
		//Title of third Window
		String thirdTitle = driver.getTitle();
		System.out.println(thirdTitle);
	}
}
