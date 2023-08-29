package Sardar_Rana_Homework;

public class Sel7_3MthodOverLoad {

	public static void main(String[] args) {
		
		Sel7_3MthodOverLoad ob =new Sel7_3MthodOverLoad();

		ob.a();
		ob.a(50);
		ob.a(null);
		ob.a(null, null);
	}
	
	public void a() {
		System.out.println("Method a");
	}

	public void a(int x) {
		System.out.println("method 2");
	}
	
	public void a(String x) {
		System.out.println("Third a");
	}
	
	public void a(String x, String y) {
		System.out.println("fourth a");
		
	}
}
