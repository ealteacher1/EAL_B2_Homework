package methodoverloadding;

public class S_76_Task5_Getterandsetter {
	//Create 2 Private Global Variables.
			//Set there Value from Different Class and 
			//And get the Updated Value of the Global variables there 
	//(In the same class , from where you are setting the Value ) 
	
	private int a; private int b;

	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getA() {
		return a;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int getB() {
		return b;
	}

	public static void main(String[] args) {
		
		S_76_Task5_Getterandsetter ob = new S_76_Task5_Getterandsetter();
		
		ob.setA(900);
		ob.setB(500);
		int global =ob.getA();
		int global2 = ob.getB();
		
		System.out.println(global);
		
		System.out.println(global2);
	}
	}


