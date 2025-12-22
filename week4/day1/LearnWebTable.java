package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub - https://www.leafground.com/table.xhtml

		// Step 1: Declaring BrowserDriver
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Maximizing window
		driver.manage().window().maximize();
		// Step 2: declare the URL of the application/Website
		driver.get("https://www.leafground.com/table.xhtml");

		//finding the First data in the webTable
		String firstData = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).
				getText();
		System.out.println(firstData);
		
		//finding 3rd row 2nd column
		String reqData = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[3]/td[2]")).
				getText();
		System.out.println(reqData);
		
		//printing the 2nd row value
		String secRow = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[2]")).
				getText();
		System.out.println(secRow);
		
		//printing the row value
		List<WebElement> rowElements = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		List<WebElement> colElements = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[2]/td"));

		//rowElements
		for (int i = 1; i < rowElements.size(); i++) {
			System.out.println("|");
			//colElements
			for (int j = 1; j < colElements.size(); j++) {
				String datas = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(datas + "|");
				
			}
			
		}
		
	}

}
