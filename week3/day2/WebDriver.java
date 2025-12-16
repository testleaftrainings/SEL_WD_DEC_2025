package week3day2;

public interface WebDriver {
	
	// Unimplimented methods
	// public; private; protected; default
	
	void findElement();
	
	public void findElements();
	
	public void get();
	
	// till java 1.7 - 100% Abstract method - Only unimplimented Methods
	
	//implimented method - 2 types
	//1.Static method ;2. default method
	
	static void quit() {
		System.out.println("Static - quit");
	}
	
	default void click() {
		System.out.println("default - click");
	}
	
	void key();
	
	void clicked();
	
	void got();
	
	void keys();
	
}
