package Class33;

public class Class33_Task1_SuperClass {

	public static void main(String[] args) {
			
/*Task 1:
 1. Create A Parent Class/Super Class Shopping with Two NS Method(Buy and Add_to_Cart ),
  Create 5 Child class/SubClass of Shopping, (Class Name: Amazon, Walmart, Shane , PCRichard,
  Ebay). All these Child class should have their own different Methods. Create a TestShopping 
  Class with Main method and Create object of all Child classes. Call the parent Class’s methods,
  with those newly created Object Objects */
		
		Class33_Task1_SuperClass ob=new Class33_Task1_SuperClass();
		ob.buy();
		ob.add_to_cart();
		
		

	}
	
	public void buy() {
		
		System.out.println("NS method buy");
	}
	
	public void add_to_cart() {
		
		System.out.println("NS method Add_to_Cart");
		
	}

}
