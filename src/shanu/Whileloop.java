package loop;

public class Whileloop {

	public static void main(String[] args) {
	
	int a=2;
	while(a>=-10) {
		System.out.println("the value of a = "+a);
		a--;
	}
	int b=3;
	while (b<=20) {
		System.out.println("the value of b = "+b);
		b++;
	}
	int c=-355;
	while(c<=-255) {
		System.out.println("the value c = "+c);
		c++;
	}
		int d=-956;
		while (d>=-960) {
			System.out.println("the value of d ="+d);
			d--;
		}
		int e=-10;
		while(e<=10) {
			System.out.println("the value of e ="+e);
			e++;
		}
		int f=-5;
		while(f<=5) {
			System.out.println("the value of f="+f);
			if(f==3) {
				break;
			}
			
			f++;
		}
		
	
	int g=-500;
	while(g<=-200) {
		
		System.out.println("the value of g ="+g);
		if(g==-273) {
			break;	
		}
		
		g++;
	}

}
}
