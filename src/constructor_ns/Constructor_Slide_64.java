package constructor_ns;

public class Constructor_Slide_64 {
	//CHANGING THE PARAMETER YOU CAN CREATE DIFFERENT CONSTRUCTORS
	//TO CREATE A OBJECT YOU NEED CONSTRUCTOR 
	public Constructor_Slide_64(int x) {
		System.out.println("My first constructor");
	}
	public Constructor_Slide_64 (double x) {
		System.out.println("My Second constructor");
	}
	
	public Constructor_Slide_64(String name) {
		System.out.println("My third constructor");
	}
	public Constructor_Slide_64(char x) {
		System.out.println("My fourth constructor");
		
	}
	public Constructor_Slide_64(boolean num) {
		System.out.println("My fifth constructor");
	}

	public static void main(String[] args) {
		
		Constructor_Slide_64 obj1= new Constructor_Slide_64(10);
		Constructor_Slide_64 obj2 = new Constructor_Slide_64(0.1);
        Constructor_Slide_64 obj3 = new Constructor_Slide_64("Sun");
        Constructor_Slide_64 obj4 = new Constructor_Slide_64('A');
        Constructor_Slide_64 obj5 = new Constructor_Slide_64(true);
        
         
		
	}

}
