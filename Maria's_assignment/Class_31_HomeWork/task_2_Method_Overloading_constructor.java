package Class_31_HomeWork;

public class task_2_Method_Overloading_constructor {

	public static void main(String[] args) {
		// 2. Overload a Class Constructor 10 times.
		//Create another Class ( Class s10t2) and Call all the overloaded Constructor There
		
		new task_2_Method_Overloading_constructor(900); 
		new task_2_Method_Overloading_constructor(600,5490);
		new task_2_Method_Overloading_constructor("maria");
		new task_2_Method_Overloading_constructor('k');
		new task_2_Method_Overloading_constructor(554.00);
		new task_2_Method_Overloading_constructor(1000.00);
		new task_2_Method_Overloading_constructor("ria,mimha");
		new task_2_Method_Overloading_constructor("tahseen"+3200);
		new task_2_Method_Overloading_constructor("method");
		new task_2_Method_Overloading_constructor();
	}

	public task_2_Method_Overloading_constructor(int a) {
		System.out.println(900);	
	}
	public task_2_Method_Overloading_constructor (int q,int b) {
	
		System.out.println("method 2");
	}
	public task_2_Method_Overloading_constructor(String c) {
		System.out.println("maria");
	}
	public task_2_Method_Overloading_constructor(char k) {
		System.out.println('k');
	}
	public task_2_Method_Overloading_constructor(double v) {
		System.out.println(554.00);
	}
	public task_2_Method_Overloading_constructor(float g) {
		System.out.println(1000.00);	
	}
	public task_2_Method_Overloading_constructor(String m,String n) {
		System.out.println("ria,mimha");	
	}
	public task_2_Method_Overloading_constructor(String p,int o) {
		System.out.println("tahseen"+ 3200);	
	}
	public task_2_Method_Overloading_constructor(int u, int y,int r) {
		System.out.println("method ");	
	}
	public task_2_Method_Overloading_constructor() {
		System.out.println();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
