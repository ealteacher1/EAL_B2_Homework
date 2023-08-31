package Slide4;

public class S4_T4_M_WR_WA {
	/* Create 5 Return type Methods which will return Different data type Values. Put different 
Different Data Type Input parameter and do some Calculations inside the method body 
,Return a Value and Call the method from Main method ( You can use , addition, 
Subtraction, If else , Print Statement etc ) . And Prove that it is returning the Value ( By 
Printing the Calling method’s value , you can prove that)*/

	public static void main(String[] args) {
		System.out.println("***********a*****");
		m1("2023");
		m2(10, 20);
		m3(29,2.8);
		m4("Aysha",39);
		m5(27, 37);
	System.out.println("***********b******");
	Object[] ob=onedimObject("Aysha","NewYork");
	for(Object x:ob) {
		System.out.println(x);
	}System.out.println("****************");
	int[]in=intArry(5000, 2000);
	for(int x:in) {
		System.out.println(x);
	}
		System.out.println("***************");
	String[][] s=twodimStringArray("Saahir", "A");
	for(String[]d:s) {
		for(String y:d) {
			System.out.println(y);
		}
	}
	System.out.println("*************");
	Object[][]ob1= twodimObject(in, s);
	 System.out.println("************");
	 for(int i=0;i<ob1.length;i++) {
		 System.out.println(ob1[i]);
	}
	}

	public static String m1(String s) {
		String t="Hello";
		String n=t+s;
		System.out.println(n);
		return n;
		
	}
	public static int m2(int a,int b ){
		int c=(a+b);
		System.out.println(c);
		return c;
	}
	public static double m3(int x,double y) {
		 double i =3.5;
		  double j = 2.5;
		  double k = (i*j)+x+y;
		  System.out.println(k);
		  return k;
		
	}public  static String m4(String h,int y) {
		String o="orange";
		String l=h+o+y;
		System.out.println(l);
		return l;
	}
	public  static int m5(int x,int y) {
		int e=190;
		int k=e-(x-y);
		System.out.println(k);
		return k;
	}
	/*2) Create 4 Return type Methods .4 DIfferent Methods will return (1 dim Object Array,1 dim Int 
	array,2 Dim String Array, 2 Dim Object Array). Put different Different Data Type Input 
	parameter And Prove that it is returning the Value ( By Printing the Calling method’s value , 
	you can prove that But remember if it is , if it is returning an Array , You have to put the 
	return value in an Array box. And you can prove it by printing with for Each loops/. 
	For loops)  – check next 2 example ss for reference*/
	
	
	public static Object[] onedimObject(Object name,Object location) {
		Object[]array= {name,location};
		return array;
		
	}
	public static int[] intArry(int income,int expense) {
		int profit[]= {income-expense};
		
		return profit;
		
	}
	public static String[][] twodimStringArray(String name,String letter) {
		String [][]ab= {{"Name","Sam"},{"lio","jony"},{"sony","Rony"}};
		System.out.println(name+letter);
		return ab;
		
	}public static Object[][] twodimObject(Object name,Object id) {
		Object[][]ob= {{12,"Robin"},{23,"Rahim"},{"Ajom",32}};
		System.out.println(name);
		return ob;
		
	}	
}