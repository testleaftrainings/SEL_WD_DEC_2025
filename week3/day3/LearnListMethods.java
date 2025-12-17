package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnListMethods {

	public static void main(String[] args) {

		// List Syntax & methods 
		List<Integer> value = new ArrayList<Integer>();
		// .add();
		value.add(50);
		value.add(30); //{100,90,100}
		value.add(100);
		System.out.println(value);
		
		//List<Integer> value2 = new ArrayList<Integer>();
		// .add();
		//value.add(100);
		//value.add(90); //{100,90,100}
		//value.add(80);
		
		//.addAll();
		//value.addAll(value2);
		//System.out.println(value2);
		
		// .get(); - index value starts with '0'.
		System.out.println("Get the value present in index 2: "+ value.get(2));
		
		// remove(); - values based on index
		//value.remove(1);
		System.out.println(value);
		
		// .sort(); - sort the list value.
		Collections.sort(value);
		System.out.println(value);
		
		// .clear();
		value.clear();
		System.out.println(value);
	}
}
