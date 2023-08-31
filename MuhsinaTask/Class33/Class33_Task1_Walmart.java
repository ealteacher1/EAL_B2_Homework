package Class33;

public class Class33_Task1_Walmart extends Class33_Task1_SuperClass {

	public static void main(String[] args) {
		// Child class should have their own different Methods.
		
		
		Class33_Task1_Walmart ob5=new Class33_Task1_Walmart();
		
		ob5.add_to_cart();
		ob5.buy();
		ob5.walmart();
	}
	
	public void walmart() {
		
		System.out.println("walmart");
	}

}
