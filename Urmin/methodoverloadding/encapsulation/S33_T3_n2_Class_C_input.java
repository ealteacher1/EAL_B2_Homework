package methodoverloadding;

public class S33_T3_n2_Class_C_input {

	public static void main(String[] args) {
		// 2)Create a new Class and create 2 Private method with input parameter , 
		//Call them from another Class
	}

	private void pin1(int x){
		
		System.out.println("Print private method with parameter" + x);
	}
	private void pin2(String y) {
		System.out.println("Print private method with parameter" + y);
	}
	
	
	public void newpin(int x) {
		pin1(x);//
	}
	public void newpin2(String y) {
		pin2(y);
}
}