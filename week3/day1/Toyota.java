package week3.day1;

public class Toyota extends car{

	public void nameOfCar() {
		System.out.println("SUPRA");
	}
	
	public void logoOfCar() {
		System.out.println("T");
	}
	
	public static void main(String[] args) {
		Toyota product = new Toyota();
		product.designOfCar();
		product.acceleator();
		product.clutch();
		product.breaking();
		product.horn();
		product.logoOfCar();
		product.nameOfCar();
		
		

	}
}
