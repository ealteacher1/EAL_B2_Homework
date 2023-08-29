package Shahanaj;

public class S4_T_1_M_NA_NR {

	public static void main(String[] args) {
		//Create 5 Methods with different Datatype variables and Calulcations inside them and Call them in Main method ( You can use , addition, Subtraction, If else , Print Statement etc ) 23
	     Addition();
		 Multiplication();
		 welcome();
		 division();
		 expression();
		 method1();
	}
		
		public static void expression() {
			int a=100;
			int b=50;
			if(a>100) {
				System.out.println("the condition if true");
			}
			else {
				System.out.println("the condition is false");
			}
			
			if(a<b||a>b) {
				System.out.println("the statement called OR logic");
			}else if(a>b){
				System.out.println("that is match");
			}else {
				System.out.println("not match");
			}
			if(b%5==0) {
				System.out.println("its called reminder");
			}
			else if(a%10==0) {
				System.out.println("that is even no.");
			}
			else {
				System.out.println("everything right");
			}

	}
			public static void method1() {
				//Task for grading
						int Math=60;
						int Science=66;
						int Physics=48;
						int Biology =74;
					//Calculating grading
						int average=(Math+Science+Physics+Biology)/4;
						System.out.println(average);
					//task for statements
						if (average>=90 && average <=100) {
							System.out.println("Grade of student A");
						}else if(average>=80 && average <=89 ){
							System.out.println("Grade of student B");
						}else if (average >=70 && average<=79) {
							System.out.println("Grade of student C");
						}else if(average>=60 && average<=69) {
							System.out.println("Grade of student D");
						}else {
							System.out.println("Program is successfull");
						}
						
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

   public static void welcome() {
System.out.println("Wellcome to new lesoon!");
}

   public static void division() {
	int x = 100;
	int y = 5;
	int division = x/y;
	System.out.println(division);
}//method without arguments(no-return)
	private static void blender1() {
		int x=10;int d=3;
		System.out.println(x-d);


	}
}
