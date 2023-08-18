package constructor_ns;

public class Class_C {

    public static void main(String[] args) {
    	 System.out.println("Calling methods from Class_C main:");
    	    Class_A obj = new Class_A();
    	    obj.method5();
    	    obj.method6(7.77);
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
        System.out.println("Calling methods from Class_C's CallingFromC:");
        Class_A obj = new Class_A();
        obj.method9();
        obj.method10(false);
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


	

	
	

