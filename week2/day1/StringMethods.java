package week2.day1;

public class StringMethods {

	public static void main(String[] args) {

		//.split(); - to split the given String using delimiter.
		String name = "Today is Monday";
		System.out.println(name);
		String[] splitName = name.split(" ");
		//System.out.println(splitName);
		
		for (int i = 0; i < splitName.length; i++) {
			System.out.println(splitName[i]);
		}

		//.replace(); - to replace a character in string with another character.
		String replaceValue = "Good Afternoon";
		String replaced = replaceValue.replace('o', '0');
		System.out.println(replaced);
		
		//.replaceAll(); - To replace each character of the string.
		//[a-z], [A-Z], [a-z A-Z], [0-9], [<@$#%&*,.>], [^0-9]
		String repAll = "Welcome to TestLeaf @ 2025";
		String replaceAll = repAll.replaceAll("[^0-9]", "A");
		System.out.println(replaceAll);
		
		//.toUpperCase(); - to convert the given string value to uppercase.
		String upCase = "IAM UPPERCASE";
		System.out.println(upCase.toLowerCase());
		
		//.toLowerCase(); - to convert the given string value to lowercase.
		String lowCase = "iam lower case";
		System.out.println(lowCase.toUpperCase());
		
		//.parseInt(); - it converts the string into integer.
		String price = "2500";
		int int1 = Integer.parseInt(price);
		System.out.println(int1);
		
		
		
	}

}
