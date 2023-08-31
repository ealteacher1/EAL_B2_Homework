package Student_Muhsina;

public class Class33_task_3 {
	
	public static void main(String[] args) {
		
/*Create 5 Situations to Show Dynamic Polymorphism.(Compiler will say,method 
 is coming from one Class , But in real it will come from another Class) */
		
		Class33_task_3_Parent ob4= new Class33_task_3_Child ();
		ob4.addition();
		ob4.multiplication();
		ob4.substraction();
		
		Class33_task_3_GrandPrant ob5=new Class33_task_3_Parent();
		ob5.addition();
		ob5.multiplication();
		
		
	}
}
