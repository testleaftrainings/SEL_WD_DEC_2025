package week6.day2;

import org.openqa.selenium.NoSuchElementException;

public class ThrowAndThrows {

	public static void main(String[] args) throws InterruptedException {
		
		
			Thread.sleep(3000);
			throw new NoSuchElementException("invalid usearname");
			
	}

}
