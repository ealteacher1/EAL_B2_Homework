package Class_29_30_HomeWork;

public class Tesk_2_methodWithArgument_NonReturnType {

	public static void main(String[] args) {
		
		// Tasks 2 - Method With Arguments - Non Return type //
		
		// 1) Create 5 Methods with different Data Type variables, Input Variables will be (
		//String, Char , Double, etc) and Calculations inside them and Call them in
	//Main method ( You can use , addition, Subtraction, If else , Print Statement etc )
		tea("water","sugar","milk","teabag");
		blender("apple","orrange","sugar");
		monthlyprofit(12000,3000,"january");
		companyyearlyincome(99600.20,9900.30,"yearly income");
		
		employees("employees day and monthly income",150.00,5000.50);
		
	}

	// Tasks 2 - Method With Arguments - Non Return type //
	
	
	public static void tea(String water,String sugar,String milk,String teabag) {
		
		System.out.println("water+sugar+milk+teabag");
	}
	
	public static void blender(String apple,String orrange,String sugar) {
		System.out.println("apple+orrange+sugar");
	}
	
	
	public static void monthlyprofit(int income,int expense,String monthofprofit) {
		int profit=expense-income;
		System.out.println("profit of the month"+ "=" +profit);
	}
	
	
	public static void companyyearlyincome(double income, double expense,String yearlyincome) {
		double profit=income-expense;
		System.out.println("yearly profit "+ "="+income);
	}
	
	
	public static void employees(String employee,double day,double month) {
	double monthlyincome=day/month;
	System.out.println("employees day and monthly income"+ "=" + day+ month);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
