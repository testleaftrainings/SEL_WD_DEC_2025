package week3.day3;

import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// Types of Arrays - Static; Dynamic
		char[] values = { 'a', 'e', 'i', 'o', 'u' , 'a'};
		Set<Character> unique = new TreeSet<Character>();
		// a- 97; e -101; i -105; o -111; u -117
		// ForEach
		for (Character i : values) {
			unique.add(i);
		}
		System.out.println(unique);

	}
}
