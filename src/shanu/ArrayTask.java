package shanu;

public class ArrayTask {
	
	public static void main(String[]args) {
	
	 //Array task 2--------------
    
	
	 String Bird[] = new String[11];
	 Bird[0]="hi";
	 Bird[2]="hello";
	 Bird[5]="how are you";
	  
	  
	  //1.
	 System.out.println(Bird.length); 
	 for(String x:Bird) {
	  System.out.println(x); 
	  }
	  
	  //2.
	 System.out.println("print the value of array index 3= "+Bird[2]);
	 System.out.println("print the value of array index 5= "+Bird[4]);
	 //3.
	 for(int
	  k=0;k<=Bird.length-1;k++)
	 { System.out.println(Bird[k]);
	  
	 }
	 //4.
	 for(int s=Bird.length-1;s>=0;s--) {
		 System.out.println(Bird[s]);
	 }
	 //5.
	 for(int f=5;f<=Bird.length-1;f++) {
		 System.out.println(Bird[f]);
		 if(f==8) {
			 break;
			 
		 }
		 
	 }
	 //6.
	 for(int h=8;h<=Bird.length-1;h--) {
		 System.out.println(Bird[h]);
		 if(h==4) {
			 break;
		 }
	 }

	
	//Array task 3--------------
	 
	//1.
	 
	String world[]= {"hi","hello","how","are","you",};
	for(String x:world) {
		System.out.println(x);
	}
	//2.
	System.out.println(world.length);
	System.out.println("the value of index number 2 = "+world[1]);
	System.out.println("the value of index number 3 = "+world[2]);
	
	//3.
	for(int i=0;i<=world.length-1;i++) {
		System.out.println(world[i]);
	}
	//4.
	for(int k=world.length-1;k>=0;k--) {
		System.out.println(world[k]);

	}
	//5.
	for(int j=4;j<=world.length-1;j--) {
		System.out.println(world[j]);
		if (j==1) {
			break;
		}
		
	}
	//Array task 4------------------
	
	int value[]= {2,4,6,8,10,};
	//1.
		
		for(int a:value) {
			System.out.println(a);
		}
	//2.
		System.out.println("the length of array is "+value.length);
		for(int b=0;b<=value.length-1;b++) {
			System.out.println(value[b]);
		}
	//3.
		for(int c=value.length-1;c>=0;c--) {
			System.out.println(value[c]);
		}
	//4.
		for(int n=4;n<=value.length-1;n--) {
			System.out.println(value[n]);
			if(n==1) {
				break;
			}
			
		}
	//Array task 5------------------
		
		Object light[]=new Object[10];
		light[0]=12;
		light[4]="hello";
		light[7]="me";
		
		  //1. 
		System.out.println("the length of array is "+light.length);
		for(Object x:light) {
			System.out.println(x);
			}
		//2.
		  
		  System.out.println("the length of array is "+light.length); 
		  for(int o=0;o<=light.length-1;o++) { 
			  System.out.println(light[o]);
			  } 
		  //3.
		  System.out.println("the value of 2nd index is "+light[1]);
		  System.out.println("the value of 3rd index is "+light[2]);
		  
		 //4. 
		  for(int e=light.length-1;e>=0;e--)
		  { System.out.println(light[e]); }
		 
		//5.
		for(int s=4;s<=light.length-1;s++) {
			System.out.println(light[s]);
			if(s==7) {
				break;
			}
			
		}
		//6.
		for(int f=7;f<=light.length-1;f--) {
			System.out.println(light[f]);
			if(f==3) {
				break;
			}
			
		}
		//Array task 6
		Object put[]= {2,5,"hello",10,"yes",};
		
		//1.
		for(Object ob:put) {
			System.out.println(ob);
		}
		//2.
		System.out.println("the length of the array is "+put.length);
		for(int a=0;a<=put.length-1;a++) {
			System.out.println(put[a]);
		}
		//3.
		for(int b=put.length-1;b>=0;b--) {
			System.out.println(put[b]);
		}
		//4.
		System.out.println("the value of 2nd index is "+put[1]);
		System.out.println("the value of 3rd index is "+put[2]);
		
		//5.
		
		  for(int t=4;t<=put.length-1;t--) {
			  System.out.println(put[t]);
			  if(t==1) {
				  break;
				  }
		 }
		  
		  System.out.println("********************** Task 7 1 *********************");		  
		  
		//Array task 7
			int [][]dim=new int[4][5];
			dim[0][0]=100;
			for(int row=0;row<dim.length;row++) {
				for(int coloum=0;coloum<dim.length;coloum++) {
					System.out.println(dim[row][coloum]);
				}System.out.println(dim[0].length);//for coloumn
				System.out.println(dim[1].length);
				System.out.println(dim.length);//for row
				
			}
			System.out.println(dim[0][0]);
			
			
			  //1.
			Object multi[][]= {{2,3},{4,5}};
			System.out.println(multi);
	/*		for(Object[]x:multi) { 
				for(Object b:x) {
					System.out.println(b);
			
			  } 
				 System.out.println(multi[0][1]);
				  
			  }*/
			
	
			 
		//2.
			Object[][] prac= {{"hi",20},{"hello",52},{"you",21}};
			
			
	/*		for(Object []row:prac) {
				for(Object colomn:row) {
					System.out.println(colomn);
				}
			}System.out.println(prac.length);   */
			
			for (int row1=0;row1<prac.length;row1++) {
				for (int col1=0;col1<prac[0].length;col1++) {
					System.out.println(prac[row1][col1]);
				}
			}
		 
	}
	
}
	
	
