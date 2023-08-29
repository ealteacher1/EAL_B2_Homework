package Slide3;

public class S3_T_array_6 {

	public static void main(String[] args) {
//Array task 6--Create an Object array without limiting the index length and Put 5 int Value 
//there.
		
		 Object put[]= {2,5,"hello",10,"yes",};
				
//1.Print all the value with for each loop 
				for(Object ob:put) {
					System.out.println(ob);
				}
//2.Find out the length of the array and Print all the value from 1rst index to last index with For loop
				System.out.println("the length of the array is "+put.length);
				for(int a=0;a<=put.length-1;a++) {
					System.out.println(put[a]);
				}
//3.Print all the value from last Index (a.length-1) to first Index (Printing should be in reverse order)
				for(int b=put.length-1;b>=0;b--) {
					System.out.println(put[b]);
				}
//4. Print the value of index number 2and index 3 individually. (Be careful with the index 
	//name.Index Name and Index number are not same.) 
				System.out.println("the value of 2nd index is "+put[1]);
				System.out.println("the value of 3rd index is "+put[2]);
				
//5. Print all the value 5th index to 2nd index.
				
				  for(int t=4;t<=put.length-1;t--) {
					  System.out.println(put[t]);
					  if(t==1) {
						  break;
						  }
				 }
				  

	}

}
