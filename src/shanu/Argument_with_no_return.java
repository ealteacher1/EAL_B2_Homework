package shanu;

public class Argument_with_no_return {
	int income;
	int expense;
	String nameOfMonth;
	public static void main(String[] args) {
		
	}

	public static void monthlyIncome(int income,int expense,String nameOfMonth) {
		int profit=income-expense;
		System.out.println("profit of the month "+profit+ nameOfMonth);
		
	}
}
