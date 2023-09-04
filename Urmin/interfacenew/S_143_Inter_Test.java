package interfacenew;

public class S_143_Inter_Test {

	public static void main(String[] args) {
		
		Interface_Class ob = new Interface_Class ();// create the object of class not interface//this is child
		///Dynamic pm , methods will be coming from child class .
		
		S_143_Interface1 in1=ob;
		S_143_Interface2 in2=ob;
		S_143_Interface3 in3=ob;
		S_143_Interface4 in4=ob;
		S_143_Interface5 in5=ob;
	
		
		in1.m1();
		in2.m2();
		in3.m3();
		in4.m4();
		in5.m5();
		
		
	}

}
