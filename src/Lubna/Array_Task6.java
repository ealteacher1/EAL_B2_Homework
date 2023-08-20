package Lubna;

public class Array_Task6 {

	public static void main(String[] args, int[] objectArray) {
		
		Object[]objArray = new Object[5];
		
		// Array Task 6 :
		//Create an Object array without limiting the index length and Put 5 int Value 
		//there.
		
		objArray[0]=10;
		objArray[0]=20;
		objArray[0]=30;
		objArray[0]=40;
		objArray[0]=50;

		
		 
		//Print all the value with for each loop 
		
		
		for (Object value : objectArray) {
			System.out.println(value);
		}
		
		
		//Find out the length of the array and Print all the value from 1rst index to last index with For 
		//loop 
		for (int m = 1; m <= objArray.length; m++) {
		
			System.out.println(objArray[m-1]);
		}
		
		// Print all the value from last Index (a.length-1) to first Index (Printing should be in reverse 
		//order)
		
		for (int m=objArray.length -1; m >=0; m--) {
			System.out.println(objArray[m]);
		}
		//Print the value of index number 2and index 3 individually. (Be careful with the index 
		//name.Index Name and Index number are not same.) 
		
		System.out.println(objArray[2]);
		System.out.println(objArray[3]);
		
		//Print all the value 5th index to 2nd index. 
		
		for (int m = 4; m > 1; m--){
			System.out.println(objArray[m]);
		}

	}

}
