package Maria;

public class S28_T8 {

	public static void main(String[] args) {

		
		
		//  Array Task 8   //
		
		/*
		 * String ab [][]= new String [3][2]; 
		 * ab [0][0]="shamim"; 
		 * ab [0][1]="shumon";
		 */
		
		Object av [][]= {{"ria",100},{"ram",400},{"layla","lubna"}};
		
		System.out.println("***************** 1st one *******************************");
		
		// Print all the value with for loop. //

		for(int row=0; row<av.length;row++) {
			for(int column=0;column<av[0].length;column++){
				System.out.println(av[row][column]);
			}
			
		}
		
		System.out.println("***************** 2nd one *******************************");
		//  Find out the value which is in 1rst row , 2nd Column.//
		
		System.out.println(av[0][1]);
		
		
		
		
		System.out.println("***************** 3rd one *******************************");
		
		
		//  Find out the length of the rows and columns for this array and Print all the value of this array
		//  with For each Loop.

		
		System.out.println(av.length);
		System.out.println(av[0].length);
		
		
		for(Object dim[]:av) {
			for(Object rim:dim) {
				System.out.println(rim);
			}
		}
		
		
		
	}

}
