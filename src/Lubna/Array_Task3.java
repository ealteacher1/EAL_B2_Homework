package Lubna;

public class Array_Task3 {

	public static void main(String[] args) {
		
		String[]dynamicArray = new String[5];
		// Array Task 3 :
		// Create an String array without limiting the index length(Variable Name should 
		//not be single Digit,it can be a name or anything but not a ,b, c ,d) and Put 5 
		//String Value there.
		//assign values to array indices
		dynamicArray[0] = "Apple";
		dynamicArray[1] = "Banana";
		dynamicArray[2] = "Cherry";
		dynamicArray[3] = "Grape";
		dynamicArray[4] = "Orange";
				 
		// Print all the value with for each loop 
		for (String value :dynamicArray){
			System.out.println(value);
			
		}
		//Print the value of index number 2and index 3 individually. (Be careful with the index 
		//name.Index Name and Index number are not same.) 
		
		System.out.println(dynamicArray[2]);
		System.out.println(dynamicArray[3]);
		
		// Print all the value from 1rst index to last index with For loop 
		
		for (int f = 0; f < dynamicArray.length; f++) {
			System.out.println(dynamicArray[f]);
		}
		//Print all the value from last Index (a.length-1) to first Index (Printing should be in reverse 
		//order)
		
		for (int f = dynamicArray.length - 1; f >=0; f--) {
			System.out.println(dynamicArray[f]);
		}
		//Print all the value 5th index to 2nd index. 
		
		for (int f = 4; f >=1; f--) {
			System.out.println(dynamicArray[f]);
		}

	}

}
