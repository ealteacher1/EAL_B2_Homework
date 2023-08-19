package shanu;

public class Return_with_no_arguments {

	public static void main(String[] args) {
	Object[][] Array2 = Array();
	for(Object[] x:Array2) {
		for(Object y:x) {
			System.out.println(y);
			
		}
	}
	for(int x=0;x<Array2.length;x++) {
		for(int y=0;y<Array2.length;y++) {
		System.out.println(Array2[x][y]);
		}
	}
		
	}
	
	public static boolean test2(String x) {
		boolean b=false;
		return b;
	}
	public static Object[][] Array() {
		Object[][]doubleArray= {{"shanusaafir@gmail.com",12},{"shahanaj2023@yahoo.com",32}};
		return doubleArray;
	
	}
}
