package urmin;

public class S36_T1 {

	public static void main(String[] args) {
		
	int Array []= new int [10];
	
	Array[1]=10;
	Array[7]=50;
	Array[9]=80;
	
	System.out.println(Array.length);// length=10
	
	//for each loop
	
	
	for(int a:Array) {
		System.out.println(a);// 
		
		
	}
	 
	//for loop
	for(int x=0; x<=Array.length-1; x++) {
		
		System.out.println(Array[x]);
		
		
	}
	
		//print value of index no 5 and index  7 
	
	System.out.println("Value of index 5: " + Array[5]);
	
	System.out.println("Value of index 7: " + Array[7]);
	
	//print all value from last index to first index
	
	for(int x=Array.length-1; x>=0; x--) {
		System.out.println("Print the value at index " + x +":" + Array[x]);
	}
		// print all the value from 5th index to 8th index
	
     for(int x=5; x<=8; x++) {
    	 System.out.println("Value at index " + x + ": " + Array[x]);
    	 
    	 
     }
     for(int x=8; x>=4; x--) {
    	 System.out.println("Value at index " + x + ": " + Array[x]);
    	 
     
	}

     
	}
}