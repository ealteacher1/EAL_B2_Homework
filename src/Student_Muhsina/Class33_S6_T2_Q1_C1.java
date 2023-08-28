package Student_Muhsina;

public class Class33_S6_T2_Q1_C1 {
	
	int x=100;
	static String name="Hello";
	
	public static void main(String[] args) {
		
    /* Task 2:
 1. Create 3 Classes ( S6_T2_Q1_C1, S6_T2_Q1_C2, S6_T2_Q1_C3) and
    C3 will be Child of C2, And C2 will be the Child of C1, So C1 will be the GrandParent of C3
    Class. Create 3 own methods in each Class.

 a. Now create , Prove override is working from Grandparent (c1) to GrandChild(C3)
 b. Create Step by Step creation a global Variable Can be inherit as well.
 c. Create 2 overridden methods from parent Class and 3 Overridden methods From Child Class*/
 
		
		Class33_S6_T2_Q1_C1 ob= new Class33_S6_T2_Q1_C1();	
		ob.ns1();
		System.out.println("--------------");
		ob.ns2(0);
		System.out.println("----------------");
		ob.ns3(name);
		
	}
	
	public void ns1() {
		
		System.out.println(name+" I am Muhsina");
	}
	
	public void ns2 (int a) {
		
		x=20;
		a=30;
		System.out.println(a+x);
		
	}
	
	public void ns3 (String abc) {
		
		System.out.println("abc");
		
	}

}
