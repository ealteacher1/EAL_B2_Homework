package constructor_nsURMIN;

public class S64_T5_Class_A {
	
public static void main(String[] args) {
	
	S64_T5_Class_A obj = new S64_T5_Class_A();
  
	obj.method1();
    obj.method2(42);
    
    int[][] array2D = obj.method3();
    for (int[] row : array2D) {
        for (int num : row) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    String[] array1D = obj.method4("Hello");
    for (String str : array1D) {
        System.out.println(str);
    }
    obj.method5();
    obj.method6(3.14);
   
    int[][] array2D_2 = obj.method7();
    for (int[] row : array2D_2) {
        for (int num : row) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    String[] array1D_2 = obj.method8("HAPPYLIFE");
    for (String str : array1D_2) {
        System.out.println(str);
    }
    obj.method9();
    obj.method10(true);
    
    int[][] array2D_3 = obj.method11();
    for (int[] row : array2D_3) {
        for (int num : row) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    String[] array1D_3 = obj.method12("Fruits");
    for (String str : array1D_3) {
        System.out.println(str);
    }
	
        
}
 
    // Method 1: No argument, no return
    public void method1() {
        System.out.println("Method 1 called without argument and return.");
    }

    // Method 2: With argument, no return
    public void method2(int num) {
        System.out.println("Method 2 called with argument: " + num + ", and no return.");
    }

    // Method 3: No argument, with return (2D array)
    public int[][] method3() {
        System.out.println("Method 3 called without argument and 2D array return.");
        int[][] array2D = {{1, 2, 3}, {4, 5, 6}};
        return array2D;
    }

    // Method 4: With argument, with return (1D array)
    public String[] method4(String str) {
        System.out.println("Method 4 is called : " + str + ", and  1D array return.");
        String[] array1D = {"Hello", "World"};
        return array1D;
    }

    // Method 5: No argument, no return
    public void method5() {
        System.out.println("Method 5 is called  and return.");
    }

    // Method 6: With argument, no return
    public void method6(double num) {
        System.out.println("Method 6 is called : " + num + ", and no return.");
    }

    // Method 7: No argument, with return (2D array)
    public int[][] method7() {
        System.out.println("Method 7 is called  and  2D array return.");
        int[][] array2D = {{7, 8, 9}, {10, 11, 12}};
        return array2D;
    }

    // Method 8: With argument, with return (1D array)
    public String[] method8(String str) {
        System.out.println("Method 8 is called : " + str + ", and 1D array return.");
        String[] array1D = {"HAPPY", "LIFE"};
        return array1D;
    }

    // Method 9: No argument, no return
    public void method9() {
        System.out.println("Method 9 is called  and return.");
    }

    // Method 10: With argument, no return
    public void method10(boolean flag) {
        System.out.println("Method 10 is called : " + flag + ", and no return.");
    }

    // Method 11: No argument, with return (2D array)
    public int[][] method11() {
        System.out.println("Method 11 is called  and  2D array return.");
        int[][] array2D = {{13, 14, 15}, {16, 17, 18}};
        return array2D;
    }

    // Method 12: With argument, with return (1D array)
    public String[] method12(String str) {
        System.out.println("Method 12 is called : " + str + ", and 1D array return.");
        String[] array1D = {"Apples", "Bananas"};
        return array1D;
    }

}

		

	


