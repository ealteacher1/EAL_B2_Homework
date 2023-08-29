package Slide6;

public class S6_T2_Q1_C2_inhe extends S6_T2_Q1_C1_inhe {//C1 is parent of C2 child
	@Override
	public void Animal() {
		System.out.println("cat is a animal from C2");
	}
	
	@Override
	public void eat() {
		System.out.println("cat eat milk from C2");
	}
	
	@Override
	public void run() {
		System.out.println("cat can run");
	}
	public void make_sound() {
		System.out.println("cat can say ,meaw");
	}

}
