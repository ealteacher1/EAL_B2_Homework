package Slide5;

import Slide4.S4_T_7_AccesModifier_c1;

public class S4_T7_Class_AM_2 {

	public static void main(String[] args) {
		S4_T_7_AccesModifier_c1.Method1();//in the same package,different class we can call static
		//methods with public AM without object creation,with the class name
		System.out.println("static method");
		
		S4_T_7_AccesModifier_c1 ob= new S4_T_7_AccesModifier_c1();
		ob.Method2();//for NS we need to create object to call the method
		ob.Method3();
		
		//protected,default, private is not accessible in different package different class 
		
		//we can't call private,protected,default methods in different package

	}

}
