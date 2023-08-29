package Slide2;

public class S2_task {

	public static void main(String[] args) {
		
		//Create 5 Methods with different Datatype variables and Calulcations inside them and Call them in Main method ( You can use , addition, Subtraction, If else , Print Statement etc ) 23
         Addition();
		 Multiplication();
		 Icecream();
		 welcome();
		 division();
	}
  
	public static void Addition() {
		int a = 100;
		int b = 200;
		int addition = a+b;
		System.out.println(addition);
		}
	
	public static void Multiplication() {
	    int c = 30;
	    int d = 4;
	    int Multiplication = c*d;
	    System.out.println(Multiplication);
	    
	}
	
	public static void Icecream() {
		String  milk = "milk";
		String  sugar = "sugar";
		String Icecream = milk +"&" + sugar;
		System.out.println(Icecream);
		}
	public static void welcome() {
	System.out.println("Wellcome to new lesoon!");
	}
	
	public static void division() {
		int x = 100;
		int y = 5;
		int division = x/y;
		System.out.println(division);



	}

}
