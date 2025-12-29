package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: Declaring BrowserDriver
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Maximizing window
		driver.manage().window().maximize();

		// Step 2: declare the URL of the application/Website
		driver.get("https://www.leafground.com/dashboard.xhtml");

		driver.findElement(By.xpath("(//li[@class='ui-menuitem-submenu'])[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Frame']")).click();
		
		//Switching the driver focus to iframe/Another DOM inside a DOM - Using index
		driver.switchTo().frame(0);
		
		//Click
		driver.findElement(By.id("Click")).click();
		
		String iFrametitle = driver.getTitle();
		System.out.println(iFrametitle);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();

		//NestedFrame - parentFrame
		driver.switchTo().frame(2);
		//Switching to ChildFrame
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		
		//Switching from childFrame to ParentFrame
		driver.switchTo().parentFrame();
		//driver.findElement(By.id("Click")).click(); -  org.openqa.selenium.NoSuchElementException:
		
		//Switch to default content
		driver.switchTo().defaultContent();

		

	}

}
