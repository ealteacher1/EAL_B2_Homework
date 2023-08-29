package Class_32_HomeWork;

public class S32_T4 {

	    int a= 15400;
	    double b= 300.14;
	    String  c= "Hello everyone";
	    boolean  d= true;
	    char e= 'A';

	
	
	public static void main(String[] args) {
		
		// ) Create 5 Non Static Global Variable(different Data Type) with value , and change
		//their value in a Static method,in the same class

		S32_T4 ob=new S32_T4 ();
		ob.test();
		
		

		S32_T4 ob1=new S32_T4 ();
		ob1.test1();
		
		S32_T4 ob2=new S32_T4 ();
		ob2.test2();
    
		S32_T4 ob3=new S32_T4 ();
		ob3.test3();
    	
		S32_T4 ob4=new S32_T4 ();
		ob4.test4();
		
		
		S32_T4_N2.rim2();
		S32_T4_N2.rim();
    }
	
	public static void test() {
		S32_T4 ob=new S32_T4 ();

		System.out.println("value "+ ob.a);
	}
	
	public static void test1() {
		S32_T4 ob1=new S32_T4 ();
    System.out.println("value "+ ob1.b);
	}
	
	public static void test2() {
		S32_T4 ob2=new S32_T4 ();
    System.out.println("value "+ ob2.c);
	}
	
	public static void test3() {
		S32_T4 ob3=new S32_T4 ();
    System.out.println("value "+ ob3.d);
	}
	
	public static void test4() {
		S32_T4 ob4=new S32_T4 ();
    System.out.println("value "+ ob4.e);
	}
	
	
}
