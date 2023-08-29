package Maria;

public class S28_T1 {

	public static void main(String[] args) {
		
		// String Array Task 1 //
		
		
	String ria []= new String [11];
	
	
	ria[0]="maria";
	ria[3]="lubna";
	ria[6]="mohsina";

	
	// Find out the length of the array and Print all the value with for each loop
System.out.println(ria.length);	
	
for(String mimi:ria) {
	System.out.println(mimi);
}


// Print the value of index number 3 and index 5 individually.
System.out.println(ria[3]);
System.out.println(ria[5]);

// Find out the length of the array and Print all the value from 1rst index to last index with For
// loop

System.out.println(ria.length);	

for(int a=0; a<=ria.length-1; a++) {
	System.out.println(ria[a]);
}
		
// Print all the value from last Index (a.length-1) to first Index (Printing should be in reverse
// order)		
		
System.out.println(ria.length);	
for(int b=ria.length-1; b>=0; b--) {
	System.out.println(ria[b]);
}
		
	// Print all the value 5th index to 8th index
for(int c=5; c<=8; c++) {
	System.out.println(ria[c]);
}
		
// Print all the value from 8th Index to 4th index . 
		
	for(int d=8; d>=4; d--)	{
		System.out.println(ria[d]);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
