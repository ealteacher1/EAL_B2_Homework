package methodoverloadding;

public class Global_abc {

	 int version=10;
	
	public static void main(String[] args) {
		Global_abc ob1 = new Global_abc();
		ob1.test1();
		

	}
	public void test1() {
		Global_abc ob = new Global_abc();
		ob.version=50;
		System.out.println(ob.version);//it it is NS variables, object variable's value is changing, but main variables value is same
		System.out.println(version);
	}
	
		}

