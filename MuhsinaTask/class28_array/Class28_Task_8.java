package class28_array;

public class Class28_Task_8 {

	public static void main(String[] args) {
// Create a multi dim String array with 3 rows and 2 columns and Put 2 int Value in any of the cells of the table.
		
		int multi[][]=new int [3][2];
		
		multi [0][1]= 40;
		multi [2][0]= 50;
	
		
//1. Print all the value with for loop.
	
		System.out.println("------ans no 1--------");
		
		for (int a=0; a<multi.length; a++) {
			for(int b=0; b<multi[0].length; b++) {
				System.out.println(multi[a][b]);
			}
		}
		
//2.Find out the value which is in 1rst row , 2nd Column.
		
		System.out.println("------ans no 2--------");
		
		System.out.println(multi[0][1]);
		
//Find out the length of the rows and columns for this array and Print all the value of this array with For each Loop.

		System.out.println("------ans no 3--------");
		
		System.out.println(multi.length);
		System.out.println(multi[0].length);
		
		for (int rudra[]:multi) {
			for (int ayan: rudra) {
				System.out.println(ayan);
			}
		}
		
		
	}

}
