package week2.day1;

public class LearnMethods {

	// syntax for creating Method

	// Access modifier ReturnType methodName(){ }

	public void method1() {
		System.out.println("Iam a Public method");
	}

	protected String method2(String name, int IdNum) {
		System.out.println("Iam a Protected method " + name + IdNum);
		return name + IdNum;
	}

	void method3() {
		System.out.println("Iam a Protected method");
	}

	private void method4() {
		System.out.println("Iam a Private method");
	}

	public static void main(String[] args) {

		// Syntax for creating Object for a class
		// ClassName Object = new ClassName();

		LearnMethods hemalathaObj = new LearnMethods();
		hemalathaObj.method1();
		hemalathaObj.method2("Hemalatha", 10);
		hemalathaObj.method3();
		hemalathaObj.method4();
		
		LearnMethods sandeepObj = new LearnMethods();
		sandeepObj.method1();
		sandeepObj.method2("Sandeep ", 15);

		sandeepObj.method3();
		sandeepObj.method4();

	}

}
