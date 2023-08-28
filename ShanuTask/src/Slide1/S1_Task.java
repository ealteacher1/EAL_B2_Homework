package Slide1;

public class S1_Task {

	public static void main(String[] args) {
		int a=10;
		int b=3;
		int c=12;
		float f=0.123f;
		double d=40.2;
		int e=a+b+c;
		double g=f+d+c;
		String h="the value of ";
	//1
		System.out.println(h+" int+int+int is "+e);
		//2
		int x=5;
		String s=" hello world ";
	//2
		System.out.println(h+" int+String+int is "+x+s+a);
	//3
		System.out.println(h+" float+double+int is "+g);
	//4
		System.out.println(h+s+(f+b));
	//5
		System.out.println(f+a+s);
		
	//6
		System.out.println(f+a+d+f);
	//7
		System.out.println(h+(a+d)+s);
	//8
		System.out.println(s+a+h+b);
	//9
		System.out.println(a+b+s+(a+b+c));
		
	}




	}


