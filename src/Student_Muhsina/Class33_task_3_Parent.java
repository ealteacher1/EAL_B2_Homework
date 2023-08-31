package Student_Muhsina;

public class Class33_task_3_Parent extends Class33_task_3_GrandPrant {
	
	public static void main(String[] args) {
		
		Class33_task_3_Parent ob2= new Class33_task_3_Parent();
		ob2.addition();
		ob2.multiplication();
		ob2.substraction();

	}
	
public void addition () {
		
		int x=20;
		int y=30;
		int a=x+y;
		System.out.println("the value of parent class is "+ a);
		
		
	}
	
	public void substraction () {
		
		int x1=40;
		int y1=10;
		int a1=x1-y1;
		System.out.println("the value of the parent method is "+ a1);
	}
	
	public void multiplication() {
		
		int x2=6;
		int y2=10;
		int a2=x2*y2;
		
		System.out.println("the value of the parent class multiplication is " + a2);
		
	}

}
