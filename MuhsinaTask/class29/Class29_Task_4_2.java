package class29;

public class Class29_Task_4_2 {

	public static void main(String[] args) {
		
 /*Create 4 Return type Methods .4 DIfferent Methods will return (1 dim Object Array,1 dim Int
	array,2 Dim String Array, 2 Dim Object Array). Put different Different Data Type Input
	parameter And Prove that it is returning the Value ( By Printing the Calling method’s value ,
	you can prove that But remember if it is , if it is returning an Array , You have to put the
	return value in an Array box. And you can prove it by printing with for Each loops/.
	For loops)*/
		
		System.out.println("--------one dim Object array----------");
		OneObjA();
		
		System.out.println("--------one dim int array----------");
		intArray();
		
		System.out.println("--------two dim String array----------");
		twoDimS();
		
		System.out.println("--------two dim Object array----------");
		twoDimOb();
		
		}

	
	
	public static Object[] OneObjA() {
		
		Object[] ob11= {"ayan", 1,"zaina",6};
		for(Object ob12:ob11) {
			System.out.println(ob12);
		}
		return ob11;
	}
	
	public static int[] intArray() {
		
		int i[]= {100,200,300,400};
		
		for(int i1:i) {
			System.out.println(i1);
		}
		return i;
	}
	
	public static String[][] twoDimS(){
		
		String s11[][]= {{"Shuvra","Nadia"},{"Papia","Fariha"},{"Deena","Bonna"}};
		
		for (String s22[]:s11) {
			for(String s33:s22) {
				System.out.println(s33);
			}
		}
		
		return s11;
	}
	
	public static Object[][] twoDimOb() {
		
		Object o1[][]= {{"Deena",1},{"Bonna",2},{"Reshu",3}};
		
		for(Object o2[]:o1) {
			for(Object o3:o2) {
				System.out.println(o3);}
			}
				
			return o1;
				
	
 }
}
