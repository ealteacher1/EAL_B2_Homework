package slide7;

import java.util.ArrayList;

public class S7_T_7_Generic_ArrayList {
	
	/* Create 3 Generic Arraylist and Arraylist Name will be  “Phone(Int Type)” , 
     “Names (String Type)”, “ Grades(Double Type)”.
     a. Put Specific Datatype(ArrayList Type)  5 Primitive Data Type values Inside each Arraylists. 
     b. Print the length of the Employees, Schools and Teachers Arraylist .
     c. Print the Values of Each arraylist with For Loop and For Each Loop . The Consol should be 
     easily Understandable . Use Separations(example: Syso (******** Students all value by 
     Simple For Loop **** )*/

	public static void main(String[] args) {
		phone();
		Names();
		Grades();
		

	}
	public static void phone() {
		
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar.add(50);
		ar.add(60);
		ar.add(70);
		ar.add(80);
		ar.add(90);
		//length
		
		System.out.println(ar.size()+" length of ArrayList");
		//Print the Values of Each ArrayList with For Loop
		System.out.println("******** Phones all value by Simple For Loop ****");
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		
		//Print the Values of Each ArrayList with ForEach Loop
		
		System.out.println("******** Phone all value by Simple ForEach Loop ****");
		for(int x:ar) {
			System.out.println(x);
		}
	}
public static void Names() {
		
		ArrayList<String> ar1= new ArrayList<String>();
		ar1.add("apple");
		ar1.add("Avocado");
		ar1.add("Orange");
		ar1.add("WaterMelon");
		ar1.add("Strawberry");
		//length
		System.out.println(ar1.size()+" length of ArrayList");
		
		//Print the Values of Each ArrayList with For Loop
		System.out.println("******** Names all value by Simple For Loop ****");
		for(int i=0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		
		//Print the Values of Each ArrayList with ForEach Loop
		
		System.out.println("******** Names all value by Simple ForEach Loop ****");
		for(String x:ar1) {
			System.out.println(x);
		}
		
	}
public static void Grades() {
	
	ArrayList<Double> ar2= new ArrayList<Double>();
	ar2.add(65.5);
	ar2.add(75.5);
	ar2.add(85.5);
	ar2.add(95.5);
	ar2.add(98.5);
	
	System.out.println(ar2.size()+" length of ArrayList");
	
	
	//Print the Values of Each ArrayList with For Loop
	System.out.println("******** Grades all value by Simple For Loop ****");
	
	for(int i=0;i<ar2.size();i++) {
		System.out.println(ar2.get(i));
	}
	
	//Print the Values of Each ArrayList with ForEach Loop
	
	System.out.println("******** Grades all value by Simple ForEach Loop ****");
	for(double x:ar2) {
		System.out.println(x);
	}
}

}
