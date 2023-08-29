package accessmodifier.urmin;



public class S86_T7_ClassAM_1 {

	//Create one class  ClassAM_1   in the same Package, and Create another Class   ClassAM_2 in a Different Package.
	public static void main(String[] args) {
		 System.out.println("Calling methods from ClassAM_1:");
		 
		  // Public methods from Class_A only Static
	        S86_T7_12Methods.staticMethod1();
	        S86_T7_12Methods.staticMethod2("kim");
	        S86_T7_12Methods.staticMethod4(2.0);
	        S86_T7_12Methods.staticMethod6(10);
	        
	        //non-Static from Class_A
	        S86_T7_12Methods obj = new S86_T7_12Methods();
	        obj.nonStaticMethod1();
	        obj.nonStaticMethod2(4);
	        obj.nonStaticMethod3();
	        obj.nonStaticMethod4(false);
	        obj.nonStaticMethod6("hello");
	        
	    }
	}


