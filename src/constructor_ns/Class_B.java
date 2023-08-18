package constructor_ns;

public class Class_B {
	
	
  public static void main(String[] args) {
	  System.out.println("Calling methods from Class_B main:");
	  Class_A obj = new Class_A();
	  obj.method1();
	  obj.method2(100);
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




