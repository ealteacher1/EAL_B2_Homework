package shanu_homework;

public class S27_T_array_8 {

	public static void main(String[] args) {
		Object multi[][]= {{2,3},{4,5}};
		System.out.println(multi);
		for(Object[]x:multi) { 
			for(Object b:x) {
				System.out.println(b);
		
		  } 
			 System.out.println(multi[0][1]);
			  
		  }
		

		 
	//2.
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
