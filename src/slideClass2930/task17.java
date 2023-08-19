package slideClass2930;

public class task17 {

	public static void main(String[] args) {
		int i=-500;
		System.out.println("While Loop Result");
		while(i<=-200) {
			System.out.println(i);
			i++;
			if(i==-278) {
				break;
			}
		}
		
		int j=-500;
		System.out.println("Do While Loop Result");
		do {
			if(j==-278) {
				break;
			}
			System.out.println(j);
			j++;
			
		}
		while(j<=-200);
			
		{
			System.out.println("For Loop Result");
			for(int k=-500;k<=-200;k++) {
				if(k==-278) {
					break;
				}
				System.out.println(k);
				
			}
		}


	}

}
