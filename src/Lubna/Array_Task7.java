package Lubna;

public class Array_Task7 {

	private static String numCols;

	public static void main(String[] args) {
		
		Object[][]multiDimArray = new Object[2][2];
		
		//Array Task 7 :
//Create a multi dim Object array with 2 rows and 2 columns and Put 4 int 
//Value in all cells of the table. 
		
		multiDimArray[0][0]=10;
		multiDimArray[0][1]=20;
		multiDimArray[1][0]=30;
		multiDimArray[1][1]=40;
		
				
		//Print all the value with for loop.
		
		for ( int row = 0; row < multiDimArray.length; row++) {
			for (int col =0; col < multiDimArray[row].length; col++) {
				System.out.println(multiDimArray[row][col]);
			}
		}
		// Find out the value which is in 1rst row , 2nd Column.
		
		System.out.println("Value at (1, 2):" + multiDimArray[0][1]);
		
		// Find out the length of the rows and columns for this array and Print all the value of this array 
		//with For Loop.
		
		int numRows = multiDimArray.length;
		int numCole = multiDimArray[0].length;
		
	System.out.println("Number of rows: " + numRows);

	System.out.println("Number of cloumns: " + numCols);
	
	

			
		}
	

	}


