package Student_Muhsina;

public class Class33_task_3_Child extends Class33_task_3_Parent {

	public static void main(String[] args) {
		

		Class33_task_3_Child ob= new Class33_task_3_Child();
		ob.addition();
		ob.substraction();
		ob.multiplication();
		

	}
	
	public void addition () {
		
		int x=10;
		int y=20;
		int a=x+y;
		System.out.println("the value of child class is "+ a);
		
		
	}
	
	public void substraction () {
		
		int x1=20;
		int y1=10;
		int a1=x1-y1;
		System.out.println("the value of the method is "+ a1);
	}
	
	public void multiplication() {
		
		int x2=5;
		int y2=10;
		int a2=x2*y2;
		
		System.out.println("the value of the multiplication is " + a2);
		
	}

}

