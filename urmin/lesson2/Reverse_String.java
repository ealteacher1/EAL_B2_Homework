package lesson2;

public class Reverse_String {

	public static void main(String[] args) {
		String name= "Urmin";
		String reversedName = reverseString(name);
		
		System.out.println("Original Name: " + name);
		System.out.println("Reversed name: " + reversedName );
		
	}
	public static String reverseString(String str) {
		
		StringBuilder reversed = new StringBuilder();
		
		for(int i=str.length()-1; i>=0; i--){
			reversed.append(str.charAt(i));
		}
		return reversed.toString();
	}
	// another example
	public class ReverseStringExample {
	    public static void main(String[] args) {
	        String original = "Hello World";
	        
	        StringBuilder reversed = new StringBuilder(original);
	        reversed.reverse();
	        
	        System.out.println(reversed.toString()); // Output: !dlrow ,olleH
	    }
	}
}
