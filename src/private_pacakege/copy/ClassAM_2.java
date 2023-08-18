package private_pacakege.copy;

import accessmodifier.com.Class_A;

public class ClassAM_2 {

	public static void main(String[] args) {
		   System.out.println("Calling methods from ClassAM_2:");
		   // Public methods from Class_A
	        Class_A.staticMethod1();  // Accessible because of Public modifier
	        Class_A.staticMethod2("NAME");
	        Class_A.staticMethod6(18);
	       
	        
	     // Non-static methods from Class_A
	        
	        Class_A obj = new Class_A();
	        obj.nonStaticMethod1();  //  default package 
	        obj.nonStaticMethod2(12);
	        obj.nonStaticMethod6("Car");
	       // boolean result = obj.nonStaticMethod4(true);//not accessible because it is protected modifier which can not travel to different package.
	     
	       
	    }
	
}

