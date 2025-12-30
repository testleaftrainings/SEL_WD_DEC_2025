package week5.day2;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	@Test(priority = 2)
	public void CreateLead() {
		System.out.println("CreateLead");
	}

	@Test (priority = -3)
	public void EditLead() {
		System.out.println("EditLead");
	}

	@Test(invocationCount = 3)
	public void DeleteLead() {
		System.out.println("DeleteLead");
	}

	@Test(enabled = true)
	public void MergeLead() {
		System.out.println("MergeLead");
	}

	@Test(enabled = false, priority = 4)
	public void DuplicateLead() {
		System.out.println("DuplicateLead");
	}

}
