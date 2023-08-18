package accessmodifier.com;

public class Class_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //ask 7:1)Create a new Class and Create 1 Static and 2 Non static methods of Each type access modifier ( total 12 Methods ) 
		//2)Create one class  ClassAM_1   in the same Package, and Create another Class   ClassAM_2 in a Different Package.
		//a)Show the Differences of Public, Private, protected and Default by call methods from the Different classes that we have created. 86

	}
	//static no arguments
	public static void staticMethod1() {
		System.out.println("Static Method 1 called.");
    }
	 // Non-static  no arguments and no return
    public void nonStaticMethod1() {
        System.out.println("Non-Static Method 1 called.");
    }
 // Non-static with arguments and return
    public int nonStaticMethod2(int num) {
        System.out.println("Non-Static Method 2 called with argument: " + num);
        return num + 2;
    }

    // Static  with arguments and return
    public static String staticMethod2(String str) {
        System.out.println("Static Method 2 called with argument: " + str);
        return "Hello, " + str;
    }

    // Non-static with no arguments and no return
    void nonStaticMethod3() {
        System.out.println("Non-Static Method 3 called.");
    }

    // Static with no arguments and no return // only accessible in the class where it has been defined!
    private static void staticMethod3() {
        System.out.println("Static Method 3 called.");
    }

    // Non-static  with arguments and return /// it can travel to different classes of same  package but not in different package
    //if there subclass then it can be called
    protected boolean nonStaticMethod4(boolean red) {
        System.out.println("Non-Static Method 4 called with argument: " + red);
        return !red;
    }

    // Static  with arguments and return
    protected static double staticMethod4(double value) {
   
    System.out.println("Static Method 4 called with argument: " + value);
       return value * 2;
    }

    // Non-static  with no arguments and no return
    private void nonStaticMethod5() {
        System.out.println("Non-Static Method 5 called.");
    }

    // Static with no arguments and no return// void = no access modifier and accessible to different classes but not in different packages
    void staticMethod5() {
        System.out.println("Static Method 5 called.");
    }

    // Non-static  with arguments and return
    public String nonStaticMethod6(String input) {
        System.out.println("Non-Static Method 6 called with argument: " + input);
        return "result: " + input;
    }

    // Static  with arguments and return
    public static int staticMethod6(int value) {
        System.out.println("Static Method 6 called with argument: " + value);
        return value + 10;
    }
}


