package constructor_nsURMIN;

import constructor_nsURMIN.S64_T5_Class_A;

public class S64_T5_Class_B {
	
	
  public static void main(String[] args) {
	  //Calling methods from Class_A main
	 
	  S64_T5_Class_A  obj = new  S64_T5_Class_A ();
	  obj.method1();
	  obj.method2(100);
	  obj.method3();
	  obj.method4("car");
	  obj.method5();
	  obj.method6(2.6);
	  obj.method11();
	  obj.method10(false);
	  obj.method12("NAME");
	  
	  
	  
	  int[][] array2D = obj.method3();
	 
	  for (int[] row : array2D) {
	      for (int num : row) {
	          System.out.print(num + " ");
	      }
	      System.out.println();
	  }
	  String[] array1D = obj.method4("Class_B");
	 
	  for (String str : array1D) {
	      System.out.println(str);
	}
  
  }
}




