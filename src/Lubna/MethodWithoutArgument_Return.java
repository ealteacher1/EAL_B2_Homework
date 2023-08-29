package Lubna;

public class MethodWithoutArgument_Return {

	public static void main(String[] args) {
		
		
		
		MethodWithoutArgument_Return m = new MethodWithoutArgument_Return();

		//for calling logictype(), you have to create 
		//object/reference of the class,because this 
		//method not static
		m.logictype();
		division();//others you have to call them in main method area for return
		multiplication();
		
	

   

	
	

//Tasks 3 - Method Without Arguments - Return type
		//1) Create 5 Return type Methods which will return Different data type Values. Create 
		//Different Data Type and Calculations inside them and Call them in Main method ( 
		//You can use , addition, Subtraction, If else , Print Statement etc ) . And Prove that it 
		//is returning the Value ( By Printing the Calling method�s value , you can prove that) 

	
        int a = 10;
        int b =5;
        int c = a+b;
        System.out.println(c);
	
        
        String s = "Hello World";
        String h = "2023";
		String j = s+h;
		System.out.println(j);
		
		int x = 0;
		if (x<7) {
			System.out.println("x<7 is true");
		}else {
			System.out.println("print false");
			
			double i = 3.5;
			double g = 2.5;
			double k = i*g;
			System.out.println(k);
			
			int l = 100;
			int e = 10;
			int o = l/e;
			System.out.println(0);
			
		}
	} 
	
	public int datatype() {
		int a = 10;
		int b = 5;
		int c = a+b;
		System.out.println(c);
		return c;
		
		
	}
	 public String classtype() {
		 String s = "Hello world";
		 String h = "2023";
		 String j = s+h;
		 System.out.println(j);
		 return j;
	 }
	 
	 public boolean logictype() {
		 int x = 0;
		 if (x<7) {
			 System.out.println("x<7 is true");
		 }else {
			 System.out.println("print false");
			 return false;
		 }
		 return false;
	 }
	 public static double multiplication() {
		 double i = 3.5;
		 double g = 2.5;
		 double k = i*g;
		 System.out.println(k);
		 return k;
		 
	 }
	 
	 public static int division() {
		 int l = 100;
		 int e = 10;
		 int o = l/e;
		 System.out.println(o);
		 return o;
	 }
	}

