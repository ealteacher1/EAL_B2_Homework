package Shahanaj;

public class S7_T_4_Wrapper {
	
	/*1. Convert 100 from Integer to Sting
      2. Convert true from boolean to String
      3. Convert '@' from character to String
      4. Convert 20.00 from double to String.*/

	public static void main(String[] args) {
		IntegerToString ();
		booleanToString();
		charToString();
		
	}
	public static void IntegerToString () {
		
		int i=100;
		String s=String.valueOf(i);
		System.out.println(s);
	}
	public static void booleanToString () {
		boolean b=true;
		String t=String.valueOf(b);
		System.out.println(t);
	}
	public static void charToString () {
		
		char c='@';
		String t= String.valueOf(c);
		System.out.println(t);
	}
	public static void doubleToString (){
		
		double d=20.00;
		String a=String.valueOf(d);
		System.out.println(a);
	}
	{
		
		
	}
}
