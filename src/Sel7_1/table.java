package Sel7_1;

public class table {
	
	public static void main(String[] args) {

		Encapsulation ob= new Encapsulation();
		ob.waiter();
		
		table ob1= new table();
		ob1.a();
}
	public void a() {
		
		Sel8_4_Setget ob=new Sel8_4_Setget();
		ob.test1(50);
		
		int gvalue=ob.check();
		
		int salary= 2000+ gvalue;
		
		System.out.println(salary);
		
	}
	
	}
