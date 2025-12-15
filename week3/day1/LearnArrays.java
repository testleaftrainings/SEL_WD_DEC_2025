package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {

		// Two ways/types of Arrays Declaration
		// 1.Literals; 2.Instantiation

		// syntax - Literals
		// 0 1 2 3 4
		int number[] = { 98, 89, 89, 96, 74 };

		// To find the length of the value/Array.
		// Index starts with 1
		int lengthOfArray = number.length;
		System.out.println(lengthOfArray);

		// To find the last index value.
		System.out.println("Last Indedx Value of number " + number[lengthOfArray - 1]);

		// To find the first index value.
		System.out.println("Last Indedx Value of number " + number[0]);
		
		// To sort the array value - 74, 89, 89, 96, 98
		Arrays.sort(number);
		System.out.println("Array after sorting " + number[0]);
		
		// To iterate the Arrays value - forLoop
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}

	}

}
