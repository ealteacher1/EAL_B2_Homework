package automationday1.copy;

public class Methods_with_argument {

	public static void main(String[] args) {
		
      int result1 =sum(10,5);//you have to store it in a variable(result)
      System.out.println( "Print result1" + "=" +result1) ;
	
      boolean result2 = even(8);
      System.out.println(result2);
      
      double result3 =substract(10.5, 8.5);
      System.out.println( "Print result2" + "=" + result3) ;
      
      long result4 = multiplication( 200000l,300000l);
      System.out.println("Print result4"   +"=" + result4);
      
    		         
      String result5 = grade(55);
      System.out.println("Print result5"  + "=" + result5);
	
	}
	
	public static int sum(int a, int b ) {
		return (a+b);
	}
	
	public static boolean even(int num) {
		return num % 2 ==0;
		
	}
	public static double substract(double a1, double b1) {
		return a1-b1;
	}
	public static  long multiplication (long a, long b) {
		return (a * b);
	}
	
	public static String grade(int score) { 
		if (score>=90) {
			return "A";
		} else if (score>=60) {
			return "B";
		}else {
			return "F";
			
}
	}	
	
}

	
	
	

