package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) {
		// Wait statement - Thread.sleep();, implicitlyWait, ExplicitWait/WebdriverWait

		// Step 1: Declaring BrowserDriver
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Maximizing window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 2: declare the URL of the application/Website

		driver.get("https://www.leafground.com/waits.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		//I am here
		WebElement gettingText = driver.findElement(By.xpath("//span[text()='I am here']"));
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOf(gettingText));
		
		String text = gettingText.getText();
		System.out.println(text);
		//primary button
		driver.findElement(By.name("j_idt87:j_idt95")).click();
		//wait condition to invisible the messages
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@aria-live='polite']")));
		//secondary button
		driver.findElement(By.name("j_idt87:j_idt96")).click();
				
	}

}
