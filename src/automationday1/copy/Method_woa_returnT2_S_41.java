package automationday1.copy;

public class Method_woa_returnT2_S_41 {

	public static void main(String[] args) {
		
		Object[] objectArr = ObjectArray();
       
        for (Object item : objectArr) {
         System.out.println(item);

	    }
     
        int[] intArr = IntArray();
        
        for (int num : intArr) {
        System.out.println(num);

	    }
      
        String[][] stringArr = StringArray();
        
       
        for (String[] row : stringArr) {
        for (String item : row) {
         System.out.print(item + " ");
         }
          System.out.println();

	    }
        
        Object[][] twoDimObjectArr = TwoDimObjectArray();
        
        for (Object[] row : twoDimObjectArr) {
        for (Object item : row) {

	        System.out.print(item + " ");
       }
          System.out.println();
          }
	     }
      //Method that returns a 1-dimensional Object array

	  public static Object[] ObjectArray() {
       Object[] arr = { "Apple", 5, true };
       return arr;

	}



	// Method that returns a 1-dimensional integer array

	 public static int[] IntArray() {
      int[] arr = { 10, 20, 30 };
      return arr;

	}// Method that returns a 2-dimensional String array

	public static String[][] StringArray() {
     String[][] arr = { {"Hello", "World"}, {"Java", "Programming"} };
      return arr;

	}



	// Method that returns a 2-dimensional Object array
     public static Object[][] TwoDimObjectArray() {
      Object[][] arr = { {"Alice", 25}, {"Bob", 30} };
      return arr;

	}


}
	

