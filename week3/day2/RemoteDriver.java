package week3day2;

public abstract class RemoteDriver implements WebDriver {
	
	@Override
	public void findElements() {
		System.out.println("Abstract - findElements");
	}
	
	@Override
	public void findElement() {
		System.out.println("Abstract - findElement");
	}
	
	@Override
	public void get() {
		// TODO Auto-generated method stub
	}
	
	private void drag() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		
		//abstract class cannot able to create the object for interface
		//WebDriver obj = new WebDriver();
		
		//RemoteDriver obj = new RemoteDriver();
	}
	
}
