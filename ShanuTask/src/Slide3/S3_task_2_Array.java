package Slide3;

public class S3_task_2_Array {

	public static void main(String[] args) {
		 /*Array task 2--------------Create an String array with 11 index (Variable Name should not be single 
		Digit,it can be a name or anything but not a ,b, c ,d) and Put any value on 
	Index number 1 (ex: a[0]), index number 3 , and Index number 6.
	  */
		 String Bird[] = new String[11];
		 Bird[0]="hi";
		 Bird[2]="hello";
		 Bird[5]="how are you";
//1 Find out the length of the array and Print all the value with for each loop 

		 System.out.println(Bird.length); 
		 for(String x:Bird) {
		  System.out.println(x); 
		  }
		
		
		  
		  
		  
 //2.Print the value of index number 3 and index 5 individually.
		 
		 System.out.println("print the value of array index 3= "+Bird[2]);
		 System.out.println("print the value of array index 5= "+Bird[4]);
		 
 //3. Find out the length of the array and Print all the value from 1rst index to last index with For loop
		    
		 for(int
		  k=0;k<=Bird.length-1;k++)
		 { System.out.println(Bird[k]);
		  
		 }
//4.Print all the value from last Index (a.length-1) to first Index (Printing should be in reverse order)
		 for(int s=Bird.length-1;s>=0;s--) {
			 System.out.println(Bird[s]);
		 }
 //5.Print all the value 5th index to 8th index. 
		 for(int f=5;f<=Bird.length-1;f++) {
			 System.out.println(Bird[f]);
			 if(f==8) {
				 break;
				 
			 }
			 
		 }
//6.Print all the value from 8th Index to 4th index . 
		 for(int h=8;h<=Bird.length-1;h--) {
			 System.out.println(Bird[h]);
			 if(h==4) {
				 break;
			 }
		 }


	}

}
