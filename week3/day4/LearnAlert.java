package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: Declaring BrowserDriver
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Maximizing window
		driver.manage().window().maximize();

		// Step 2: declare the URL of the application/Website
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		driver.findElement(By.xpath("(//li[@class='ui-menuitem-submenu'])[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		//withoutHandling Alert -  org.openqa.selenium.UnhandledAlertException: 
		
		//Switch the driver focus
		Alert alert1 = driver.switchTo().alert();
		//To fetch the text.
		String alert1text = alert1.getText();
		System.out.println(alert1text);
		Thread.sleep(3000);
		//To accept the alert
		alert1.accept();
		System.out.println("You have successfully clicked an alert");
		
		//Confirmation Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert alert2 = driver.switchTo().alert();
		String text2 = alert2.getText();
		System.out.println(text2);
		alert2.accept();
		System.out.println("User Clicked : OK");
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Thread.sleep(3000);
		alert2.dismiss();
		System.out.println("User Clicked : Cancel");
		
		//Non-Modal Alert - Sweet Alert.
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		Thread.sleep(2000);
		//Dismiss
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();


	}

}
