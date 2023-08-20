package Maria;

public class S28_T4 {

	public static void main(String[] args) {
		
		// Array Task 4 //
		
		int a []= {1,2,3,4,5};
		
		// Print all the value with for each loop
		
		for(int b:a) {
			System.out.println(b);}
		
	// Find out the length of the array and Print all the value from 1rst index to last index with For
	//	loop	
			
		System.out.println(a.length);
		for(int r=0; r<=a.length-1; r++) {
		System.out.println(a[r]);	
		}
			
			
	// Print all the value from last Index (a.length-1) to first Index (Printing should be in reverse
	//	order)		
			
		System.out.println(a.length);
		for(int d=a.length-1; d>=0; d--) {
			System.out.println(a[d]);
		}
		
		// Print all the value 5th index to 2nd index
		
		for(int t=4; t<=1; t--) {
			System.out.println(a[t]);
		}
		
		

	}

}
