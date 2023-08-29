package Class_31_HomeWork;

public class Task_1_Call_By_Reference {

	public static void main(String[] args) {
		
		// Create 5 example of Calling by Object Reference/Class Variable
		
		int a=5000;
		String b="name";
		
		
		int c=600;
		c=a;
		
		System.out.println(600);
		System.out.println(a);
		
		String s="maria";
		 s="b";
		System.out.println("maria");
		System.out.println(b);
	
		
		Task_1_Call_By_Reference ob=new Task_1_Call_By_Reference();
		
		//ob.method(new Task_1_Call_By_Reference());
		ob.method(ob);
		
		ob.method1(b);
		ob.method1("name");
		
		ob.method2(a);
		ob.method2(5000);
		
		ob.method3(ob);
	    ob.method3(new Task_1_Call_By_Reference());
	    
	    ob.profit(ob);
	    ob.profit(new Task_1_Call_By_Reference());
	}
	
	public void method(Task_1_Call_By_Reference salary) {
		System.out.println("salary");
            }

    public void method1(String name) {
	   System.out.println("method number 1");
    }


    public void method2(int totalincome) {
	   System.out.println(totalincome);
     }

   public void method3(Task_1_Call_By_Reference monthlyincome) {
	   System.out.println("monthlyincome "+ 300);
   }

   public void profit(Task_1_Call_By_Reference yearly) {
	   System.out.println("yearly income "+5000);
   }









}
