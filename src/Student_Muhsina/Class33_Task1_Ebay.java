package Student_Muhsina;


public class Class33_Task1_Ebay extends Class33_Task1_SuperClass {

	public static void main(String[] args) {
		// Child class should have their own different Methods.
		
		Class33_Task1_Ebay ob2= new Class33_Task1_Ebay();
		ob2.ebay();
		ob2.ebay("hello ebay");
		ob2.buy();

	}
	public void ebay() {
		
		System.out.println("1st ebay method");
	}
	public void ebay(String name) {
		
		System.out.println("2nd ebay method");
	}

}
