package class28_array;

public class Class28_Task_6 {

	public static void main(String[] args) {
		
		
//Create an Object array without limiting the index length and Put 5 int Value there.
		
		Object mahir []= {20, 30, 40, 50, 60};
		
		System.out.println("----------------");
//1.Print all the value with for each loop
		
		for (Object tasin:mahir) {
			System.out.println(tasin);
		}
		System.out.println("----------------");
//2.Find out the length of the array and Print all the value from 1rst index to last index with For loop
		
		System.out.println(mahir.length);
		
		for (int x=0; x<=mahir.length-1; x++) {
			System.out.println(mahir[x]);
		}
		System.out.println("----------------");
		
//3.Print all the value from last Index (a.length-1) to first Index 
		
		for (int y=mahir.length-1; y>=0; y--) {
			System.out.println(mahir[y]);
		}
		System.out.println("----------------");


//4.Print the value of index number 2 and index 3 individually. 

         System.out.println(mahir[1]);
         System.out.println(mahir[2]);
         
         System.out.println("----------------");
//5.Print all the value 5th index to 2nd index.
         
         for (int z=4; z>=1; z--) {
        	 System.out.println(mahir[z]);
         }

	}

}
