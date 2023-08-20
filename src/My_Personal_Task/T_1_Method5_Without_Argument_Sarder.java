package My_Personal_Task;

public class T_1_Method5_Without_Argument_Sarder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		T_1_Method5_Without_Argument_Sarder ob1 = new T_1_Method5_Without_Argument_Sarder	();
				ob1.family();
				
		Addition();
			
		ob1.substract();
		
		Division();
		
		ob1.Multification();
	}
	
	public void family() {
		
		String a = "Sarder";
		String b = "Ahmed";
		
		System.out.print("My Full name is ");
		System.out.println(a +" "+b);
	}
	
	public static void Addition() {
		
		int c=1000;
		int d=1500;
		int add =c+d;
		
		System.out.println("*******ADDITION********");
		
		System.out.println(add);
	}
	
	public void substract() {
		
		int e=500;
		int f=69;
		int sub = e-f;
		
		System.out.println("*******Subtract********");
		System.out.println(sub);
		
		}
	
	public static void Division() {
		
		int g=100;
		int h= 20;
		int div = g/h;
		
		System.out.println("*******Division********");
		System.out.println(div);

	}

	public void Multification() {
		
		int i = 65;
		int j = 3;
		int mult= i*j;
		
		System.out.println("*******Multification********");

		System.out.println(mult);
	}
	
}
