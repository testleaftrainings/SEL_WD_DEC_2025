package week4.day3;

public class LearnStaticKeyWord {

	// static - variable
	static int number = 05;

	// static - method
	public static void staticMethod() {
		System.out.println("Im a staticMethod");
	}

	// static - Block
	static {
		System.out.println("Iam a static block");
	}
	
	public static void main(String[] args) {
		//LearnStaticKeyWord.staticMethod();
		staticMethod();
		
		System.out.println(number);
		
		
	}
	
}
