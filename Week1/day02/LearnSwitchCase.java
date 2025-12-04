package week1.day2;

public class LearnSwitchCase {

	public static void main(String[] args) {

		String day = "Sunday";

		switch (day) {
		case "Monday":
			System.out.println("The current day is Monday");
			break;
		case "Tuesday":
			System.out.println("The current day is Tuesday");
			break;
		case "Wednesday":
			System.out.println("The current day is Wednesday");
			break;
		case "Thursday":
			System.out.println("The current day is Thursday");
			break;
		case "Friday":
			System.out.println("The current day is Friday");
			break;
		case "Saturday":
			System.out.println("The current day is Saturday");
			break;

		default:
			System.out.println("It is Holiday");
			break;
		}
	}

}
