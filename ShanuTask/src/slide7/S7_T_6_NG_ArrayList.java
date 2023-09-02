package slide7;

import java.util.ArrayList;

public class S7_T_6_NG_ArrayList {
	
	/*1. Create 3 Non Generic Arraylist and Arraylist Name will be  “Employees” , 
	“Teachers”, “ Students”.
	 a. Put mixed 5 Primitive Data Type values Inside each Arraylists. 
	b. Print the length of the Employees, Schools and Teachers Arraylist .
	 c. Print the Values of Each arraylist with For Loop and For Each Loop . The Consol should be 
	easily Understandable . Use Separations(example: Syso (******** Students all value by 
	Simple For Loop **** )*/ 

	public static void main(String[] args) {
		employees();
		
		
		teacher();
		
		student();
		
	}
	
	public static void employees() {
		ArrayList Employees =new ArrayList();
		Employees.add(10);
		Employees.add("Sam");//non generic can add any data type
		Employees.add(true);
		Employees.add('A');
		Employees.add(5.5);
		//Print the length of the Employees
		System.out.println(Employees.size());
		
		//print all the values with for loop
		System.out.println("****************employees all value by simple For Loop ");
		for(int i=0;i<Employees.size();i++) {
			System.out.println(Employees.get(i));
		}
		//print all the values with For each loop
		System.out.println("****************employees all value by simple Foreach Loop ");
		for(Object x: Employees) {
			System.out.println(x);
		}
	}
	public static void teacher() {
		ArrayList Teachers=new ArrayList();
		Teachers.add(20);
		Teachers.add("Ayseha");
		Teachers.add(false);
		Teachers.add(6.5);
		Teachers.add('B');
		//Print the length of the Employees
	System.out.println(Teachers.size());
	//print all the values
	System.out.println("****************teachers all value by simple For Loop ");
			for(int i=0;i<Teachers.size();i++) {
				System.out.println(Teachers.get(i));
			}	
			//print all the values with For each loop
			System.out.println("****************Print Tacher all value by simple Foreach Loop ");
			for(Object x:Teachers) {
				System.out.println(x);
			}
			
		
		
	}
	public static void student() {
		ArrayList student= new ArrayList();
		student.add(30);
		student.add("Saafir");
		student.add(7.3);
		student.add('a');
		student.add(true);
		//Print the length of the Employees
		System.out.println(student.size());
					
		//print all the values
		System.out.println("****************students all value by simple For Loop ");
				for(int i=0;i<student.size();i++) {
					System.out.println(student.get(i));
				}
				//print all the values with For each loop
				System.out.println("****************Print student all value by simple Foreach Loop ");
				for(Object x: student) {
					System.out.println(x);
				}
	}

	

}
