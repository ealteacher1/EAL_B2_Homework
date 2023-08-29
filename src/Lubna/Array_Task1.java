package Lubna;

public class Array_Task1 {

	public static void main(String[] args) {
		int[]customArray = new int[10];
		
		//Assign values to specific indices
		customArray[0]=15;
		customArray[7]=42;
		customArray[9]=28;
		
    //find the length of the array and print all values using for-each loop
		for(int value:customArray) {
			System.out.println(value);
		}
		
		//find the length of the array and print all values from index 1 to
		//last index using for loop
		
		for (int i = 1; i < customArray.length; i++) {
			System.out.println(customArray[i]);
		}
		
		//print the value of index number 5 and index 7 individually
		System.out.println(customArray[5]);
		System.out.println(customArray[7]);
		
	

	  // find the length of the array and print all  values  in reverse order
	
	for (int i = customArray.length - 1; i >=0; i--) {
		System.out.println(customArray[i]);
	}
	
	//print all values from index 5 to 8
	
	for (int i = 5; i <=8; i++) {
		System.out.println(customArray[i]);
	}
	
	//print all values from index 8 to 4
	for (int i = 8; i >=4; i--) {
		System.out.println(customArray[i]);
		
	}

	}
	
	}