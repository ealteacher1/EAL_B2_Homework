package automationday1.copy;

public class MultidimentionalArray {

	public static void main(String[] args) {
		
		Object [][]x=new Object [2][2];
		
		x [0][0]=1;
		x [0][1]=2;
		x [1][0]=3;
		x [1][1]=4;
		
		//print all value for loop
		
		for (int a=0; a<x.length; a++) {
			for(int b=0; b<x[0].length; b++) {
				System.out.println(x[a][b]);
			}
			// Find out the value which is in 1rst row , 2nd Column.
			
			Object row = x[0][1];
			System.out.println("Value at (1,2): " + row);//2
	    }
			
			//○Find out the length of the rows and columns for this array and Print all the value of this array with For Loop.
		
		
             
				System.out.println(x.length);//2
             System.out.println(x[0].length);//2
	
	

 // Print all the value of this array with For Loop.
	
	for (int i = 0; i < x.length; i++) {
        for (int j = 0; j < x[i].length; j++) {
            System.out.println("Value at (" + i + ", " + j + "): " + x[i][j]);
        }

	
	 }

}
}