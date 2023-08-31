package class28_array;

public class Class28_Task_4 {

	public static void main(String[] args) {
		
//Create an int array without limiting the index length and put 5 int value there.
		
		int abc[]= {10,20,30,40,50};
		
		System.out.println("----------------");
		
//1. Print all the value with for each loop.
		
		for (int xyz: abc) {
			System.out.println(xyz);
		} 
		
		System.out.println("----------------");
//2. Find out the length of the array and print all the value from 1st index to last index with for loop
		
		System.out.println(abc.length);
		
		for (int a=0; a<=abc.length-1; a++) {
			System.out.println(abc[a]);
		}
		System.out.println("----------------");
//3. Print all the value from last index to 1st index.
		
		for (int i=abc.length-1; i>=0; i--) {
			System.out.println(abc[i]);
		}
		
		System.out.println("----------------");
//4. Print all the value 5ht index to 2nd index. 
		
		System.out.println(abc[4]);
		System.out.println(abc[1]);

	}

}
