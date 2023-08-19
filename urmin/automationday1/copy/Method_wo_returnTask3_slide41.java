package automationday1.copy;

public class Method_wo_returnTask3_slide41 {

	public static void main(String[] args) {
		//Create 5 Return type Methods which will return Different data type Values. Create Different Data Type  and Calculations inside them and Call them in Main method ( You can use , addition, Subtraction, If else , Print Statement etc ) . And Prove that it is returning the Value ( By Printing the Calling method’s value , you can prove that) 2)Create 4 Return type Methods .4 DIfferent Methods will return (1 dim Object Array,1 dim Int array,2 Dim String Array, 2 Dim Object Array). And Prove that it is returning the Value ( By Printing the Calling method’s value , you can prove thatBut remember if it is , if it is returning an Array , You have to put the return value in an Array box. And you can prove it by printing with for Each loops/. For loops) – check next 2 example ss for reference41
		
		datatype();
		classtype();
		logictype();
		multiplication();
		division();
		
       
	      
        }
	
	public static int datatype () {
		int a = 10;
		int b = 5;
		int sum= a+b;
		System.out.println(sum);
	    return sum;
	}
	public static String classtype() {
		String S = " HELLO WORLD";
		String H = " 2023!";
		String classtype = S+H;
		System.out.println(classtype);
		return classtype;
	}
	public static boolean logictype() {
		int x = 0;
		if (x<7) {
			System.out.println("x<7 is true");
	}else {
		System.out.println("Print false");
		
		return false;
	}
		return false;
	}
	
	public static double multiplication() {
		double i =3.5;
		double j = 2.5;
		 double multiplication = i*j;
		System.out.println(multiplication);
		return multiplication;
		
	}
        public static int division() {
        	 int l=100;
         	 int m=10;
        	int division=l/m;
        	System.out.println(division);
        	return division;
        	
        }
	}
