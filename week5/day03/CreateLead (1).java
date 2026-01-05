package week5.day3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day3.ReadValueFromExcel;

public class CreateLead extends BaseClass {

	// DynamicParameterization
	@DataProvider(name = "getValue")
	public String[][] fetchData() throws IOException {
	return ReadValueFromExcel.getValue();
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
