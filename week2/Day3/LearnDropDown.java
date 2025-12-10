package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Declaring BrowserDriver
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Maximizing window
		driver.manage().window().maximize();

		// Step 2: declare the URL of the application/Website
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		// Click on Elements - (//li[@class='ui-menuitem-submenu'])[3]
		driver.findElement(By.xpath("(//li[@class='ui-menuitem-submenu'])[3]")).click();
		
		// Click on Dropdown Field - menuform:m_dropdown
		driver.findElement(By.id("menuform:m_dropdown")).click();
		
		// Select the dropdown element - ui-selectonemenu
		WebElement element = driver.findElement(By.className("ui-selectonemenu"));
		
		Select options = new Select(element);
		
		//index - Starts from '0'
		options.selectByIndex(2);
		
		Thread.sleep(3000);
		
		//Visible text
		options.selectByVisibleText("Cypress");
		
		// Non select DropDown - j_idt87:country_label
		driver.findElement(By.id("j_idt87:country_label")).click();
		
		Thread.sleep(2000);
		
		// Selecting dropdown value - j_idt87:country_2 - Germany
		driver.findElement(By.id("j_idt87:country_2")).click();
	}

}
