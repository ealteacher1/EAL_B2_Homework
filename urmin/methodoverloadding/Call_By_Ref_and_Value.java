package methodoverloadding;

public class Call_By_Ref_and_Value {

	public static void main(String[] args) {
		int x = 10;
		String y = "name";
		Call_By_Ref_and_Value ob = new Call_By_Ref_and_Value();
		
		System.out.println(10);//print by value
		System.out.println(x);// print by variable
		
		int b=5000; //store by value
		b=x;// store by variable
		
		ob.addition(5000);//call by value
		ob.addition(b);// call by reference value
		
		ob.addition2(new Call_By_Ref_and_Value());// call by class value
		ob.addition2(ob);// call by class variable
		
		// Remember class value will be always object//
		
	}
		public void addition(int salary) {// you have to create an object in main method
			System.out.println(salary);
		}
		// pass===providing something through input arguments
		
		public void addition2( Call_By_Ref_and_Value salary) {// first you have to pass class type as input argument ,ex-Call_By_Ref_and_Value , Then you have to call it from the main method.
			System.out.println(salary);
		}
		
		
}


