package Slide4;

public class S4_T3_M_NA_WR_C2 {
/* Create 4 Return type Methods .4 DIfferent Methods will return
(1 dim Object Array,1 dim Int array,2 Dim String Array,
 2 Dim Object Array). And Prove that it is returning the Value ( By Printing the Calling method’s value ,
 you can prove that But remember , if it is returning an Array , 
You have to put the return value in an Array box. And you can prove it by printing with for
 Each loops/. For loops)– check next 2 example ss for reference*/
	
	public static void main(String[] args) {
	//1
		Object[]a=onedimObject();
		System.out.println("*********1dimentional array");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("********for each loop****");
		for(Object x:a) {
			System.out.println(x);
		}
		System.out.println("************----");
	
		//2
		int[]ab=intArry();
		System.out.println("*********Object array");
		for(int j=0;j<ab.length;j++) {
			System.out.println(ab[j]);
		}
		System.out.println("********for each loop****");
			for(int x:ab) {
				System.out.println(x);
			}
	//3
			 String [][] s= twodimStringArray() ;
			 System.out.println("**********");
			 for(int i=0;i<s.length;i++) {
				 System.out.println(a[i]);
			 }
			System.out.println("********for each loop****");
			for(String[]d:s) {
				for(String y:d) {
					System.out.println(y);
				}
			}
			
			 Object[][]ob1= twodimObject();
			 System.out.println("************");
			 for(int i=0;i<ob1.length;i++) {
				 System.out.println(ob1[i]);
			 }
			System.out.println("********for each loop****");
			for(Object[]o:ob1) {
				for(Object f:o) {
					System.out.println(f);
				}
			}
	}
	
		
	public static Object[] onedimObject() {
		Object[]array= {12,"Aysha",15,"Saahir",23};
		return array;
		
	}
	public static int[] intArry() {
		int apple[]= {17,12,3,5,6};
		
		return apple;
		
	}
	public static String[][] twodimStringArray() {
		String [][]ab= {{"Ram","Sam"},{"lio","jony"},{"sony","Rony"}};
		return ab;
		
	}public static Object[][] twodimObject() {
		Object[][]ob= {{12,"Robin"},{23,"Rahim"},{"Ajom",32}};
		return ob;
		
		
	
	   
}


}
