package Maria;

public class S28_T5 {

	public static void main(String[] args) {
	
		// Array Task 5 //
		
	Object abc []= new Object[10];	
		
	abc[0]=5;
	abc[5]=10;
	abc[8]=15;
	
// Find out the length of the array and Print all the value with for each loop
	
	
	  System.out.println(abc.length);
	  for(Object maria:abc) {
	  System.out.println(maria); }
	 
		
// 	Find out the length of the array and Print all the value from 1rst index to last index with For
//	loop 
		
	
	  System.out.println(abc.length);
	  for(int a=0; a<=abc.length-1; a++) {
	 System.out.println(abc[a]); }
	 
		
		
		
// Print the value of index number 2and index 3 individually. (Be careful with the index
// name.Index Name and Index number are not same.)		
	
	  System.out.println(abc[1]);
	  System.out.println(abc[2]);
	 
		
		
// Print all the value from last Index to first Index (Printing should be in reverse order)		
		
		
for(int b=abc.length-1; b>=0; b--) {
System.out.println(abc[b]);	
}
		
		
// Print all the value 5th index to 8th index. 

for(int u=4; u<=7; u++) {
	System.out.println(abc[u]);
}
		
	
// Print all the value from 8th Index to 4th index . 

for(int y=7; y>=3; y--) {
	System.out.println(abc[y]);
}




	}

}
