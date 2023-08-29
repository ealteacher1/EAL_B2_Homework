package Lubna;

public class Array_Task2 {

	public static void main(String[] args) {
		
	  String[]appleArray=new String[10];
		
		// Array Task 2 :
		//● Create an String array with 11 index (Variable Name should not be single 
		//Digit,it can be a name or anything but not a ,b, c ,d) and Put any value on 
		//Index number 1 (ex: a[0]), index number 3 , and Index number 6.//
		
		//Assign values to specific indices
		appleArray[0]="hello";
		appleArray[3]="world";
		appleArray[6]="Ela";
		
				 
		// Find out the length of the array and Print all the value with for each loop
		for (String value: appleArray) {
			System.out.println(value);
		}
		
		
		// Print the value of index number 3 and index 5 individually.
		
		System.out.println(appleArray[3]);
		System.out.println(appleArray[5]);
		
		// Find out the length of the array and Print all the value from 1rst //index to last index with For loop
		
		for (int i =1; i<appleArray.length; i++) {
			System.out.println(appleArray[i]);
			
		}
			
		// Print all the value from last Index (a.length-1) to first Index (Printing should be in reverse 
			//order)
		
		for (int i = appleArray.length - 1; i >=0; i--) {
			
			System.out.println(appleArray[i]);
		}
		// Print all the value 5th index to 8th index. 
		
		for ( int i =5; i<=8; i++) {
			System.out.println(appleArray[i]);
		}
		//Print all the value from 8th Index to 4th index . 
		
		
	      for (int i = 8; i >=4; i--) {
	    	  System.out.println(appleArray[i]);
	}
	}
}
