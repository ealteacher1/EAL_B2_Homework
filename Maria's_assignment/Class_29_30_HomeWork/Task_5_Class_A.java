package Class_29_30_HomeWork;

public class Task_5_Class_A {

	public static void main(String[] args) {
		
		
	// Create a new class as Class_A and Create 3 Non-static method of Each
		//type ( Total 12 NS method ) inside the new class.one method should return dimensional array and one method must return 1 dimensional array	
		
		 Task_5_Class_A Object=new Task_5_Class_A();
		Object. blender1();
		
		
		Class_C Object1=new Class_C();
		Object1.callingfromc();
		

	}

// no return type  // Method without arguments
public void blander() {
	System.out.println("NS method");
	blender1();
}

public void blender1() {
	System.out.println("ns method 1");
	blender2();
}

public void blender2() {
	System.out.println("ns method 2");
	 blender3( "apple", "orrange");
}

//no return type  // Method with arguments

public void blender3(String apple,String orrange) {
	System.out.println("ns method 3");
	blender4( 200, 400);
	
}
public void blender4(int q,int e ) {
	
	System.out.println("ns method 4");
	blender5("mi","jim");
}
public void blender5(String line,String lin) {
	System.out.println("ns blender 5");
	blender6();
}

// return type  // Method without arguments

public int blender6() {
	int a=3200;
	System.out.println("ns blender 6");
	blender7();
	return a;
	

}
public String blender7() {
	String d="maria";
	System.out.println("ns blender 7");
	blender8();
	return d;
	
}

public Object blender8() {
	Object w="ria";
	System.out.println("ns blender 8");
	blender9("rahi","rafa","mim");
	return w;
}
// return type  // Method with arguments

public String blender9(String rahi,String rafa,String mim) {
	String ab="rahi";
	String ac="rafa";
	String ad="mim";
	String der=ab+ac+ad;
	blender10(4500,45);
	return der;
	
}

public int blender10(int y, int g) {
	int q=y;
	int w=g;
	int gy=q+w;
	blender11("tina","mina");
	return gy;
}

public String blender11(String tina,String mina) {
	String ro="tina";
	String jo="mina";
	String rojo=ro+jo;
	return rojo;
}

public int[][]bleander12(int ee,int aa){
	int rim[][]= {{400},{4500}};
	return rim;
}

public String[]bleander13(String p,String z){
	String rimsha[]= {"p","z"};
	return rimsha;
}







}




























