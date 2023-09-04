package methodoverloadding;

public class Global_abc2_Static {

	 static int version=10;
	
	public static void main(String[] args) {
		Global_abc2_Static ob1 = new Global_abc2_Static();
		ob1.test1();
		

	}
	public void test1() {
		Global_abc2_Static ob = new Global_abc2_Static();
		
		ob.version=50;// if the variable is static, the value will be changed for everyone.
		
		
		System.out.println(ob.version);
		System.out.println(version);
	}
	
		}

