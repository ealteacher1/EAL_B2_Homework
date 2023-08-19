package slideClass2930;

public class Arraytask16 {

	public static void main(String[] args) {
		String [] fruits =  new String[11];
		fruits[1]="Mango";
		fruits[3]="Cherry";
		fruits[6]="Guava";
		System.out.println("Length Of Fruits Array "+fruits.length );
		for(String newFruits:fruits) {
			System.out.println(newFruits);
		}
	}

}
