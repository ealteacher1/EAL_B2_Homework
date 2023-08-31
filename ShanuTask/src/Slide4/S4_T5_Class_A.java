package Slide4;

public class S4_T5_Class_A {
	/*  Create a new class as Class_A  and  Create 3 Non-static method of Each 
type ( Total 12 NS method ) inside the new class.one method should return 2 
dimensional array and one method must return 1 dimensional array.
  a. Call all newly created methods from Main method of the same class and Prove that return 
types are returning values.
  b. Call all methods from the Main methods of Different class’s from the Same Package . 
  c. Create another class Named “Class_C” . Create another public NS method ,Method name 
should be CallingFromC inside that method,
 Call all NS methods from CLass A . and prove that Return type methods are returning 
something */

	public static void main(String[] args) {
		S4_T5_Class_A ob=new S4_T5_Class_A();
		ob.method1();
		ob.method2();
		ob.method3();
		ob.method4();
		ob.method5();
		ob.method6();
		ob.method7(67, 45);
		ob.method8("Aysha", "Bronx");
		ob.method9(ob, "Bronx");
		ob.method10(5000, 3000);
		ob.method11("hello", "hi");
		Object[][] ab=ob.method12(ob);
		for(Object[]a:ab) {
			for(Object x:a) {
				System.out.println(x);
			}
		}
	}
	 void method1() {
		System.out.println("method with no args/return");

}
	public void method2() {
		System.out.println("method with no args/return");

	}
	public void method3() {
		System.out.println("method with no args/return");

	}
	public String method4() {
		String s="non static ";
		return s;

	}
	public int method5() {
		int a=100;
		return a;

	}
	public boolean method6() {
		boolean b=true;
		return b;

	}
	public void method7(int x,int y) {
		int c=x-y;

	}
	public void method8(String s,String t) {
		String f=s+t;

	}
	public void method9(Object name,Object location) {
		Object[][]arry= {{"ay",10},{"dc",19}};
		System.out.println(name);
		System.out.println(location);
		for(Object []x:arry) {
			for(Object y:x) {
				System.out.println(y);
			}
		}

	}
	public int method10(int x,int y) {
		int c=x-y;
		return c;
	}
	public String method11(String s,String t) {
		String f=s+t;
		return f;
	}
	public Object[][] method12(Object name) {
		Object[][]arry= {{"ay",10},{"dc",19}};
		System.out.println(name);
		System.out.println(arry);
		return arry;
	}
}