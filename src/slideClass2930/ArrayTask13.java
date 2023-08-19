package slideClass2930;

public class ArrayTask13 {

	public static void main(String[] args) {
		int [] months=new int[10];
		months[1]=4;
		months[7]=22;
		System.out.println("The length of the array "+months.length);
		for(int i=months.length-1;i>=0;i--) {
			System.out.println(months[i]);
		}
		
	}

}
