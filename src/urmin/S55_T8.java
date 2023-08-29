package urmin;

public class S55_T8 {

	public static void main(String[] args) {
		
		String [][]Array= new String[3][2];
		
		//Put 2 int Value in any of the cells of the table. 
		Array[0][1]="42";
		Array[2][1]="123";
		
		
		//Find out the value which is in 1rst row , 2nd Column
		String row = Array[0][1];
		System.out.println("Value  : " + row);
		
		//Find out the length of the rows and columns for this array
		
		System.out.println(Array.length);// rows =3
        System.out.println(Array[0].length);// columns 2

       // Print all the value of this array with For Loop.
       
        for(int i=0; i<Array.length; i++) {
        	
        	for(int j=0; j<Array[i].length; j++) {
        		
        		System.out.println("Print the value of (" + i + "," + j + ") : " + Array[i][j]);
        		
        	}
        }
        
		
		
	}



	
		
	
}
