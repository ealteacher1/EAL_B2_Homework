package Student_Muhsina;

public class Class28_Task_1 {

	public static void main(String[] args) {
		
//Create an integer with 10 index and put value on Index no 1, Index no 7 and Index no 9. 
		
		int muhsina []=new int[10];
		
		muhsina [0]=5;
		muhsina [6]=15;
		muhsina [8]=20;
		
		System.out.println("----------------");
		
//1.Find out the length of the array and print all the value with for each loop.
		
		System.out.println(muhsina.length);
		
		for ( int mobasshera: muhsina) {
			System.out.println(mobasshera);
		}
		
		System.out.println("----------------");
	
//2.Find out the length of the array and print all the value from 1st index with for loop.

		System.out.println(muhsina.length);
		
		for (int m=0; m<=muhsina.length-1; m++) {
			System.out.println(muhsina[m]);
		}	
	
		System.out.println("----------------");
//3.Print the value of index number 5 and index 7 individually.
		
		System.out.println(muhsina [4]);
		System.out.println(muhsina [6]);
		
		System.out.println("----------------");
		
//4.Find out the length of the array and print all the value from last index(a.length-1) to first index.
		
		System.out.println(muhsina.length);
		
		for (int b=muhsina.length-1; b>=0; b--) {
			
			System.out.println(muhsina[b]);
		}
		
		System.out.println("----------------");
		
//5.Find out the length of the array and print all the value 5ht index to 8th index.
		
		System.out.println(muhsina.length);
		
		for (int c=4; c<=7; c++) {
			
			System.out.println(muhsina[c]);
		}
		
		System.out.println("----------------");
		
//6.Find out the length of the array and print all the value from 8th index to 4th index. 
		
		System.out.println(muhsina.length);
		
		for (int d=8; d>=4; d--) {
			System.out.println(muhsina[d]);
		}
		
        
	}
	
}
