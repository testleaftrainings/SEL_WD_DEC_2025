package week3.day1;

public class AutoMobileParts {

	// horn ; breaking ; clutch ; acceleator

	public void horn() {
		System.out.println("Horn");

	}

	public void breaking() {
		System.out.println("Breaking");

	}

	public void clutch() {
		System.out.println("Clutch");

	}

	public void acceleator() {
		System.out.println("Acceleator");

	}

	public static void main(String[] args) {
			
			//Object creation
			AutoMobileParts auto = new AutoMobileParts();
			auto.acceleator();
			auto.breaking();
			auto.clutch();
			auto.horn();
		
	}

}
