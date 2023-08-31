package Slide4;

public class S4_T3_M_NA_WR {

	public static void main(String[] args) {
/* Create 5 Return type Methods which will return Different
 data type Values. Create Different Data Type  and Calculations 
inside them and Call them in Main method ( You can use , addition, Subtraction,
 If else , Print Statement etc ) . And Prove that it is returning the Value ( By Printing 
the Calling method’s value , you can prove that)*/
	
		datatype ();
		classtype();
		logictype();
		multiplication();
		division();
	}
	public static int datatype () {
		int a = 10;
		int b = 5;
		int c = a+b;
		System.out.println(c);
	    return c;
	}
	public static String classtype() {
		String S = " HELLO WORLD";
		String H = " 2023!";
		String J = S+H;
		System.out.println(J);
		return J;
	}
	public  static boolean logictype() {
		int x = 0;
		if (x<7) {//for loop it check condition first ,
			//if match then go inside the body
			//not check others
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
		double k = i*j;
		System.out.println(k);
		return k;
		
	}
        public static int division() {
        	 int l=100;
         	 int m=10;
        	int o=l/m;
        	System.out.println(o);
        	return o;
        }
       

      //method without arguments(with return)
    	public static String blender3() {
    		String apple="red apple ";
    		String orange="sweet orange ";
    		String juice=apple+orange;
    		System.out.println(juice);
    		return juice;

    	}
    	
	

}


