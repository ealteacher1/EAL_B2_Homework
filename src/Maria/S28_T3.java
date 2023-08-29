package Maria;

public class S28_T3 {

	public static void main(String[] args) {
	
//		Array Task 3  //
		
		
	String rana []= {"maria","muhsina","lubna","tahsin","ria"};	
		
	// Print all the value with for each loop
	
	for(String taz:rana ) {
		System.out.println(taz);
	}
		
	// ○ Print the value of index number 2and index 3 individually. (Be careful with the index
	//name.Index Name and Index number are not same.) 	
		
	System.out.println(rana[1]);	
	System.out.println(rana[2]);
	
// Print all the value from 1rst index to last index with For loop 	
		
System.out.println(rana.length);
for(int a=0; a<=rana.length-1; a++) {
	System.out.println(rana[a]);
}
		
// Print all the value from last Index (a.length-1) to first Index (Printing should be in reverse
// order)


System.out.println(rana.length);
for(int b=rana.length-1; b>=0; b--) {
	System.out.println(rana[b]);
}


// Print all the value 5th index to 2nd index. 


for(int c=4; c>=1; c--) {
	System.out.println(rana[c]);
}


	}

}
