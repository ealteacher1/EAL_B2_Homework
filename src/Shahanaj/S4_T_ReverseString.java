package Shahanaj;

public class S4_T_ReverseString {

	public static void main(String[] args) {
		
	
		
	
		String abc="Shanu";
		
		int length=abc.length();
		
		System.out.println(length);
		
		System.out.println(abc.charAt(length-1));
		System.out.println(abc.charAt(1));
		String reverse="";
		
		for(int a=length-1;a>=0;a--) {
			reverse= reverse + abc.charAt(a);
		}
		System.out.println(reverse);
	}

}
	


