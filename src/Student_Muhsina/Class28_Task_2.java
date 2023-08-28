package Student_Muhsina;

public class Class28_Task_2 {

	public static void main(String[] args) {
		
//Create a string array with 11 index and put any value on index number 1, index number 3 and index no 6.
		
		String maria[]= new String [11];
		
		maria[0]= "Hello";
		maria[2]= "How are you";
		maria[5]= "Nice to meet you";
			
		System.out.println("----------------");
		
// 1.Find out the length of the array and print all the value with for each loop.
		
		System.out.println(maria.length);
		
		for (String lubna: maria) {
		    System.out.println(lubna);
		}
		
		System.out.println("----------------");
		
//2. Print the value of index number 3 and index 5 individually.
		
		System.out.println(maria[2]);
		System.out.println(maria[4]);
		
		System.out.println("----------------");
//3. Find out the length of the array and print all the value from 1st index to last index with for loop.
		
		System.out.println(maria.length);
		
		for (int a=0; a<=maria.length-1; a++ ) {
			System.out.println(maria[a]);
		}
		
		System.out.println("----------------");
//4. Print all the value from last index (a.length-1) to first index. 
		
		for (int b=maria.length-1; b>=0; b--) {
			System.out.println(maria[b]);
		}
		
		System.out.println("----------------");
//5. Print all the value 5th index to 8th index.
		
		for (int c=4; c<=7; c++) {
			System.out.println(maria[c]);
		}
		
		System.out.println("----------------");
//6. Print all the value from 8th index to 4th index.
		
		for (int d=7; d>=3; d--) {
			System.out.println(maria[d]);
		}

	}

}
