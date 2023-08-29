package Class_32_HomeWork;

import Class_32_HomeWork.S32_T4;

public class S32_T4_N2 {
		
	public int am;
	public String an;

	public static void main(String[] args) {
		
		// Create 2 class type ns variables and Call them in Static method
		
		S32_T4_N2 ob=new S32_T4_N2();
		ob.rim();

		S32_T4_N2 ob1=new S32_T4_N2();
		ob1.rim2();


		S32_T4.test();
		S32_T4.test1();
		S32_T4.test2();
		S32_T4.test2();
		S32_T4.test4();
		S32_T4.test3();
		
	
	
	}
            public static void rim() {
           S32_T4_N2 ob=new S32_T4_N2();
           ob.am=80;
            System.out.println("call from "+ ob.am);
            
            }

            public static void rim2() {
             S32_T4_N2 ob1=new S32_T4_N2();
             ob1.an="maria";
             System.out.println("call from "+ ob1.an);
                 
                 }









}


