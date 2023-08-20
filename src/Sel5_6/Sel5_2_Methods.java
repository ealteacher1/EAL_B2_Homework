package Sel5_6;

public class Sel5_2_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		blender1();
		blender2("Red Apple", " Sweet Orange");
		blender3();
		
		String Juice= blender3();
		System.out.println(Juice);
		
		//person 1:
		String CoffeeForPerson1= blender4("Black coffee"," 2 Spoon Sugar", "2 Creams" ); //Water (String)
		System.out.println(CoffeeForPerson1);
	}

	// We cant Create Method inside another method
	// We can call one method from another
	// Method must be created inside the class
	
	
	//Method withoiut argument (non-return)
	
	public static void blender1() {
		int x=10;
		int y=5;
		
		System.out.println(x-y);
	}
	
	//Method with Argument
	
	public static void blender2(String Apple, String Orange) {
		System.out.println(Apple+Orange);
		
	}
	
	//Method Without Argument (Return Type):-- no input but we will get output
	
	public static String blender3() {
		
		String apple = "green apple 2";
		String orange = "sweet orange 2";
		String Juice = apple+orange;
		
		//System.out.println(Juice);
		
		return Juice;
		
	}
	
	
	//Method with argument - Return type ---- both input and output
	public static String blender4(String coffee, String sugar, String milk) {
		
		String MainCoffee= coffee+sugar+milk;
		String b = "water";
		
		return b;
	}
}
