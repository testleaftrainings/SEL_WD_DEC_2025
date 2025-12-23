package week4.day2;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
public class LearnKeyBoardAct {

	public static void main(String[] args) throws IOException {
		// Step 1: Declaring BrowserDriver
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Maximizing window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 2: declare the URL of the application/Website
		driver.get("https://www.snapdeal.com/");
		//KeyBoard action - ENTER
		driver.findElement(By.id("search-box-input")).sendKeys("Bike",Keys.ENTER);
		//To take ScreenShot
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./data/Sample1.png");
		FileUtils.copyFile(screenshotAs, target);
	}

}
