package Lubna;

public class Array_Task5 {

	public static void main(String[] args) {
		
		Object[]myArray = new Object[10];
		
		
		// Array Task 5 :
	//Create an Object array with 10 index (Variable Name should not be single 
	//Digit,it can be a name or anything but not a ,b, c ,d) and Put any value on 
	//Index number 1 (ex: a[0]), index number 5 , and Index number 8.
		
		myArray[1] = "Value at index 1";
		myArray[5] = "Value at index 5";
		myArray[8] = "Value at index 8";
		
		
				 
	// Find out the length of the array and Print all the value with for each loop 
		System.out.println("Arry length:" + myArray.length);
		for (Object value : myArray) {
			System.out.println(value);
		}
		
		
	// Find out the length of the array and Print all the value from 1rst index to last index with For loop
		for (int i = 1; i <myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
	//Print the value of index number 2and index 3 individually. (Be careful with the index 
	//name.Index Name and Index number are not same.) 
		
		System.out.println("Value at index 2:" + myArray[2]);
		System.out.println("Value at index 3:" + myArray[3]);
		
		
		
	//Print all the value from last Index to first Index (Printing should be in reverse order)
		
	    for (int i = myArray.length -1; i >=0; i--) {
		System.out.println(myArray[i]);
	    }
	//Print all the value 5th index to 8th index. 
		
	    for (int i = 5; i <=8; i++) {
			System.out.println(myArray[i]);
	    }
		
	//Print all the value from 8th Index to 4th index . 
		
	    for (int i=8; i>=4; i--) {
	    	System.out.println(myArray[i]);
	    }
	}

}
