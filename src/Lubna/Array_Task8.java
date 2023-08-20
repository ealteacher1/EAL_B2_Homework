package Lubna;

public class Array_Task8 {

	public static void main(String[] args) {
		String[][] multiDimStringArray = new String[3][2];

		// Array Task 8 :
	// Create a multi dim String array with 3 rows and 2 columns and Put 2 int Value 
		//in any of the cells of the table. 
		
		multiDimStringArray[0][0]="hello";
		multiDimStringArray[1][1]="world";
		 
		// Print all the value with for loop.
		for (int row = 0; row < multiDimStringArray.length; row++) {
			for (int col = 0; col < multiDimStringArray[row].length; col++) {
				System.out.println(multiDimStringArray[row][col]);
			}
		}
		//Find out the value which is in 1rst row , 2nd Column.
		
		System.out.println("Value at (1,2):" + multiDimStringArray[0][1]);
		
		// Find out the length of the rows and columns for this array and Print all the value of this array 
		//with For Loop.
		
		int numRows = multiDimStringArray.length;
		int numCols = multiDimStringArray[0].length;
		System.out.println("number of rows:" + numRows);
		System.out.println("Number of columns: " + numCols);
		
		//print all values with for loop
		
		for (int row = 0; row < numRows; row++) {
			for ( int col = 0; col < numCols; col++) {
				System.out.println(multiDimStringArray[row][col]);
				
			}
		}
		
		

	}

}
