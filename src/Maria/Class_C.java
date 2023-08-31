package Maria;

public class Class_C {

	public static void main(String[] args) {
		// Create another class Named “Class_C” . Create another public NS method ,Method name
		//should be CallingFromC inside that method,
		//Call all NS methods from CLass A . and prove that Return type methods are returnin something.


		
		Class_C Object=new Class_C();
		Object.callingfromc();
		
	}

	// no return type  // Method without arguments
	
	public void callingfromc() {
		System.out.println("call from Class A");
		
		
} 
}