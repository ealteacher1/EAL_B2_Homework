package Maria;

public class S28_T2 {

	public static void main(String[] args) {
	
//	Array Task 1 //
		
int maria []= new int [10]; 
		
maria[0]=5;
maria[7]=10;
maria[9]=15;		


// Find out the length of the array and Print all the value with for each loop 


  System.out.println(maria.length);
  
  for(int a=0;a<=maria.length-1;a++){ 
	  System.out.println(maria[a]); }
 
		
 // Find out the length of the array and Print all the value from 1rst index to last index with For
 // loop	

 System.out.println(maria.length);
  
 for(int a=1; a<=maria.length-1; a++) {
	 System.out.println(maria[a]); }
 
	// Print the value of index number 5 and index 7 individually. (Be careful with the index
// name.Index Name and Index number are not same.) 	

 System.out.println(maria[5]);
  
 System.out.println(maria[7]);
  
//  Find out the length of the array and Print all the value from last Index (a.length-1) to first Index
//(Printing should be in reverse order)
 
 
System.out.println(maria.length);
	
for(int i=maria.length-1; i>=0; i-- ) {
	System.out.println(maria[i]);
}
		
// Find out the length of the array and Print all the value 5th index to 8th index. 
		
System.out.println(maria.length);		
for(int b=5; b<=8; b++)	{
	System.out.println(maria[b]);
}
		
// Find out the length of the array and Print all the value from 8th Index to 4th index . 


System.out.println(maria.length);
for(int c=8; c>=4; c--) {
	System.out.println(maria[c]);
}
		
	









	}

}
