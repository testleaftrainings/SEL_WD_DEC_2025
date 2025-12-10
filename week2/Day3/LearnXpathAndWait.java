package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpathAndWait {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// Implicitly wait - Global wait - selenium wait
		// Thread.sleep(); - java wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://login.salesforce.com/?locale=in");
		// dilipkumar.rajendran@testleaf.com  ; TestLeaf@2025
		
		// Xpath for userName
		driver.findElement(By.xpath("//input[@id='username']")).
		sendKeys("dilipkumar.rajendran@testleaf.com");
		
		// Xpath for passWord
		driver.findElement(By.xpath("//input[@id='password']")).
		sendKeys("TestLeaf@2025");
		
		// Xpath for loginButton
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		
		
	}

}
