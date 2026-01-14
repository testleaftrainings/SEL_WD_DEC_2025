package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelExceptionHandling {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		try {
			driver.findElement(By.id("user")).sendKeys("DemoSalesManager");
		} catch (Exception e) {
			e.printStackTrace();
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		}
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
//		driver.findElement(By.linkText("CRM/SFA")).click();
	
	//	driver.findElement(By.linkText("Leads")).click();

	}

}
