package Sel5_6;

public class Sel6_1_MethodCallingFromDiffMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is Main Method");
		
		String returnC= C(); //abc
		
		System.out.println(returnC);
	}
	
		public static void A() {
			
			System.out.println("Hi I Am A");
			
		}
		
		public static void B() {
			
			System.out.println("Hi, I am B");
			A();
			
		}
	
		public static String C() {
			System.out.println("Hi, I am C");
			B();
			
			return "abc";
		}
	}
	


