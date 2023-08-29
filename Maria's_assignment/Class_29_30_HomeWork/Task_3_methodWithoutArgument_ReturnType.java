package Class_29_30_HomeWork;

public class Task_3_methodWithoutArgument_ReturnType {

	public static void main(String[] args) {
		// Tasks 3 - Method Without Arguments - Return type //
		
	// 1) Create 5 Return type Methods which will return Different data type Values. Create
	//Different Data Type and Calculations inside them and Call them in Main method (
	//You can use , addition, Subtraction, If else , Print Statement etc ) . And Prove that it
 //is returning the Value ( By Printing the Calling method’s value , you can prove that)	
	int i = employees();	
	System.out.println(i);
	String blackcofee=blackcofee1();
	System.out.println(blackcofee);
	Object t=blender();
	System.out.println(t);
	String pakora=blender1();
	System.out.println(pakora);
	
	double incomeformonth=storeincome();
	System.out.println(incomeformonth);
	
	
	
	// 2) Create 4 Return type Methods .4 DIfferent Methods will return (1 dim Object Array,1
	//dim Int array,2 Dim String Array, 2 Dim Object Array). And Prove that it is returning
	//the Value ( By Printing the Calling method’s value , you can prove that But
	//remember if it is , if it is returning an Array , You have to put the return value in
	//an Array box. And you can prove it by printing with for Each loops/. For loops) – check next 2 example ss for reference
	
	Object []Array=abc();
		for(Object mim:Array) {
			System.out.println(mim);}
		
	
	int taz[]=f();
	for(int tazi:taz) {
		System.out.println(tazi);
	}
	
	String naushina[][]=naushin();
	for(String an[]:naushina) {
		for(String ani:an) {
			System.out.println(ani);
		}
	}
	
	
	Object rahi[][]=tahseen();
	for(Object raha[]:rahi) {
		for(Object ra:raha) {
			System.out.println(ra);
		}
	}
	}

	
	// Tasks 3 - Method Without Arguments - Return type //
	
	public static int employees() {
		int i=3000;
		return i;
		
	}
	public static String blackcofee1() {
		String a="a cup of water ";
		String b="1 tsp of cofee ";
		String blackcofee=a+b;
		return blackcofee;
		
	}
	
	
	public static Object blender() {
		Object r="apple";
		Object t="pinapple";
	 
		return t;
		
	}
	
	public static String blender1() {
		String y="onion =1 ";
		String u="beshon= 1 cup";
		String o="solt=1 tsp";
		String pakora=y+u+o;
		return pakora;
		
		
	}
	
	
	public static double storeincome() {
		double l=50000.00;
		double k=4500.90;
		double incomeformonth=l-k;
		return incomeformonth;
	}
	
	public static Object[] abc(){
		Object maria[]= {"ria","rahi"};
		return maria;
		}
	
      public static int [] f() {
	int tasnia[]= {1,2,3,4,500};
	return tasnia;
}

   public static String[][] naushin(){
	   String shin[][]= {{"maria","naushi"},{"shina","raha"}};
	   return shin;
   }

    public static Object[][] tahseen(){
    	Object roni[][]= {{"bangladesh",1200},{"usa",5000}};
    	return roni;
    }












		
	
	
	
	
	
	
	
	
	
	
	
	
	
}





