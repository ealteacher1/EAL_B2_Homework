package Slide5;

public class S5_T_1 {
	public static void main(String[] args) {

//Create 5 example of Calling by Object Reference/Class Variable

		int x = 20;// store by value
		String s = "Class variable";
		int y = 24;
		x = y;// store by variable
		S5_T_1 ob = new S5_T_1();
		System.out.println(20);// print by value
		System.out.println(s);// print by variable
		ob.Method2(new S5_T_1());
		ob.Method1(new S5_T_1());
		ob.Method3(new S5_T_1());
		ob.Method4(new S5_T_1());
		ob.Method5(new S5_T_1());

	}

	public static void Method1(S5_T_1 variable) {
		System.out.println("static method with public A/M");
	}

	public void Method2(S5_T_1 ob) {
		System.out.println("NS method with public AM");

	}

	public void Method3(S5_T_1 ref) {
		System.out.println("NS method with public AM");
	}

	public static void Method4(S5_T_1  ob) {
		System.out.println("static method with default A/M");
	}

	public void Method5(S5_T_1 ref) {
		System.out.println("NS method with default AM");
	}
}

