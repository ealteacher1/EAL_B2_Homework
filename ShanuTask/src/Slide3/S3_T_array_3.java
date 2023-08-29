package Slide3;

public class S3_T_array_3 {

	public static void main(String[] args) {
	/*Array task 3-Create an String array without limiting the index length(Variable Name should 
		not be single Digit,it can be a name or anything but not a ,b, c ,d)  and Put 5 
	String Value there.*/
		 
//1.Print all the value with for each loop
		 
		String world[]= {"hi","hello","how","are","you",};
		for(String x:world) {
			System.out.println(x);
		}
//2.Print the value of index number 2and index 3 individually. (Be careful with the index 
//name.Index Name and Index number are not same.)
		
		System.out.println(world.length);
		System.out.println("the value of index number 2 = "+world[1]);
		System.out.println("the value of index number 3 = "+world[2]);
		
//3.○ Print all the value from 1rst index to last index with For loop 
		for(int i=0;i<=world.length-1;i++) {
			System.out.println(world[i]);
		}
//4.Print all the value from last Index (a.length-1) to first Index (Printing should be in reverse order
		for(int k=world.length-1;k>=0;k--) {
			System.out.println(world[k]);

		}
//5. Print all the value 5th index to 2nd index. 
		for(int j=4;j<=world.length-1;j--) {
			System.out.println(world[j]);
			if (j==1) {
				break;
			}
			
		}

	}

}
