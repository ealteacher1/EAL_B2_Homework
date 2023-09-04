package constructor_nsURMIN;

public class S63_T0 {
	//CHANGING THE PARAMETER YOU CAN CREATE DIFFERENT CONSTRUCTORS
	//TO CREATE A OBJECT YOU NEED CONSTRUCTOR 
	public  S63_T0(int x) {
		System.out.println("My first constructor");
	}
	public S63_T0 (double x) {
		System.out.println("My Second constructor");
	}
	
	public S63_T0(String name) {
		System.out.println("My third constructor");
	}
	public S63_T0(char x) {
		System.out.println("My fourth constructor");
		
	}
	public S63_T0(boolean num) {
		System.out.println("My fifth constructor");
	}

	public static void main(String[] args) {
		
		S63_T0 obj1= new S63_T0(10);
		S63_T0 obj2 = new S63_T0(0.1);
        S63_T0 obj3 = new S63_T0("Sun");
        S63_T0 obj4 = new S63_T0('A');
        S63_T0 obj5 = new S63_T0(true);
        
        
         
		
	}

}
