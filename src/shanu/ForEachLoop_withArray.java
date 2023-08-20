package shanu;

public class ForEachLoop_withArray {
	public static void main (String[]args) {
		//Array task 1---
		int apple[]= new int[10];
		apple[0]=10;
		apple[6]=18;
		apple[8]=20;
		
		
	//1. 
		System.out.println("the length of index is "+apple.length);
		for(int x:apple) {
		  System.out.println(x); } 
	//2.
		 
		  for(int a=0;a<=apple.length-1;a++) {
		   System.out.println(apple[a]); 
		  
		  }
		 System.out.println(apple.length);
		 
    //3. 
		 System.out.println("print the value of array index 5 = "+apple[4]);
		  System.out.println("print the value of array index 7= "+apple[6]);
		  
	 //4. 
		  System.out.println(apple.length); 
		  for(int j=apple.length-1;j>=0;j--) {
		  System.out.println(apple[j]);
		  }
		 
	//5.
		
		  for(int i=4;i<=apple.length-1;i++) {
			  System.out.println(apple[i]);
			  if(i==7) {
			    break;
			   }
			 }
		 
      //6.
				
				  for(int d=7;d<=apple.length-1;d--) { 
					  System.out.println(apple[d]);
					  if(d==3){
						  break;
						  } 
				  }     
	}

}
