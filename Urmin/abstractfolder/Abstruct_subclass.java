package abstractfolder;

public class Abstruct_subclass extends S90_Abstract_T6  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void m2() {
		// TODO Auto-generated method stub
		
	}
	@Override// you have to copy it from 1st class cause only abs methods will be copied not normal methods
	 public void normalmethod() {
		System.out.println(" Normal method in abs class 1");
}
}