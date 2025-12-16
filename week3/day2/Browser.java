package week3day2;

public class Browser {
	
	//method overloading
	// inside the same class, same method name with different arguments & increase the count og arguments
	
	public void browserDetails(String browserName, int browserVersion) {
		System.out.println(browserName + " "+ browserVersion);
	}
	
	public void browserDetails(String browserName) {
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Browser obj = new Browser();
		obj.browserDetails("Edge", 367476134);
		obj.browserDetails("Chrome");
	}
}
