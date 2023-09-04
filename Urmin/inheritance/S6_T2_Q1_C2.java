package inheritance;

public class S6_T2_Q1_C2 extends S6_T2_Q1_C1{
	
	
	@Override
	public void method1() {//override
	        System.out.println("Overridden Method 1 from C2");
	    }

	
	
	public void method2() {
        System.out.println("Method 2 from C2");
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(A);// GLOBAL VARIABLE IS INFERITTED FROM C1

	}

}
