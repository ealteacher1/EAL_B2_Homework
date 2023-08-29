package urmin;

public class S41_MethodT3_NO_2 {
	
	//Create 4 Return type Methods .4 DIfferent Methods will return (1 dim Object Array,1 dim Int array,2 Dim String Array, 2 Dim Object Array). And Prove that it is returning the Value ( By Printing the Calling method’s value , you can prove thatBut remember if it is , if it is returning an Array , You have to put the return value in an Array box. And you can prove it by printing with for Each loops/. For loops) – check next 2 example ss for reference41


	public static void main(String[] args) {
		Object[] objectArr = returnObjectArray();
	   
		System.out.println("Returned Object array:");
	    
	    for (Object item : objectArr) {
	        System.out.println(item);
	    }

	    int[] intArr = returnIntArray();
	  
	    System.out.println("Returned int array:");
	   
	    for (int num : intArr) {
	        System.out.println(num);
	    }

	    String[][] stringArr = returnStringArray();
	  
	    System.out.println("Returned String array:");
	    
	    for (String[] row : stringArr) {
	        for (String item : row) {
	            System.out.print(item + " ");
	        }
	        System.out.println();
	    }

	    Object[][] twoDimObjectArr = returnTwoDimObjectArray();
	  
	    System.out.println("Returned 2D Object array:");
	    
	    for (Object[] row : twoDimObjectArr) {
	        for (Object item : row) {
	            System.out.print(item + " ");
	        }
	        System.out.println();
	    }
	}
	
	
		

	

	//Method that returns a 1-dimensional Object array
	public static Object[] returnObjectArray() {// an array will always return an array
	    Object[] arr = { "Apple", 5, true };
	    return arr;
	}

	// Method that returns a 1-dimensional integer array
	public static int[] returnIntArray() {
	    int[] arr = { 10, 20, 30 };
	    return arr;
	}

	// Method that returns a 2-dimensional String array
	public static String[][] returnStringArray() {
	    String[][] arr = { {"Hello", "World"}, {"Java", "Programming"} };
	    return arr;
	}

	// Method that returns a 2-dimensional Object array
	public static Object[][] returnTwoDimObjectArray() {
	    Object[][] arr = { {"Nuni", 25}, {"Babu", 30} };
	    return arr;
	    
	}
}
