package urmin;

public class S45_T6 {

	public static void main(String[] args) {
	
		Object values []= {23, "Monday", 34, "True", "Sunday"};
		 
		// for each loop
		for (Object x : values) {
			System.out.println(x);
		}
		
		//length of the array and for loop
		
		System.out.println(values.length);
		
	
        for (int x=0; x<=values.length-1; x++ ) {
        	System.out.println("Print the value of index " + x + ":" + values[x]);
        }
        //reverse order
        
        for(int a=values.length-1; a>=0; a--) {
        	System.out.println("Print the value of index " + a + ":" + values[a]);
       
        	//print index 2 and index 3
        	
        	System.out.println("Print the index number 2" + ":" + values[2] );
        	
        	System.out.println("Print the index number 3" + ":" + values[3] );
        	
        	
        	//5th index to 2nd index
        	
        	for (int x=values.length-1; x>=2; x--) {
        		System.out.println("Print the value of index " + x + ":" + values [x]);
        		
        	}
        	
        
     }
	}

}
