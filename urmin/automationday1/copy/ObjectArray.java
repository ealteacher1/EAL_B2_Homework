package automationday1.copy;



public class ObjectArray {

	public static void main(String[] args) {
		Object Array []= new Object [10];
		
		 Array [1]=  "Carl"; 
	     Array [5]=   20;
		 Array [8]=  "Tom";
		 
		 System.out.println(Array.length);

	 // for each loop
	
	for(Object a: Array) {
		System.out.println(a);
	}
	// Print the value of index 2 and index number 3 individually
	 System.out.println("Print the value of index number 2" + ":" + Array[2]);
	 
	 System.out.println("Print the value of index number 3" + ":" + Array[3]);
	
	

	//print value from reverse order.
	
	for(int k= Array.length-1; k>=0; k--) {
		System.out.println("Print the value at index " + k +":" + Array[k]);
		
		//print the value of 5th index to 8th index
		
		for(int x =5; x<=8; x++) {
			System.out.println("Print the value of index " + x + ":" + Array[x]);
			
			//print the value of 8th index to 4th index
			
			for (int b=8; b>=4; b--) {
				System.out.println("Print the value of index " + b + ":" + Array[b]);
			}
		}
	}
	}
}
