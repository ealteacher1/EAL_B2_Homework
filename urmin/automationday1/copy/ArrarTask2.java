package automationday1.copy;

public class ArrarTask2 {

	public static void main(String[] args) {
		
		String names []= new String [11];
		
		names [1]= "James";
		names [3]= "Mike";
		names [6]= "John";
		
		//length of the array
		System.out.println(names.length);
		
		//for each loop
		for(String a: names) {
			System.out.println(a);
			
		}
		//print the value of the index number 3 and five individually
		System.out.println("Print the value of the index number 3 : " + names [3] );
		System.out.println("Print the value of the index number 5 : " + names [5]);

	
        //for loop print all the value
		
	    for(int x=0; x<= names.length-1; x++) {
	    	
	    System.out.println(names[x]);
	    }
	//Print all the value in reverse order
	
	    for(int x= names.length-1; x>=0;x--) {
		 System.out.println("Print the value at index" + x + ":" + names[x]);
	}
	//print the value 5th index to 8th index
	   
	    for(int x =5; x<=8; x++) {
	    	System.out.println("Print the value " + x + " : "+ names[x]);
	    }
	
	//print the value from 8th index to 4th index
	    
	
	for(int x= 8; x>=4; x--) {
		System.out.println("Print the value of " + x + ":" + names [x]);
		
	}
		}
}
	

