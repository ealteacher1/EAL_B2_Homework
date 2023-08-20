package Lubna;

public class MethodExample{

	public static void main(String[] args) {
		
		lubna();
		hello();
		
	ProfitOfCompany();	
	checkNumber(0);
	elaclass();

 
		
	}

		// Tasks 1 - Method Without Arguments - Non Return type
	// Create 5 Methods with different Datatype variables and Calulcations inside 
	//them and Call them in Main method ( You can use , addition, Subtraction, If 
	//else , Print Statement etc )
		

	

	      public static void ProfitOfCompany()  {
			
             int income = 2000 ;
             int expense = 4000;
             int profit = income - expense;

			System.out.println(profit);
            

	}
      
    public static void lubna() {
    	int a = 500;
    	int b = 600;
    	int total = a+b;
    	System.out.println(total);
    }
    
    public static void hello() {
    	String a = "hello";
    	String b = "mynameislubna";
    	System.out.println(a+b);
    }
    
    
      public static void checkNumber(int num) {
    	  if (num >10) {
    	System.out.println(num + "is greater than 10.")	;  
    	  }else {
    		  System.out.println(num + "is not greater than 10.");
    	  }
      }
    	  public static void elaclass() {
    	  String m = "myworld";
    	  String v = "life";
    	  String u = m+v;
    	  System.out.println(u);
      }
  }


