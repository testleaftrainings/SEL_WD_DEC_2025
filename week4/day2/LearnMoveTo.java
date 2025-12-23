package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMoveTo {

	public static void main(String[] args) {

		// Move to Element
		// Step 1: Declaring BrowserDriver
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Maximizing window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 2: declare the URL of the application/Website
		driver.get("https://www.snapdeal.com/");

		WebElement mouseHover = driver.findElement(By.xpath("//div[@id='tab-category-0']/div"));

		Actions act = new Actions(driver);
		act.moveToElement(mouseHover).perform();
	}

}
