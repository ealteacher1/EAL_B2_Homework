package Sel7_1;

public class Sel8_1 {

	static int x=10;
	int a =20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=20;  //Local variable
		
		Sel8_1 greenob1= new Sel8_1();
		greenob1.a=30;
		greenob1.ns1(20);
		
		System.out.println("It is Green Object" + greenob1.a);
		
		
		Sel8_1 yelob1= new Sel8_1();
		yelob1.ns1(30);
		System.out.println("It is yellow object"+ yelob1.a);
		
	}

	public void ns1(int x) {
		int y = x+10;
		System.out.println(y);
	}

	public void ns2(int x) {
		int y = x+10;
		System.out.println(y);

}
	}
