package week2.day4;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverMethods {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// .getText(); - //label[text()='Username']
		String text = driver.findElement(By.xpath("//label[text()='Username']")).getText();
		System.out.println(text);
		
		//verifying the title
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.contains("Login")) {
			System.out.println("It contains 'Login'");
		} else {
			System.out.println("It Does not contains 'Login'");
		}
		
		//.getCurrentURL();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//.getAttribute - SEL 4.20.0 - .getDomAttribute();
		@Nullable
		String domAttribute = driver.findElement(By.xpath("//input[@id='password']"))
		.getDomAttribute("size");
		
		System.out.println(domAttribute);
		
		//isEnabled 
		boolean enabled = driver.findElement(By.xpath("//input[@id='password']")).isEnabled();
		System.out.println(enabled);
	}

}
