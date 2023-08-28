package Student_Muhsina;

public class Class28_Task_3 {

	public static void main(String[] args) {
		
//Create a String array without limiting the index length and put 5 String value there.
		
		String Grade[]= {"a","b","c","d","e"};
		
//1. Print all the value with for each loop
		
		for (String Subject_Grade: Grade) {
			System.out.println(Subject_Grade);
		}	
		System.out.println("----------------");
//2. Print the value of index number 2 and 3 individually.
		
		System.out.println(Grade[1]);
		System.out.println(Grade[2]);
		
		System.out.println("----------------");
//3. Print all the value from 1st index to last index with for loop.
		
		for (int x=0; x<=Grade.length-1; x++) {
			System.out.println(Grade[x]);
		}
		System.out.println("----------------");
//4. Print all the value from last index to first index
		
		for (int y=Grade.length-1; y>=0; y--) {
			System.out.println(Grade[y]);
		}	
		System.out.println("----------------");
//5. Print all the value 5th index to 2nd index.
		
		for (int z=4; z>=1; z--) {
			System.out.println(Grade[z]);
		}
	}
}
