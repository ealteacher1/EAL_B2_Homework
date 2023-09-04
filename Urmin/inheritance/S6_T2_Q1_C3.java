package inheritance;

public class S6_T2_Q1_C3 extends S6_T2_Q1_C2 {

	@Override
	public void method1() {//override
        System.out.println("Method 1 from C3");
    }
	
	
	@Override
	public void method2() {//override
        System.out.println("Method 2 from C2");
	}
	
	
	public void method3() {
        System.out.println("Method 3 from C3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(A);// GLOBAL VARIABLE IS INFERITTED FROM C1
	}

}
