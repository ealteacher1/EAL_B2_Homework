package Maria;

public class Task_4_methodwithArguments_returnType {

	public static void main(String[] args) {
		// Tasks 3 - Method Without Arguments - Return type //
		
	//1) Create 5 Return type Methods which will return Different data type Values. Put different
		//Different Data Type Input parameter and do some Calculations inside the method body
		//,Return a Value and Call the method from Main method ( You can use , addition,
	//	Subtraction, If else , Print Statement etc ) . And Prove that it is returning the Value ( By
		//Printing the Calling method’s value , you can prove that) 
	
		String readysomosa=somosa("cup of flour "," stuffing as nedded"," oil to fry");
		System.out.println(readysomosa);
		
		int income =householdincome(900,300,1200);
		System.out.println(income);	
		
		double salary=monthlysalary(2300.10,4000.00,1200.30);
		System.out.println(salary);
		
		Object allstudents=student(12,40,1000,400);
		System.out.println(allstudents);
		
		Object act=actors(400,300,100,210);
		System.out.println(act);
		
		
		// 2) Create 4 Return type Methods .4 DIfferent Methods will return (1 dim Object Array,1 dim Int
		//array,2 Dim String Array, 2 Dim Object Array). Put different Different Data Type Input
		//parameter And Prove that it is returning the Value ( By Printing the Calling method’s value ,
		//you can prove that But remember if it is , if it is returning an Array , You have to put the
		//return value in an Array box. And you can prove it by printing with for Each loops/.
		//For loops) – check next 2 example ss for reference
		
		Object sweet[]=dessert("sugar","rice","milk");
		for(Object sweet1:sweet) {
			System.out.println(sweet1);}
		
	    int number[]=numberofcompany(210,3100,4100,1500);
	    for(int company:number) {
	    	System.out.println(company);
	    }
		
	    String rest[][]=vacation("money","luggage","car","clothes");
	    for(String va[]:rest) {
	    	for(String vaca:va) {
	    		System.out.println(vaca);}    }
	  
	     Object horseride[][]=ride("horse","ridingshoes","cofidence");
	     for(Object horse[]:horseride) {
	    	 for(Object hor:horse) {
	    		 System.out.println(hor);
	    	 }
	     }
	}

	public static String somosa(String flour,String stuffing,String oil) {
		String readysomosa=flour+stuffing+oil;
		return readysomosa;
	}
	
	public static int householdincome( int x,int y,int u ) {
		int income = x+y+u;
		return income;
	}
	
	
	public static double monthlysalary(double k,double j,double f) {
		double salary=k+j+f;
		return salary;
	}
	
	
	public static Object student(int n,int m,int v,int l ) {
		Object allstudents=n+m+v+l;
		return allstudents;
	}
	
	public static Object actors(int a,int b,int c,int o) {
		Object act=a+b+c+o;
		return act;
	}
	
	
	public static Object[] dessert(Object sugar,Object rice,Object milk) {
		Object sweet[]= {"sugar","rice","milk"};
		return sweet;
	}
	
	public static int[] numberofcompany(int ab,int ac,int ad,int ae) {
		int number[]= {ab-ac+ad+ae};
		return number;
	}
	
	public static String[][]vacation(String money,String luggage,String car, String clothes){
		String rest[][]= {{"money","luggage"},{"car","clothes"}};
		return rest;
	}
	
	
	public static Object[][] ride(Object horse,Object ridingshoes,Object confidence){
		Object horseride[][]= {{"horse","ridingshoes"},{"cofidence"}};
		return horseride;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
