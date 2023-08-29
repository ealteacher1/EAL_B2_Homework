package Shahanaj;

public class S3_T_array_7 {

	public static void main(String[] args) {
	//Array task 7--Create a multi-dim Object array with 2 rows and 2 columns and Put 4 int 
		//Value in all cells of the table. 
		
		int [][]dim=new int[4][5];
		dim[0][0]=100;
		
		 //1. Print all the value with for loop.	
		for(int row=0;row<dim.length;row++) {
			for(int coloum=0;coloum<dim.length;coloum++) {
				System.out.println(dim[row][coloum]);
			}System.out.println(dim[0].length);//for coloumn
			System.out.println(dim[1].length);
			System.out.println(dim.length);//for row
			
		}
		System.out.println(dim[0][0]);
		
		System.out.println(dim[0].length);//for coloumn
		System.out.println(dim.length);//for row
		 
		Object multi[][]= {{2,3},{4,5}};
		System.out.println(multi);
/*		for(Object[]x:multi) { 
			for(Object b:x) {
				System.out.println(b);
		
		  } 
			 System.out.println(multi[0][1]);
			  
		  }*/
		

		 
	//2. Find out the value which is in 1st row , 2nd Column.
		
	 //3. Find out the length of the rows and columns for this array and Print all the value of this array 
		//with For Loop.
		Object[][] prac= {{"hi",20},{"hello",52},{"you",21}};
		
		
			for(Object []row:prac) {
					for(Object colomn:row) {
						System.out.println(colomn);
					}
				}System.out.println(prac.length);   
				
				for (int row1=0;row1<prac.length;row1++) {
					for (int col1=0;col1<prac[0].length;col1++) {
						System.out.println(prac[row1][col1]);
					}
				}
}

	}


