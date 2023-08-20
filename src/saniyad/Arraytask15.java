package saniyad;

public class Arraytask15 {

	public static void main(String[] args) {
		int [] months=new int[10];
		months[4]=4;
		months[7]=22;
		months[8]=20;
		System.out.println("The length of the array "+months.length);
		for(int i=8;i>=4;i--) {
			System.out.println(months[i]);
		}

	}

}
