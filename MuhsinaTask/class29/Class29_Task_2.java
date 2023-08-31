package class29;

public class Class29_Task_2 {

	public static void main(String[] args) {
		
		monthlyProfit(16000,2000,"January");
		monthlyProfit(18000,6000,"February");
		
	/* Create 5 Methods with different Data Type variables, Input Variables will be (String, Char , Double, etc) 
		 and Calculations inside them and Call them in Main method ( You can use , addition, Subtraction, If else,
		 Print Statement etc )*/
		
		welcome("I", " am ", "Muhsina");
		addition(22.44, 131.202);
		grade("Subarna ", 'A');
		grade("Banu ", 'B');

	}
	
	public static void monthlyProfit(int income, int expence, String nameOfTheMonth) {
		
		
		int profit= income-expence;
		
		System.out.println("The company profit for the month  of "+ nameOfTheMonth +" = "+profit);
		
	}
	
	public static void welcome (String H, String F, String B) {
		
		String hi= H + F + B;
		
		System.out.println(hi);
		
	}
	
	public static void addition(double x, double y) {
		
		double z= x+y;
		System.out.println(z);
	}
	
	public static void grade(String name, char grading) {
		
		String s= "The grade of the ";
		
		System.out.println(s+ name +"is "+ grading);
				
	}

}
