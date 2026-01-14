package week6.day2;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) throws IOException {

		//Step1:
		ExtentHtmlReporter wb = new ExtentHtmlReporter("./report/loginReport.html");
		
		//Step2:
		ExtentReports repo = new ExtentReports();
		
		//Step3:
		repo.attachReporter(wb);
		
		//Step4:
		ExtentTest test = repo.createTest("LoginPage", "LeafTaps");
		test.pass("Enter the valid userName");
		test.fail("Enter the invalid passWord");
		test.fail("Login falied");
		repo.flush();
	}
}
