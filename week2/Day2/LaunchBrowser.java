package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Declaring BrowserDriver
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Maximizing window
		driver.manage().window().maximize();

		// Step 2: declare the URL of the application/Website
		driver.get("https://www.facebook.com/");
		
		// Locating UserName Input field
		driver.findElement(By.id("email")).sendKeys("testleaf");
		
		// To freeze the execution for few seconds
		Thread.sleep(3000);
		
		// Locating Password Input field - pass
		driver.findElement(By.id("pass")).sendKeys("pass@word");
		
		// Locating Login button field - login
		driver.findElement(By.name("login")).click();
		
		// Printing the title of the page - .getTitle();
		String title = driver.getTitle();
		System.out.println(title);
		
		//Step 4: Closing the window
		//driver.close();
	}

}
