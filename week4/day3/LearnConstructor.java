package week4.day3;

public class LearnConstructor {
	//this & super- keywords
	
	//Global Variable
	int number;
	String name;
	
	//Constructor - doesnt have return type; same name of the class
	//Default constructor 
	public  LearnConstructor() {
		System.out.println("Im a Default constructor");
	}
	
	//Parameterized constructor
	public LearnConstructor(int number) {
		System.out.println("Im a Parameterized constructor" + number);
	}
	
	public LearnConstructor(String name ,int number) {
		System.out.println("Im a Parameterized constructor" + number + "" + name);
		this.name=name;
	}
	
	public LearnConstructor(int number, String name) {
		System.out.println("Im a Parameterized constructor" + name +  "" + number );
		this.number = number;
	}
	
	public static void main(String[] args) {
	
		LearnConstructor obj = new LearnConstructor(20,"Sathya");
		obj.name = "Kaviya";
		obj.number = 8;
	}
}
