package Sardar_Rana_Homework;

public class S_6_Sel6_2_NSmethods_Sarder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		S_6_Sel6_2_NSmethods_Sarder object1 = new S_6_Sel6_2_NSmethods_Sarder();
		object1.nsblender1();
		
		/*
		 * Object[][] returnfromb4=nsblender4( 100, "StudentTable"); //full table - 2 dim
		 * ---- object
		 * 
		 * System.out.println("******* array print*******");
		 * 
		 * for(Object[] onedimarray: returnfromb4) { 
		 * for(Object singlebox: onedimarray)
		 * {
		 * 
		 * System.out.println(singlebox); } }
		 */
	}
	
	//No Return Type
	//1) Method without Arguments
	
	public void nsblender1() {
		System.out.println("nsblender 1 method");
		
		nsblender2("abc");
	}
	
	//2) Method with Arguments:
	public void nsblender2(String abc) {
		System.out.println("nsblender 2 method");
		
	}
	
	//Return type:
	//3) Method without Arguments:
	public int nsblender3() {
		System.out.println("nsblender 3");
		int a=10;
		return a; //return by direct value
	}
	
	
	//4) method with Arguments:
	public static Object[][] nsblender4(int x, String y){
		System.out.println("blender 4 is returning array " + y);
		
		Object[][] studentlist = {{"Sunny",26},{"Maria", 29}, {"Sarder",15},{"Muhsina", 25}};
		
		return studentlist;
	}
	
	//NS methods from same class, can be called by another ns method/
	//For calling NS methods in any Static methods or outside of the class, we have to create object.
	// when we create all the NS methods + NS Global Variables are given to that class.
	// From the object itself, You can see Static Methods.
}
