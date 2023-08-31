package class29;

public class Class29_Task_4_1 {

	public static void main(String[] args) {
		
 /*Create 5 Return type Methods which will return Different data type Values. Put different Different 
	Data Type Input parameter and do some Calculations inside the method body,Return a Value and Call 
	the method from Main method ( You can use , addition, Subtraction, If else , Print Statement etc ).
	And Prove that it is returning the Value ( By Printing the Calling method’s value , 
	you can prove that)*/

		a(200, 300);
		System.out.println(a(200,300));
		System.out.println(a(400,500));
		
		b("tasmia","dhanmondi");
		System.out.println(b("mahir"," dhanmondi"));
		
		d(30.40,50.80);
		System.out.println(d(400.20005,200.40001));
	}
	
	public static int a(int x,int y) {
		
		int salary=x+y;
		return salary;

	}

	public static String b(String name, String address) {
		
		String information= name+address;
		return information;
	}
	
     public static double d(double One, double Two) {
		
		double total= One+ Two;
		return total;
}
}
