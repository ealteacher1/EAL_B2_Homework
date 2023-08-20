package My_Personal_Task;

public class T_1_Method5_With_Argument_Sarder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profit(1600, 700, "january");
		
		division(200, 5, "bird");
	}
	
   public static void Profit() {
		
	   int income = 16000;
	   int expense =7000;
	   int profit = income-expense;
}

   public static void Profit(int income, int expense, String nameofmonth) {
		

	    int profit = income-expense;
		
	    System.out.println("The profit of company of the month " + profit+ " "+ nameofmonth);
		
	}
	
   public static void division(int a, int b, String month) {
	   
	   int div = a/b;
	   
	   System.out.println("the division result is "+div+ " "+ month);
   }
   
}
