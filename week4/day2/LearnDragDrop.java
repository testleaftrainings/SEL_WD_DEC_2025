package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragDrop {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: Declaring BrowserDriver
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Maximizing window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 2: declare the URL of the application/Website
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement source = driver.findElement(By.id("form:drag"));
		WebElement target = driver.findElement(By.id("form:drop"));
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();


	}

}
