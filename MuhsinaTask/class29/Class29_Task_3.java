package class29;

public class Class29_Task_3 {

	public static void main(String[] args) {
/*Create 5 Return type Methods which will return Different data type Values. Create Different Data Type and 
 Calculations inside them and Call them in Main method (You can use , addition, Subtraction, If else , Print Statement 
 etc ).And Prove that it is returning the Value ( By Printing the Calling method’s value , you can prove that)*/
     
		System.out.println("----------addition----------");
	  int c= addition(); // 30
	   System.out.println(c);
	   
	   System.out.println("----------double----------");
	   double z= Substraction();// 46.06
	  System.out.println(z);
	  
	  System.out.println("----------String----------");
	  String Juice=Blender();//red apple sweet orange
	  System.out.println(Juice);
	  
	  System.out.println("----------String 2----------");
	  String O=House();
	  System.out.println(O);
	  
	  System.out.println("----------int----------");
	  int c1=multiplication();
	  System.out.println(c1);
	  
	  
	  
/* Create 4 Return type Methods .4 DIfferent Methods will return (1 dim Object Array,1 dim Int array,2 Dim String Array, 2 Dim Object Array). And Prove that it is returning
the Value ( By Printing the Calling method’s value , you can prove that But remember if it is , if it is returning 
an Array , You have to put the return value in an Array box. And you can prove it by printing with for Each loops/
For loops)*/
	
	  
	  System.out.println("--------------------");
	  Object Ob1[]=dimObArray();
		 
	  for (int x1=0; x1<Ob1.length; x1++) {
		  System.out.println(Ob1[x1]);
	  }
	  
	  System.out.println("-------------------");
	  Object Ob3[]=dimArray();
	  
	  for(Object Ob4:Ob3) {
		  System.out.println(Ob4);
	  }

	  System.out.println("--------------------");
	  int int1[]= oneDimInt();
	  for (int int2:int1) {  
	  System.out.println(int2);}
	  
	  System.out.println("--------------------");
	  twoDimObj();
	}
	
	
	public static int addition() {
		
		int a= 10;
		int b= 20;
		int c= a+b;
		return c;
				
	}
	
   
	public static double Substraction() {
		
		double x= 200.10;
		double y= 154.04;
		double z= x-y;		
		return z;
				
	}

  public static String Blender() {
	  
	  String apple= "Red Apple ";
	  String Orange= "Sweet Orange";
	  String Juice= apple+Orange;	  
	  return Juice;	  
  }
  
  public static String House() {
	  
	  String H= "beautiful";
	  String B= " & coasy";
      String O= H+B;
      return O;
  }

   public static int multiplication() {
	   
	   int a1 = 5;
	   int b1 = 4;
	   int c1 = a1*b1;
	   return c1;
	   
   }
  
   public static Object[] dimObArray(){
	   
	   Object Ob1[]= {4,"ayan",8};
	   return Ob1;
	   
   }
   
   public static Object[]dimArray(){
	   
	   Object Ob3[]= {30,20,4,9,10};
	   return Ob3;
   }
   
   public static int[] oneDimInt() {
	   
	   int int1[]= {100,200,300,400,500};
	   return int1;
   }
   
   public static Object[][] twoDimObj(){
	   
	   Object name[][]= {{"Shohag",2},{"Papia",1},{"Naziz",3}};
	   
	   for (Object Name1[]:name) {
		   for (Object Name2:Name1) {
			   System.out.println(Name2);}
		   }
		   
		   return name;
	   
	   
   }
   
   
   }
