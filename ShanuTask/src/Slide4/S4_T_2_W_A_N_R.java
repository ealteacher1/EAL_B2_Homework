package Slide4;

public class S4_T_2_W_A_N_R {
	/*
 Create 5 Methods with different Data Type variables, Input
 Variables will be (String, Char , Double, etc)  and Calculations 
inside them and Call them in Main method( You can use , addition, 
Subtraction, If else , Print Statement etc ) */
	int a = 10;
	int b = 5;

	public static void main(String[] args) {
		S4_T_2_W_A_N_R ob= new S4_T_2_W_A_N_R();
		ob.m1("2023");
		ob.m2(20, 30);
		ob.m3(10, 2.6);
		ob.m4("different data type", 10);
		ob.m5(30, 15);
	}
	
//method with arguments(with no-return)
	public void m1(String s) {
		String t="Hello";
		String n=t+s;
		System.out.println(n);
		
		
	}public void m2(int a,int b ){
		int c=(a+b);
		System.out.println(c);
		
	}public void m3(int x,double y) {
		 double i =3.5;
		  double j = 2.5;
		  double k = (i*j)+x+y;
		  System.out.println(k);
		
	}public void m4(String h,int y) {
		String o="orange";
		String l=h+o+y;
		System.out.println(l);
	}
	public void m5(int x,int y) {
		int e=190;
		int k=e-(x-y);
		System.out.println(k);
	}
}