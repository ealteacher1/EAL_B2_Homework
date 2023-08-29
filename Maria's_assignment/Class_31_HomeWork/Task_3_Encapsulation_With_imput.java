package Class_31_HomeWork;

public class Task_3_Encapsulation_With_imput {

	public static void main(String[] args) {
		//Create a new Class and create 2 Private method with input parameter ,Call them from another Class 

		Task_3_Encapsulation_With_imput ob= new Task_3_Encapsulation_With_imput();
		ob.maria(60000,87000,54600);
		ob.monthly_salary(21000,4390,547600,12300);
	}

	private void maria(int a,int d,int r) {
		int ab=60000;
		int df=87000;
		int jfk=54600;
		int total=ab+87000+54600;
		System.out.println(total);
	}
	public void maria12() {
		maria(60000,87000,54600);
	}
	
	private void monthly_salary(int q,int w,int s,int r) {
		int xz=21000;
		int cv=4390;
		int fd=547600;
		int tr=12300;
		int gross_salary=xz+cv+fd+tr;
		System.out.println(gross_salary);
	}
	
	public void monthly_gross() {
		monthly_salary(21000,4390,547600,12300);
	}
	
	
	
	
	
	
	
	
	
}
