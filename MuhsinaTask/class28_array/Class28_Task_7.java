package class28_array;

public class Class28_Task_7 {

	public static void main(String[] args) {
		
		
// Create a multi dim Object array with 2 rows and 2 columns and Put 4 int Value in all cells of the table.
		
		int a [] []=new int [2][2];
		
		a [0][0]=5;
		a [0][1]=10;
		a [1][0]=15;
		a [1][1]=20;
		
		
//1. Print all the value with for loop.
		
		System.out.println("------ans no 1--------");
		
		for (int i=0; i<=a.length-1; i++) {
			for (int j=0; j<=a[0].length-1; j++) {
				System.out.println(a[i][j]);
			}
		}
		
		
//2.Find out the value which is in 1rst row , 2nd Column.
		
		System.out.println("------ans no 2--------");
		
		System.out.println(a[0][1]);
		
//3. Find out the length of the rows and columns for this array and Print all the value of this array with For each Loop.
		
		System.out.println("------ans no 3--------");
		
		System.out.println(a.length);
		
		System.out.println(a[0].length);
		
		for (int u[]: a) {
			
			for (int v:u) {
				System.out.println(v);
			}
			
		}


	}

}
