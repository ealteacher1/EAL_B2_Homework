package Shahanaj;

public class S6_T2_Test_inhe {

	public static void main(String[] args) {
	//a override is working
		
		S6_T2_Q1_C3_inhe ob= new S6_T2_Q1_C3_inhe();
		ob.Animal();//it call the child class, because it has the same thing
		//it won't take from parent class,this called Overriding
//b.
		ob.x=15;//global variable can be inherit
		
		//c.
		S6_T2_Q1_C2_inhe ob1 =new S6_T2_Q1_C2_inhe();
		ob1.Animal();
		ob1.eat();
		ob1.run();//Overridden methods are calling from child class
		ob1.make_sound();
		
		
	}

}
