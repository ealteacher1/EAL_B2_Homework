package urmin;

public class S40_T4 {

	public static void main(String[] args) {
		
		int a []= {10,20,30,40,50};
		System.out.println(a.length);
		
		//for each loop
		
		for(int d : a) {
			System.out.println(d);
			
		}
			
			//for loop
			
			for (int x=0; x<=a.length-1; x++) {
				System.out.println("Print the values" + x + ":" + a[x]);
			}
				
				//reverse order
				
			for (int b= a.length-1; b>=0; b--) {
				System.out.println("Print the value of index " + b + ":" + a[b]);
				
				//print all the value 5th index to 2nd index
				
				for (int c = 4; c>=2; c--) {
					System.out.println("Print the value on the index " + c +": " + a[c]);
					
				}
				
				
			}
			
		}
 

}


