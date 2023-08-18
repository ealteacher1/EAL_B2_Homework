package automationday1.copy;

public class Methods_WA_Return_Slide47Task2 {

	public static void main(String[] args) {
		
		Object[] objectArr = ObjectArray("Apple", 5, true);
	       
        for (Object item : objectArr) {
         System.out.println(item);

	    }
     
        int[] intArr = IntArray(40);
        
        for (int num : intArr) {
        System.out.println(num);

	    }
      
        String[][] stringArr = StringArray("Hello", "World");
        
       
        for (String[] row : stringArr) {
        for (String item : row) {
         System.out.print(item);
         }
        

	    }
        
        Object[][] twoDimObjectArr = TwoDimObjectArray("Students", 20);
        
        for (Object[] row : twoDimObjectArr) {
        for (Object item : row) {

	        System.out.print(item);
       }
         
          }
	     }
      //Method that returns a 1-dimensional Object array

	  public static Object[] ObjectArray(String a, int b, boolean c) {
		
       Object[] arr = { a,b,c };
       return arr;

	}



	// Method that returns a 1-dimensional integer array

	 public static int[] IntArray(int num) {
		
      int[] arr = { 10, 20, 30 };
      return arr;

	}// Method that returns a 2-dimensional String array

	public static String[][] StringArray(String A, String B) {
		
     String[][] arr = { {A, B}, {"Java", "Programming"} };
      return arr;

	}



	// Method that returns a 2-dimensional Object array
     public static Object[][] TwoDimObjectArray(String x, int y) {
    	 
      Object[][] arr = { {"Alice", 25}, {"Bob", 30} };
      return arr;
	
		    
		
	}
	}

