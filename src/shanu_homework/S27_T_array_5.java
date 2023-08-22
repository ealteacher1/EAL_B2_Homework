package shanu_homework;

public class S27_T_array_5 {

	public static void main(String[] args) {
		/*Array task 5---Create an Object array with 10 index (Variable Name should not be single 
		Digit,it can be a name or anything but not a ,b, c ,d)  and Put any value on 
	Index number 1 (ex: a[0]), index number 5 , and Index number 8.---*/
		
				Object light[]=new Object[10];
				light[0]=12;
				light[4]="hello";
				light[7]="me";
				
 //1. Find out the length of the array and Print all the value with for each loop  
				System.out.println("the length of array is "+light.length);
				for(Object x:light) {
					System.out.println(x);
					}
//2.Find out the length of the array and Print all the value from 1rst index to last index with For loop 
				  
				  System.out.println("the length of array is "+light.length); 
				  for(int o=0;o<=light.length-1;o++) { 
					  System.out.println(light[o]);
					  } 
//3.○ Print the value of index number 2and index 3 individually. (Be careful with the index 
					//name.Index Name and Index number are not same.) 
				  
				  System.out.println("the value of 2nd index is "+light[1]);
				  System.out.println("the value of 3rd index is "+light[2]);
				  
//4.Print all the value from last Index to first Index (Printing should be in reverse order)
				  for(int e=light.length-1;e>=0;e--)
				  { System.out.println(light[e]); }
				 
//5. Print all the value 5th index to 8th index. 
				for(int s=4;s<=light.length-1;s++) {
					System.out.println(light[s]);
					if(s==7) {
						break;
					}
					
				}
//6.Print all the value from 8th Index to 4th index . 
				for(int f=7;f<=light.length-1;f--) {
					System.out.println(light[f]);
					if(f==3) {
						break;
					}
					
				}

	}

}
