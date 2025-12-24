package week4.day3;

public class LearnSuperKW extends LearnConstructor{
	
	//Step 1 - Inherit
	//Step 2 - using super kewWord
	
	public LearnSuperKW() {
		
		super(18, "ANBU");
		super.name= "VIRAT";
		super.number= 18;
	}
	
	
	public static void main(String[] args) {
		LearnSuperKW obj = new LearnSuperKW();
		System.out.println(obj.name);
	}
	
	

}
