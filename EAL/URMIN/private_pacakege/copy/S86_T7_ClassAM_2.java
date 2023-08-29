package private_pacakege.copy;

import accessmodifier.urmin.S86_T7_12Methods;

public class S86_T7_ClassAM_2 {

	public static void main(String[] args) {
		   System.out.println("Calling methods from ClassAM_2:");
		   // Public methods from Class_A
	        S86_T7_12Methods.staticMethod1();  // Accessible because of Public modifier
	        S86_T7_12Methods.staticMethod2("NAME");
	        S86_T7_12Methods.staticMethod6(18);
	       
	        
	     // Non-static methods from Class_A
	        
	        S86_T7_12Methods obj = new S86_T7_12Methods();
	        obj.nonStaticMethod1();  //  default package 
	        obj.nonStaticMethod2(12);
	        obj.nonStaticMethod6("Car");
	       // boolean result = obj.nonStaticMethod4(true);//not accessible because it is protected modifier which can not travel to different package.
	     
	       
	    }
	
}

