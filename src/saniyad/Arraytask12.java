package saniyad;

public class Arraytask12 {
	public static void main(String[] args) {
		int [] months=new int[10];
		months[1]=4;
		months[7]=22;
		months[9]=44;
		System.out.println("The length of the array "+months.length);
		System.out.println("all the value below:");
		for(int i=0;i<months.length;i++) {
			System.out.println(months[i]);
		}
		System.out.println("The value of index number 5="+months[5]+  " index 7="+months[7]);
	}
}