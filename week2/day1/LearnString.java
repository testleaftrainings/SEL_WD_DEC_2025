package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		
		//String - Literal - String ConstantPool
		String name = "Gowthami";
		
		//String - Instantiation - String Heap memory
		String varName = new String ("Priyanka");
		
		//.length(); - to find the number of character in the value.
		System.out.println("No.Of.Characters in name var is "+name.length());
		
		//.equals(); - to compare two String values.
		if (name.equals(varName)) {
			System.out.println("Both the values are Equal");
		} else {
			System.out.println("Both the values are Not Equal");
		}
		
		//.equalIgnoreCase(); - to compare two String values but it will ignore the case.
		String refName = "Kaviya";
		String newRefName = "KaViYa";
		
		if (refName.equalsIgnoreCase(newRefName)) {
			System.out.println("Ref name is Equal");
		} else {
			System.out.println("Ref name is Not Equal");
		}
		
		//.contains(); - it will check the char is present or not(Case sensitive)
		//return type is boolean
		//convert it to a local Variable.
		boolean contains = refName.contains("a");
		System.out.println(contains);
		
		//.toCharArray(); - to convert the String into a characterArray.
		String data = "Bharath";
		char[] charArray = data.toCharArray();
		
		//Print the / ReverseString.
		for (int i = charArray.length-1; i >=0; i--) {
			System.out.println(charArray[i]);
		}
		
		//.charAt(); - to print the particular character using index.
		//The index value starts from '0'.
		System.out.println("Index value of 3 is " + data.charAt(3));
		
		
	}

}
