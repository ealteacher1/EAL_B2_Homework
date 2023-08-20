package My_Personal_Task;

public class S_1_One_Reverse_String_Sarder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Maria";
		int aalength=name.length();
		
		System.out.println(aalength);
		System.out.println(name.charAt(aalength-1));
		
		String rev="";
		
		for(int a = aalength-1; a>=0;a--) {
		
			rev=rev+name.charAt(a);
			
		}
		System.out.println(rev);
	}
	

}
