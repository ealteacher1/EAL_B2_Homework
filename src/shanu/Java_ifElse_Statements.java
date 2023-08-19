package shanu;

public class Java_ifElse_Statements {
	public static void main(String[]args) {
		int a=100;
		int b=50;
		if(a>100) {
			System.out.println("the condition if true");
		}
		else {
			System.out.println("the condition is false");
		}
		
		if(a<b||a>b) {
			System.out.println("the statement called OR logic");
		}else if(a>b){
			System.out.println("that is match");
		}else {
			System.out.println("not match");
		}
		if(b%5==0) {
			System.out.println("its called reminder");
		}
		else if(a%10==0) {
			System.out.println("that is even no.");
		}
		else {
			System.out.println("everything right");
	}
		
	//Task for grading
		int Math=60;
		int Science=66;
		int Physics=48;
		int Biology =74;
	//Calculating grading
		int average=(Math+Science+Physics+Biology)/4;
		System.out.println(average);
	//task for statements
		if (average>=90 && average <=100) {
			System.out.println("Grade of student A");
		}else if(average>=80 && average <=89 ){
			System.out.println("Grade of student B");
		}else if (average >=70 && average<=79) {
			System.out.println("Grade of student C");
		}else if(average>=60 && average<=69) {
			System.out.println("Grade of student D");
		}else {
			System.out.println("Program is successfull");
		}
		
		
	}
}
