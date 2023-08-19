package automationday1.copy;

public class MethodArg_nonreturn_slide35 {

	public static void main(String[] args) {
		
		//Create 5 Methods with different Data Type variables, Input Variables will be ( String, Char , Double, etc)  and Calculations inside them and Call them in Main method ( You can use , addition, Subtraction, If else , Print Statement etc ) 35
      monthlyincome(2000,2000,"January");
      alldays("Monday","Tuesday", "weeks" );
      grade(2.3,4.5,'C');
      fixed(5000,6000,"eachmonth");
      substactDoubles(12.5,10.5,"newvalue");
      
      
	}
    public static void monthlyincome() {
    	int job = 2000;
    	int business = 2000;
    	int totalincome = job + business;
    	System.out.println(totalincome);
    	}
    
    public static void monthlyincome(int job,int business, String nameofmonth) {
    	int totalincome =job + business;
    	System.out.println("Profit of income in month "+ nameofmonth + " = " + totalincome );
    	
    }// no 2 example
   
    public static void alldays() {
    	String a = "Monday";
    	String b = "Tuesday";
    	String totaldays = a+b;
    	System.out.println(totaldays);
    	
    }
   
    public static void alldays(String a, String b, String days ) {
    	String totaldays = a+b;
    	System.out.println("Days in the "  + days + "=" + totaldays);
    	
    	
    	
    	System.out.println("Print***************3rd ********");
       
    }// no 3 example
   
    public static void grade() {
    	double A = 2.3;
    	double B = 4.5;
    	double total = A+B;
    	System.out.println(total);
    	
    }
   
    public static void grade(double A, double B, double C) {
    	double total= A+B;
    	System.out.println("Print the value of  C " + "=" + total);
    }
    
    // EXAMPLE 4

    public static void fixed () {
    
    int rent = 5000;
    int expense = 6000;
    int spending = rent+ expense;
    
   System.out.println(spending);
    }
    public static void  fixed(int rent,int expense, String eachmonth ) {
    	
    	int spending = rent+expense;
    	System.out.println("Print the value of living cost " + eachmonth + " = " + spending);
    }
    
    //  example 5
    
    public static void subtractDoubles() {
    	double x = 12.5;
        double y = 10.5;
        
       double difference = x - y;
    	System.out.println(difference);
    }
   
    public static void substactDoubles(double x, double y, String newvalue) {
    	
    	double difference = x-y;
    	System.out.println("Print the  " + newvalue + " = " + difference);
    	
    }
    	
        
       
  }
