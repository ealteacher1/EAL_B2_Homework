package Slide3;

public class S3_T_1array {

	public static void main(String[] args) {
		 
		//Array task 1---
				int apple[]= new int[10];
				apple[0]=10;
				apple[6]=18;
				apple[8]=20;
				
				
//1.Find out the length of the array and Print all the value with for each loop
				
				System.out.println("the length of index is "+apple.length);
				for(int x:apple) {
				  System.out.println(x); } 
//2. Find out the length of the array and Print all the value 
 //from 1st index to last index with For loop 
				 
				  for(int a=0;a<=apple.length-1;a++) {
				   System.out.println(apple[a]); 
				  
				  }
				 System.out.println(apple.length);
				 
//3. Print the value of index number 5 and index 7 individually. (Be careful
	//with the index name.Index Name and Index number are not same.) 
				 System.out.println("print the value of array index 5 = "+apple[4]);
				  System.out.println("print the value of array index 7= "+apple[6]);
				  
 //4.Find out the length of the array and Print all the value from last Index 
 //(a.length-1) to first Index (Printing should be in reverse order)
				  System.out.println(apple.length); 
				  for(int j=apple.length-1;j>=0;j--) {
				  System.out.println(apple[j]);
				  }
				 
//5. // Find out the length of the array and Print all the value 5th index to 8th index.
				
				  for(int i=4;i<=apple.length-1;i++) {
					  System.out.println(apple[i]);
					  if(i==7) {
					    break;
					   }
					 }
				 
//6.Find out the length of the array and Print all the value from 8th Index to 4th index . 
						
						  for(int d=7;d<=apple.length-1;d--) { 
							  System.out.println(apple[d]);
							  if(d==3){
								  break;
								  } 
						  }     
			}

		 

	}


