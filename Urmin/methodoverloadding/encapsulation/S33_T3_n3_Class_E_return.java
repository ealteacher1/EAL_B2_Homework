package methodoverloadding;

public class S33_T3_n3_Class_E_return {

	public static void main(String[] args) {
		//Create 3 private method which will be return type ( the method will return Class type value) 
		//,and call them from another Class. 33

		
	}
	private int method1() {
	    int x = 10;
		return x;
	}
		
	private String method2() {
		String y = " Java";
		return y;
	}
	
	private double method3() {
		double z = 2.5;
		return z;
	}
	
	public void callmethods() {
	  method1();
	  method2();
	  method3();
	
	  System.out.println(" print method 1");
	  System.out.println(" print method 2");
	  System.out.println(" print method 3");
}

}