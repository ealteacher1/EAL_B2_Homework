package Maria;

public class S28_T6 {

	public static void main(String[] args) {
		
		//  Array task 6  //
		
	Object maria []= {1,2,3,4,5};
	
//  Print all the value with for each loop
	
	for(Object number:maria) {
		System.out.println(number);
	}
		
		
// Find out the length of the array and Print all the value from 1rst index to last index with For
//	loop 		
		
System.out.println(maria.length);
for(int a=0; a<=maria.length-1; a++) {
	System.out.println(maria[a]);
}
		
		
// Print all the value from last Index (a.length-1) to first Index (Printing should be in reverse
//order)		
		
		
System.out.println(maria.length);
for(int b=maria.length-1; b>=0; b--) {
	System.out.println(maria[b]);
}
		
		
//  Print the value of index number 2and index 3 individually. (Be careful with the index
// name.Index Name and Index number are not same.) 		
		
		System.out.println(maria[1]);
		
		System.out.println(maria[2]);
		
		
		
//  Print all the value 5th index to 2nd index. 
		
	for(int c=4; c>=1; c--) {
		System.out.println(maria[c]);
	}
		
		
		
		
		
		

	}

}
