package automationday1.copy;

public class Methods_WA_Return_Slide47 {

	public static void main(String[] args) {
		//Create 5 Return type Methods which will return Different data type Values. Put different Different Data Type Input parameter and do some Calculations inside the method body ,Return a Value and Call the method from Main method ( You can use , addition, Subtraction, If else , Print Statement etc ) . And Prove that it is returning the Value ( By Printing the Calling method’s value , you can prove tha

	int sumResult = addition(5,10);
	System.out.println("SumResult: " + sumResult);
	
	double differenceResult = subtract(25,10);
	System.out.println("Diffrenceresult: " + differenceResult);
	
	boolean isGreaterResult = isGreater (15,8);
	System.out.println("Is Greater:" + isGreaterResult );
	
	String newString = concatenateStrings ("Hello","World");
	System.out.println("Print newString :" + newString);
	
	int divisionResult = divison(20,5);
	System.out.println("Print the Result:" + divisionResult);
	
	}
	
	
	
	public static int addition(int a, int b) {
		int sum = a+b;
		return sum;
		
	}
	public static double subtract(double x, double y) {
		double difference = x-y;
		return difference;
	}
	public static boolean isGreater(int num1, int num2) {
		if (num1 > num2) {
            return true;
        } else {
            return false;
        }
	}
		public static String concatenateStrings(String str1, String str2) {
	        return str1 + " " + str2;
	    }
    	
		 public static int divison(int x, int y) {
		        int result = (x / y) ;
		        return result;
		}
} 
		