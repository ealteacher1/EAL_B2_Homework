package Slide6;

public class S6_T2_Q1_C3_inhe extends S6_T2_Q1_C2_inhe {//C1 is grand parent of C3
	
	@Override
	public void Animal() {
		System.out.println("Dog is a animal from C3");
	}
	public void Dog_eat() {
		System.out.println("Dog like Bone from C3");
	}
	
	public void run() {
		System.out.println("Dog can run from C3");
	}
}
