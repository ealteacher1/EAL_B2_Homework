package My_Personal_Task;

public class T_1_Array_One_dim2_Sarder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inara []= new String [11];
		
		inara [0]= "Rana";
		inara [2]= "Fatima";
		inara [5]= "Rafa";
		
		/*
		 * for (int i =0; i<inara.length; i++) {
		 * 
		 * System.out.println(inara[i]); }
		 */
	
		/*
		 * System.out.println(inara[2]); 
		 * System.out.println(inara[4]);
		 */
		
		/*
		 * int i=0; 
		 * while (i<inara.length) { 
		 * 
		 * System.out.println(inara[i]); i++; 
		 * }
		 */
		
		/*
		 * int i=0; 
		 * do { 
		 * System.out.println(inara[i]); i++; 
		 * } 
		 * while (i<inara.length);
		 */
	
//		for (int i=inara.length-1; i>=0; i--) {
//			System.out.println(inara[i]);
//		}
		
			//System.out.println(inara.length);
			
			for (int i=4; i<inara.length-1; i++) {
			if (i>=7) {
				break;
			}
		  System.out.println(inara[i]);
		
		
	}

	}
}
