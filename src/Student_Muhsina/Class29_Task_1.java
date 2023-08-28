package Student_Muhsina;

public class Class29_Task_1 {

	public static void main(String[] args) {	
		
	/*Create 5 Methods with different Data type variables and Calulcations inside them and 
	 Call them in Main method ( You can use , addition, Subtraction, If else , Print Statement etc )*/
		
		
		
		Substraction();
		Addition();
		If_else();
		rudra();
		multiplication();

	}
	
	public static void Substraction() {
		
		System.out.println("-------ans 1-------");
		
		int a=10;
		int b=25;
		int y=b-a;
		
		
		
		System.out.println(y);	
		
		System.out.println("-------ans 2-------");
	}

	
	public static void Addition() {
		
		String x= "Hello ";
		String z="Bangladesh";
		String xz= x+z;		
		
		System.out.println(xz);
		
		System.out.println("-------ans 3-------");			
	}
	
	
    public static void If_else() {
		
		int ab = 7;
		
		if (ab>7) {
			System.out.println("The value of ab is not 7");}
		
		else {System.out.println("The value of ab is 7");}
		 
		System.out.println("-------ans 4-------");	
		}
		
	public static void rudra() {
    
        boolean h=true;
		
		int ayan=100;
		int mahmud=200;
		
		if (ayan<mahmud) {
			System.out.println(h);
			
		}
		System.out.println("-------ans 5-------");	
	}
	
	public static void multiplication() {
		
		int mm=60;
		int jj=40;
		int oo=mm*jj;
		
		System.out.println(oo);
	}
}

