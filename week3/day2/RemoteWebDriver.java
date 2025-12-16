package week3day2;

public class RemoteWebDriver implements WebDriver {
	@Override
	public void findElement() {
	}
	@Override
	public void findElements() {
	}
	@Override
	public void get() {
	}
	@Override
	public void key() {
	}
	@Override
	public void clicked() {
	}
	@Override
	public void got() {
	}
	@Override
	public void keys() {
	}
	// interface - class = implements (Concrete class)
	// class - class = extends
	public static void main(String[] args) {
		// In concrete class i can able to create an object and access the methods from
		// the interface. click - default
		RemoteWebDriver obj = new RemoteWebDriver();
		obj.click();
		WebDriver.quit();
	}
}
