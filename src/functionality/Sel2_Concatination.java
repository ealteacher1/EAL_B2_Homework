package functionality;

public class Sel2_Concatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Integar
		int i6=10;
		int i7=40;
		
		//string
		String s6="hello";
		String s7= "world";
		
		System.out.println(i6+i7+s6+s7); // 50helloworld
		System.out.println(s6+i6+i7+s7); // hello1040world
		System.out.println(s6+(i6+i7)+s7); // hello50world


		System.out.println("the value of i7 = " +i7);

	}

}
