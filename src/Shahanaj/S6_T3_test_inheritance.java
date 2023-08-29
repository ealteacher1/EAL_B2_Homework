package Shahanaj;

public class S6_T3_test_inheritance {

	public static void main(String[] args) {
		
		
		
		
		
		S6_T2_Q1_C3_inhe op= new S6_T2_Q1_C3_inhe();
		op.Animal();
		op.eat();//calling from child class,compiler is right
		System.out.println("******************");
		
		S6_T2_Q1_C1_inhe ab= new S6_T2_Q1_C1_inhe();
		ab.Animal();
		ab.run();
		ab.eat();//coming from parent class, help of parent class constructor
		//compiler is right//static polymorphism
		System.out.println("************************");
		
		S6_T2_Q1_C1_inhe bc=new S6_T2_Q1_C3_inhe();//create reference from parent & constructor from child
		bc.Animal();
		bc.eat();
		bc.run();//its showing from parent class but give result of child class
		//this time compiler wrong,its top casting
		//this process called dynamic polymorphisom/runtime polymorphism
		//its only for overridden methods, but top casting for any inherited methods
		
		

	}

}
