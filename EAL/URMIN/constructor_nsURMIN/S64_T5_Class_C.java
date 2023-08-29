package constructor_nsURMIN;



public class S64_T5_Class_C {

    public static void main(String[] args) {
    	 System.out.println("Calling methods from Class_C main:");
    	   S64_T5_Class_A obj = new  S64_T5_Class_A ();
    	    obj.method1();
    	    obj.method2(10);
    	    obj.method3();
    	    obj.method4("you");
    	    obj.method5();
    	    obj.method6(7.77);
    	    obj.method10(false);
    	    obj.method11();
    	    obj.method12("place");
    	    	
    	    
    	    int[][] array2D = obj.method7();
    	    for (int[] row : array2D) {
    	        for (int num : row) {
    	            System.out.print(num + " ");
    	        }
    	        System.out.println();
    	    }
    	    String[] array1D = obj.method8("Class_C");
    	    for (String str : array1D) {
    	        System.out.println(str);
    }
   
    }
    public static void callingFromC() {
    	 S64_T5_Class_A  obj = new  S64_T5_Class_A ();
    	
        int[][] array2D = obj.method11();
        for (int[] row : array2D) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        String[] array1D = obj.method12("CallingFromC");
        for (String str : array1D) {
            System.out.println(str);
        }
        
        
    }


}




    
	


	

	
	

