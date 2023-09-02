package Slide4;

public class S4_T_6_Class_D {

	/*
	 * Create a new class as Class_D and Create 5 Constructor for the Same Class ,
	 * You must follow the rules of Constructor. a. Call all newly created
	 * Constructors from Main method of the same class b. Call all Constructors from
	 * the Main methods of Different class’s from the Same Package . c. Create
	 * another class Named “Class_E” . Create another public NS method ,Method name
	 * should be CallingFromE inside that method, Call all NS methods from CLass D
	 */

	public static void main(String[] args) {

		S4_T_6_Class_D ob = new S4_T_6_Class_D();
		S4_T_6_Class_D ob1 = new S4_T_6_Class_D(500);
		S4_T_6_Class_D ob2 = new S4_T_6_Class_D("Constructor ", 123);
		S4_T_6_Class_D ob3 = new S4_T_6_Class_D("Aysha", " Saahir");
		S4_T_6_Class_D ob4 = new S4_T_6_Class_D("print Constructor");

	}

	public S4_T_6_Class_D() {
		System.out.println("empty constructor");

	}

	public S4_T_6_Class_D(int x) {
		int i = x + 10;
		System.out.println(i);

	}

	public S4_T_6_Class_D(String Apple) {
		System.out.println(Apple);

	}

	public S4_T_6_Class_D(String s, int y) {
		System.out.println(s + y);

	}

	public S4_T_6_Class_D(String a, String b) {
		System.out.println(a + b);

	}

}
