package shanu;

public class Dowhile_loop {

	public static void main(String[] args) {
		
	//1
		int a=2;
		do {
			System.out.println(a+ " is the value of a");
			a--;
		}while(a>=-10);
	//	2
		int b=3;
		do {
			System.out.println(" the value of b is "+ b);
			b++;
		}while(b<=20);
	//3
		int c=-355;
		do {
			System.out.println(" the value of c is "+ c);
			c++;
		}while(c<=-255);
		int d=-956;
		do {
			System.out.println(" the value of d is "+ d);
			d--;
		}while(d>=-960);
	//4
		int e=-10;
		do {
			System.out.println(" the value of e is "+ e);
			
			if(e==3) {
				break;
			}e++;
		}while(e<=10);
		
	//5	
		int f=-5;
		do {
			System.out.println(" the value of f is "+ f);
			
			if(f==3) {
				break;
		}f++;
		}while(f<=5);
	//6
		int g=-500;
		do {
			System.out.println(" the value of g is "+ g);
			
			if(g==-278) {
				break;
				
		}g++;
		}while(g<=-200);
	}	
}
