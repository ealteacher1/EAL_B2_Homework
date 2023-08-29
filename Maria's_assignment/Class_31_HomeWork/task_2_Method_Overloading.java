package Class_31_HomeWork;

public class  task_2_Method_Overloading {

	public static void main(String[] args) {
		
		            // task_2_Method_Overloading
		// 1. Create a method with Your Name , (method name should be your nickname) And Overload that method 10 times.
		//Create another Class ( Class s10t2) and Call all the overloaded method There
		task_2_Method_Overloading ob=new task_2_Method_Overloading();
          ob.maria(100);
		  ob.maria(200,3200);
		  ob.maria('d');
		  ob.maria(230.00);
		  ob.maria(22.00);
		  ob.maria(12,0);
		  ob.maria(1200,0,300);
		  ob.maria(0,3900);
		  ob.maria(0,0);
		  ob.maria(1300,2200,50000);
		  
		   
		  
	}


	
	public void maria(int a) {
	System.out.println(100);	
	}
	public void maria(int b,int c) {
	System.out.println("method 2");	
	}
	public void maria(char d) {
	System.out.println('d');	
	}
	public void maria(float e) {
	System.out.println(230.00);	
	}
	public void maria(double f) {
	System.out.println(22.00);	
	}
    public void maria(int g,float h) {
    System.out.println("method 6");	
    }
	public void maria(int i,float j,int k) {
	System.out.println("method 7");	
	}
	public void maria(double l,int m) {
	System.out.println("method 8");	
	}
    public void maria(double n,float o) {
    	System.out.println("method 9");
    }
	public void maria(int p,int q,int r) {
		System.out.println("method 10");	
	}
	

	
	
	
}
