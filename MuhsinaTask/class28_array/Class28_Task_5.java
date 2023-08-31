package class28_array;

public class Class28_Task_5 {

	public static void main(String[] args) {
		
/*Create an Object array with 10 index and Put any value on Index number 1 (ex: a[0]), 
 index number 5 , and Index number 8. */
		
		Object subarna []= new Object [10];
		
		subarna [0]="ayan";
		subarna [4]= 20;
		subarna [7]="mahmud";
		
		System.out.println("----------------");
//1.Find out the length of the array and Print all the value with for each loop
		
		System.out.println(subarna.length);
		
		for (Object tasmia: subarna) {
			System.out.println(tasmia);
		}	
		
		System.out.println("----------------");
//2.Find out the length of the array and Print all the value from 1st index to last index with For loop
		
		System.out.println(subarna.length);
	    
		for (int a=0; a<=subarna.length-1; a++) {
			System.out.println(subarna[a]);
		}
		System.out.println("----------------");
//3.Print the value of index number 2and index 3 individually. 
		
		System.out.println(subarna[1]);
		System.out.println(subarna[2]);
		
		System.out.println("----------------");
//4.Print all the value from last Index to first Index (Printing should be in reverse order)
		
		for (int b=subarna.length-1; b>=0; b--) {
			System.out.println(subarna[b]);
		}
		
		System.out.println("----------------");
//5.Print all the value 5th index to 8th index.
		
		for (int c=4; c<=7; c++) {
			System.out.println(subarna[c]);
		}
		System.out.println("----------------");
//6.Print all the value from 8th Index to 4th index .
		
		for (int d=8; d>=4; d--) {
			System.out.println(subarna[d]);
		}

	}

}
