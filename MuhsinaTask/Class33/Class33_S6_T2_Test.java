package Class33;

import class29.Method_in_Java;

public class Class33_S6_T2_Test extends Method_in_Java {

	public static void main(String[] args) {
		
 /* d. Create another Class (S6_T2_Test) and Call child Class Object and Try to Call all the 
  overridden methods and Non Overridden Methods as well. Check From where Overridden methods 
  are getting Called*/
		
		Class33_S6_T2_Test object=new Class33_S6_T2_Test();
		object.ProfitOfCompany();
		
		System.out.println("-------------------------");
		
		Class33_S6_T2_Q1_C2 object1=new Class33_S6_T2_Q1_C2();
		
		object1.ns1();
		
		System.out.println("----------------");
		
		object1.ns2(0);
		
		System.out.println("----------------");
		object1.ns2(30);
		
		
		

	}

}
