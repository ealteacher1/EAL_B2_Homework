package inheritance;

public class S68_T5_downcasting {

	public static void main(String[] args) {
		
		 // Down casting and object conversion
		
		
		S68_T5_C1 c1 = new S68_T5_C1();
		S68_T5_C2 c2 = (S68_T5_C2) c1; // Down casting C1 to C2
		S68_T5_C3 c3 = (S68_T5_C3) c2; // Down casting C2 to C3
		S68_T5_C4 c4 = (S68_T5_C4) c3; // Down casting C3 to C4
        
        
        
        c2.print();
        c3.print();
        c4.print();
		
	}

}
