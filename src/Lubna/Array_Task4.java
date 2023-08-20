package Lubna;

public class Array_Task4 {

	public static void main(String[] args) {
		int[]elaArray = new int[5];
		
	//	Array Task 4 :
	// Create an int array without limiting the index length and Put 5 int Value there.
		//assign values to array indices
		elaArray[0]=10;
		elaArray[1]=20;
		elaArray[2]=30;
		elaArray[3]=40;
		elaArray[5]=50;
		
	//Print all the value with for each loop 
		
		for (int value: elaArray) {
			System.out.println(value);
		}
	// Find out the length of the array and Print all the value from 1rst index to last index with For loop
		
		for (int i = 0; i <elaArray.length; i++) {
			System.out.println(elaArray[i]);
		}
	// Print all the value from last Index (a.length-1) to first Index (Printing should be in reverse order)
		for (int i = elaArray.length - 1; i >=0; i--) {
			System.out.println(elaArray[i]);
		}
		
	// Print all the value 5th index to 2nd index. 
        for (int i = 4; i >=i; i--) {
        	System.out.println(elaArray[i]);
        }
	}

}
