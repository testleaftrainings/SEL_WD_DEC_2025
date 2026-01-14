package week6.day2;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		//Handling the exception
		int a = 5;
		int b = 0;
		
	//	System.out.println(a/b);

		try {
			System.out.println(a/b);
		} catch (Exception x) {
			// TODO Auto-generated catch block
			//x.printStackTrace();
		}finally {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		System.out.println("Cannot divisible by 0");
	}

}