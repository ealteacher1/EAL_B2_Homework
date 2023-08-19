package constructor_nsURMIN;

public class S65_T6_Class_D {
	
   // call all the constructors from the same class to the main method
	public static void main(String[] args) {
		
		new S65_T6_Class_D();
		new S65_T6_Class_D(10);
		new S65_T6_Class_D(20,30);
		new S65_T6_Class_D("hello");
		new S65_T6_Class_D('A');
	
	Otherclass obj = new Otherclass();
	obj.callingConstructors();
	
	S65_T6_Class_E OBJ = new S65_T6_Class_E();
	OBJ.CallingFromE();
    }
	
	public S65_T6_Class_D() {
		System.out.println("Constructor 1 is called");
	}
	
	public S65_T6_Class_D(int x) {
		System.out.println("Constructor 2 is called");
	}
	
	public S65_T6_Class_D (int param1,int param2) {
		System.out.println("Constructor 3 is called");
	}
    public S65_T6_Class_D (String param3) {
    	System.out.println("Constructor 4 is called");
    }
    
    public S65_T6_Class_D (char a) {
    	System.out.println("Constructor 5 is called");
    }
    //create nonStatic methods for class E then call them in class E
 
    public void method1() {
        System.out.println("Non-static method 1 called.");
    }

    
    public void method2(int num) {
        System.out.println("Non-static method 2 called with parameter: " + num);
    }

   
    public void method3(String str) {
        System.out.println("Non-static method 3 called with parameter: " + str);
    }

	}

	
	
 

