package automationday1.copy;

public class Methods {

	public static void main(String[] args) {
		blender();
		blender2("Red apple", "Sweet orange");
		
		String juice = blender3(); // Juice= Green apple sweet orange 2
		
		System.out.println(juice);
		
		
		//person1
		String CoffeeforPerson1= blender4("Black coffee", "2 Spoon", "2 Cream");//main coffee //now return will water because return b=water
		
		System.out.println(CoffeeforPerson1);
		
		
		

	}
    // we cann't create a method inside another method
	//we can call one method from another method
	//Method must be created inside class
	
	// method without (non-return)
	
	public static void blender() {
		int x=10;
		int y=5;
		System.out.println(x-y);// console will show no results
		
	}
	//method with arguments (non-return types)
	
	public static void blender2(String Apple,String Orange) {
		
		System.out.println(Apple+Orange);
	}
	//Method without arguments return types- no input but will be output
	
	public static String blender3() {
		String apple ="Geen apple";
		String orange = "Sweet orange 2";
		
		String Juice =apple+orange;
		
		
		
		
		return Juice; //cannot write anything after return
		
	}
	
	// Method with arguments-Return type
	
	public static String blender4(String Coffee,String Sugar,String Milk ) {
	
	String mainCoffee=Coffee+Sugar+Milk;
	
	String b="water";
	
	return b;// you changed the main coffee to water  from making string b=water
	
    }
}