package methodoverloadding;

public class S21_Task_2_Classs10t2 {

	public static void main(String[] args) {
	
		///Create another Class ( Class s10t2) and Call all the overloaded method There2.Overload a Class Constructor 10 times. 
		
		S21_Task_2 obj = new S21_Task_2();
		
		obj.urmin(9);
		obj.urmin(5);
		obj.urmin('a', 'c');
		obj.urmin(2.5,"length");
		obj.urmin(0, 0);
		obj.urmin(19,'u', 0);
		obj.urmin(23,26,30);
		obj.urmin(9,12,5,20);
		obj.urmin(5, 'h', "red");
		
		
		
	}
	public S21_Task_2_Classs10t2 () {
		System.out.println("Costructor 1 is called" );
		}
	public S21_Task_2_Classs10t2 (int x) {
		System.out.println("Costructor 2 is called :" + x);

}
	public S21_Task_2_Classs10t2 (char y) {
		System.out.println("Costructor 3 is called :" + y);
	}
	
	public S21_Task_2_Classs10t2 (double c) {
		System.out.println("Costructor 4 is called :" + c);
	}
	public S21_Task_2_Classs10t2 (int a, int b) {
		System.out.println("Costructor 5 is called :" + a + b);
	}
	public S21_Task_2_Classs10t2 (String j) {
		System.out.println("Costructor 6 is called :" + j);
	}
	public S21_Task_2_Classs10t2 (boolean k) {
		System.out.println("Costructor 7 is called :" + k);
	}
	public S21_Task_2_Classs10t2 (String j, int c) {
		System.out.println("Costructor 8 is called :" + j + c);
	}
	public S21_Task_2_Classs10t2 (double k, char w) {
		System.out.println("Costructor 9 is called :" + k + w );
	}
	public S21_Task_2_Classs10t2 (double m, boolean u) {
		System.out.println("Costructor 10 is called :" + m + u);
	}
}