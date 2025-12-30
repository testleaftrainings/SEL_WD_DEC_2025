package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	// DynamicParameterization
	@DataProvider(name = "getValue")
	public String[][] fetchData() {
		String[][] data = new String[2][3];
		// |cName|fName|lName|
		// |cName|fName|lName|
		data[0][0] = "TestLeaf";
		data[0][1] = "Jameel";
		data[0][2] = "J";

		data[1][0] = "TestLeaf";
		data[1][1] = "Sowmiya";
		data[1][2] = "S";

		return data;
	}

	@Test(dataProvider = "getValue")
	public void createLead(String cName, String fName, String lName) throws InterruptedException {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
	}
}
