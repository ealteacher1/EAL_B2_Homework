package accessmodifier.com;



public class ClassAM_1 {

	//Create one class  ClassAM_1   in the same Package, and Create another Class   ClassAM_2 in a Different Package.
	public static void main(String[] args) {
		 System.out.println("Calling methods from ClassAM_1:");
		 
		  // Public methods from Class_A only Static
	        Class_A.staticMethod1();
	        Class_A.staticMethod2("kim");
	        Class_A.staticMethod4(2.0);
	        Class_A.staticMethod6(10);
	        
	        //non-Static from Class_A
	        Class_A obj = new Class_A();
	        obj.nonStaticMethod1();
	        obj.nonStaticMethod2(4);
	        obj.nonStaticMethod3();
	        obj.nonStaticMethod4(false);
	        obj.nonStaticMethod6("hello");
	        
	    }
	}


