package Student_Muhsina;


public class Class33_Task1_Amazon extends Class33_Task1_SuperClass {

	public static void main(String[] args) {
		// Child class should have their own different Methods.
		
		Class33_Task1_Amazon ob1=new Class33_Task1_Amazon();
		ob1.amazon(0);
		ob1.amazon();
		ob1.amazon();

	}
	public void amazon() {
		
		System.out.println("this is amazon");
	}
	public void amazon(int a) {
		System.out.println("this is amazon with imput parameter");
		
	}

}
