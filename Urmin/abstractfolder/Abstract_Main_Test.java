package abstractfolder;

public class Abstract_Main_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstruct_subclass s1 = new Abstruct_subclass();
		Abstract_Subclass2 s2 = new Abstract_Subclass2 ();
		
		s1.m1();
		s2.m3();
		s1.m2();
		s2.m4();
		s1.normalmethod();//Overridden methods
		s2.normalmethod();// Overridden methods
		
	}

}
