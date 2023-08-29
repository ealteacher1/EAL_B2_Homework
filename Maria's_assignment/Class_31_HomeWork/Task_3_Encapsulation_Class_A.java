package Class_31_HomeWork;

public class Task_3_Encapsulation_Class_A {

	public static void main(String[] args) {
		
		
		// Create a new Class(ex: class A) . Create 3 private methods there and put
		//print statements inside those method and Call them from Another class (ex: call them from Class B) 

		Task_3_Encapsulation_Class_A ob= new Task_3_Encapsulation_Class_A();
		ob.coffee();
		ob.family_gross_income();
		
		ob.tortilla();
		
		
	}
       private void coffee() {
    	   String water=" 2 cups";
    	   String coffee=" 4 tsp";
    	   String sugar=" 2 tsp";
    	   String milk=" 1 cup";
    	   String readycoffee=water+coffee+sugar+milk;
    	   System.out.println(readycoffee);
       }
	
	  public void time_to_drink_coffee() {
		  coffee();
	  }
	
	   private void family_gross_income() {
		   int a= 2000;
		   int d=7600;
		   int g=2159;
		   int profit=2000+7600+2159;
		   System.out.println(profit);
	   }
	
	    public void gross_income() {
	    	family_gross_income();
	    }
	
	    private void tortilla() {
	    	String flour=" 3 cups";
	    	String water =" 1 cup";
	    	String solt=" to test";
	    	String dough=flour+water+solt;
	    	System.out.println(dough);
	    	
	    	 }
	
	    public void ready_to_eat() {
	    	tortilla();
	    }
	
	
	
	
	
	
}


