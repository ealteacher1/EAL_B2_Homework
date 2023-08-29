package Shahanaj;

public class S3_T_array_4 {

	public static void main(String[] args) {
		//Array task 4-----Create an int array without limiting the index length and Put 5 int Value there-------------
		
		int value[]= {2,4,6,8,10,};
		 
//1.Print all the value with for each loop 
			
			for(int a:value) {
				System.out.println(a);
			}
//2. Find out the length of the array and Print all the value from 1rst index to last index with For loop
			System.out.println("the length of array is "+value.length);
			for(int b=0;b<=value.length-1;b++) {
				System.out.println(value[b]);
			}
//3.Print all the value from last Index (a.length-1) to first Index (Printing should be in reverse order)
			for(int c=value.length-1;c>=0;c--) {
				System.out.println(value[c]);
			}
//4. Print all the value 5th index to 2nd index. 
			for(int n=4;n<=value.length-1;n--) {
				System.out.println(value[n]);
				if(n==1) {
					break;
				}
				
			}

	}

}
