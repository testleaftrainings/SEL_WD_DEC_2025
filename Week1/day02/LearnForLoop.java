package week1.day2;

public class LearnForLoop {

	public static void main(String[] args) {

		//Iteration - forLoop
		//int i = 0; - Initialization.
		// i < args.length; - Condition.
		//i++ - Increment/Decrement.
		
		int number = 10;
		
		
		for (int i = 0; i < number; i++) {
			if (i==3) {
				System.out.println("The given value is Equal to 3");
				continue;
			}else if (i==5) {
				System.out.println("The given value is Equal to 5");
				break;
			}else {
				System.out.println("Neigther 3 nor 4");
			}
		}
	}

}
