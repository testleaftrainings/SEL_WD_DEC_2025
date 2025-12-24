package week4.day3;

public final class LearnFinal {
	//final - class
	
	//final - variable
	final int num = 18;
	
	//final - method
	public final void finalMethod(String name) {
		System.out.println("iam a final method"+ name );
	}
	
	public static void main(String[] args) {
		LearnFinal obj = new LearnFinal();
		obj.finalMethod("Hemalatha");
		
		LearnFinal obj2 = new LearnFinal();
		obj2.finalMethod("Bharath");
		
	}
	
	

}
