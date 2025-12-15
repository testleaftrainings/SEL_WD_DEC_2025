package week3.day1;

public class car extends AutoMobileParts{

	public void designOfCar() {
		System.out.println("DesignNo:qwerUIJHBDS990");
	}

	public static void main(String[] args) {
		AutoMobileParts nissanSkyline = new AutoMobileParts();
		nissanSkyline.acceleator();
		nissanSkyline.breaking();
		nissanSkyline.clutch();
		nissanSkyline.horn();
		
		
	}

}
