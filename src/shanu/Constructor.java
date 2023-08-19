package shanu;

public class Constructor {

	public static void main(String[] args) {
		
		Constructor c=new Constructor();
		
	Object[][]abs=c.Array2();
	for(Object []a:abs) {
		for(Object d:a) {
			System.out.println(d);
		}
	}

	}
public  Object[][]Array2() {
	Object[][]Array3= {{"abc",12},{"cde",23},{"efg",34}};
	return Array3;
}
}
