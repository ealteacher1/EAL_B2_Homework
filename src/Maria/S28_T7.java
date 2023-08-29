package Maria;

public class S28_T7 {

	public static void main(String[] args) {
		
		
		// Array Task 7 //
		
		
	
	

		Object [][] y=new Object [2][2];
		
		y[0][0]=400;
		y[0][1]=200;
		y[1][0]=300;
		y[1][1]=100;
				
		
		
		System.out.println("***************** 1st one *******************************");
		
		
		// Print all the value with for loop.
		
		  for(int row=0;row<y.length;row++) { 
			  for(int column=0;column<y[0].length;column++) { 
			  System.out.println(y[row][column]); }
		  }
		 
		
		System.out.println("***************** 2nd one *******************************");
		
	// ○ Find out the value which is in 1rst row , 2nd Column. //
		
		System.out.println(y[0][1]);
		

		System.out.println("***************** 3rd one *******************************");
		
		// Find out the length of the rows and columns for this array and Print all the value of this array
	//	with each For Loop
		
		
		
		System.out.println(y.length);
		System.out.println(y[0].length);
		
		 for(Object mr[]:y) {
			 for(Object ab:mr) {
				System.out.println(ab); 
			 }
		 }
		  
		
		
		
		
		
	}

}
