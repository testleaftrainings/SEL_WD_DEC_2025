package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDoubleClick {

	public static void main(String[] args) {
		// Step 1: Declaring BrowserDriver
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Maximizing window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 2: declare the URL of the application/Website
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		
		//iFrame
		driver.switchTo().frame("iframeResult");
		
		WebElement dc = driver.findElement(By.xpath("//p[contains(text(),'Double')]"));
		Actions act = new Actions(driver);
		act.doubleClick(dc).perform();
	}

}
