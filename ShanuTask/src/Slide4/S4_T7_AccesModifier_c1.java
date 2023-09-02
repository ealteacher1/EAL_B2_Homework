package Slide4;

public class S4_T_7_AccesModifier_c1 {
	/*
	 * 1) Create a new Class and Create 1 Static and 2 Non static methods of Each
	 * type access modifier ( total 12 Methods ) 
	 * 2) Create one class ClassAM_1 in the same Package, and Create another Class ClassAM_2 in a Different Package.
	 * a) Show the Differences of Public, Private, protected and Default by call
	 * methods from the Different classes that we have created.
	 */

	public static void main(String[] args) {
		Method1();
		Method10();//Static method no need to create object to call
		Method4();//same class we can call by method name
		Method7();
		S4_T_7_AccesModifier_c1 ob= new S4_T_7_AccesModifier_c1();
		ob.Method2();//for NS we need to create object to call the method
		ob.Method3();
		ob.Method5();
		ob.Method6();
		ob.Method8();
		ob.Method9();
		ob.Method11();
		ob.Method12();
	
	
	}
	public static void Method1() {
		System.out.println("static method with public A/M");
	}
	public void Method2() {
		System.out.println("NS method with public AM");
		
	}
    public void Method3() {
    	System.out.println("NS method with public AM");
	}
    static void Method4() {
    	System.out.println("static method with default A/M");
}
      void Method5() {//default modifier no need to write
    	  System.out.println("NS method with default AM");
}
    void Method6() {
    	System.out.println("NS method with default AM");
}
   protected static void Method7() {
	   System.out.println("static method with protected A/M");
}

   protected void Method8() {
	   System.out.println("NS method with protected AM");
}
   protected void Method9() {
	   System.out.println("NS method with protected AM");
}
   private static void Method10() {
	   System.out.println("static method with private A/M");
}
   private void Method11() {
	   System.out.println("NS method with private AM");
}
   private void Method12() {
	   System.out.println("NS method with private AM");
}


}
