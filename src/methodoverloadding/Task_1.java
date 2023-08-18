package methodoverloadding;

public class Task_1 {

	public static void main(String[] args) {
		//1)Create 5 example of Calling by Object Reference/Class Variable
		int x = 100;
		String y = "Kevin";
        int c = 2000 ;
		String d = "Apple";
		String a = "large";
		
		Task_1 obj = new Task_1();
		obj.method1(x);// called by variable
		obj.method1(100);// called by value
		obj.method2(y);
		obj.method3(c);
		obj.method4(d);
		obj.method5(a);
		obj.method6(obj);// class variable
		obj.method7(obj);
		obj.method8(obj);
		obj.method9(obj);
		obj.method10(obj);
	}
	public void method1(int grades) {// you have to create an object in main method
		System.out.println("Student:" + grades);
	}
	
	 public void method2(String names) {
		 System.out.println("Student:" + names);
	 }
	 
	 public void method3(int salary) {
		 System.out.println("Student:" + salary);
     }
	 public void method4(String fruit) {
		 System.out.println("Student:" + fruit);
     }
	 public void method5(String size) {
	     System.out.println("Student:" + size);
	
	 }
	 public void method6(Task_1  salary ) {// by class type
		 System.out.println("Print :"  + salary);
		 
	 }
	 public void method7( Task_1 size) {
			System.out.println("Student:" + size);
	 }		
	 public void method8(Task_1 names) {
		 System.out.println("Student:" + names);
	 }
	 public void method9( Task_1 grades) {
			System.out.println("Student:" + grades);
		}
	 public void method10(Task_1 fruit) {
		 System.out.println("Student:" + fruit);
	 }
}