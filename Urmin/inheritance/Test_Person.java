package inheritance;

public class Test_Person {

	public static void main(String[] args) {
		
		 Task3_Dpolymorphism_person56 p = new  Task3_Dpolymorphism_person56();
		 p.display();// I have created person class object.
		 
		 p = new Teacher();// with the help of p u can call all persons
		 p.display();
		 
		 p= new Student();//constructor of child class
		 p.display();
		
	     p= new Employee();
	     p.display();
		
	     p = new Waiter();
	     p.display();
		
	     p = new Player();
	     p.display();
		 
	
	}

}
