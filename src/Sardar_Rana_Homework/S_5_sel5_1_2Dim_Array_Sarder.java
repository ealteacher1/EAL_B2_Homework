package Sardar_Rana_Homework;

public class S_5_sel5_1_2Dim_Array_Sarder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[][]= new int [2][3];
		x[1][1]=5000;
		
		//how many rows are there?
		System.out.println(x.length);
		
		//How many columns are there?
		System.out.println(x[0].length);
		System.out.println(x[1].length);
		
		System.out.println("************LOOPING RESULT*************" );
		
		for(int row=0; row <x.length; row++ ) {
			
			for(int column=0; column<x[0].length; column++) {
				System.out.println(x[row][column]);
		} 
			
		
	}
		
		//2 Dim array: 2nd way
		System.out.println("********** 2 dim array part 2********");
		
		int b[]= {1,3,4,5}; //one dim
		
		Object[][] login = {{"abc@gmail.com",12345, "z"}, {"ssad@gmail.com", 235646}};
		
		//row length
		System.out.println(login.length);
		//column length
		System.out.println(login[0].length);
		
		System.out.println("********** Loop Ans********");

		
		for (Object[] a: login) {
			for (Object value:a) {
				System.out.println(value);
			}
		}
		}

}