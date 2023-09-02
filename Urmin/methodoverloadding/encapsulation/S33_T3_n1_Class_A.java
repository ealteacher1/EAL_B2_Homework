package methodoverloadding;

public class S33_T3_n1_Class_A {

	public static void main(String[] args) {
		// Create a new Class(ex: class A) . Create 3 private methods there and put print statements inside those method and 
		//Call them from Another class (ex: call them from Class B)

		Slide75_age_salary obj = new Slide75_age_salary();
	
		obj.setAge(20);
		obj.setSalary(2000);
		
		
		System.out.println("Age");
		System.out.println("Salary");
		
		
	
	
	}
	private void code() {
		System.out.println("print private method 1");
	}
	
	private void payment() {
		System.out.println("print private mehtod 2");
	}
	
	private void interest() {
		System.out.println("print perivate method 3");
	}
	
	public void newcode() {
		code();
		payment();
		interest();
	}
	
	public void newpayment() {
		payment();
	
	}
	
	public void newrate() {
	interest();
	}
}

