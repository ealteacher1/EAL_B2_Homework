package Sel7_1;

public class Sel7_3_MethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Compile time polymerphism / method overloading
		Sel7_3_MethodOverload ob = new Sel7_3_MethodOverload();
		ob.a();
		ob.a(5);
	}

	public static void a() {
		System.out.println("Method a");
		
	}
	
	public static void a(int x) {
		System.out.println("Method 2");
		
	}
	
	public static void a(int x, int y) {
		
	}
	
    public static void a(int x, String y) {
		
	}
}
