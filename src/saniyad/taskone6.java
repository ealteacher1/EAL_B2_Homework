package saniyad;

public class taskone6 {

	public static void main(String[] args) {
		int i=-5;
		System.out.println("While Loop Result");
		while(i<=5) {
			System.out.println(i);
			i++;
			if(i==3) {
				break;
			}
		}
		
		int j=-5;
		System.out.println("Do While Loop Result");
		do {
			if(j==3) {
				break;
			}
			System.out.println(j);
			j++;
			
		}
		while(j<=5);
			
		{
			System.out.println("For Loop Result");
			for(int k=-5;k<=5;k++) {
				if(k==3) {
					break;
				}
				System.out.println(k);
				
			}
		}

	}

}


