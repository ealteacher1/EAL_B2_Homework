package Lubna;

public class Loop_1DimArray {

	public static void main(String[] args) {
		// Task 1: Please print 4 Questions below with all types of//
		//loops mentioned above. (While, Do While, For)//
		//Please Create Separate classes in the same Package// 
		//1. Print 2 to -10 //
		//2. Print 3 to 20; 
		//3. Print -355 to -255
		//4. Print -956 to -960 
		//5. Print -10 to 10
		//6. Print -5 to 5 and break if the value is 3
		//7. Print -500 to -200 and break if the value of the variable is -278//
		
		
		//Using while loop//
		int a = 2;
		while (a>=-10) {
			System.out.println(a);
			a--;
	
		}

		//Using do-while loop//
		int b =3;
		do {
			System.out.println(b);
			b--;
		}while(b>=-10);
		
		
		//Using for loop//
		
		for (int c = 2; c>=-10; c--) {
			System.out.println(c);
		}
		
		
		//Using whole loop//
		
		int d = 3;
		while(d<=20) {
		System.out.println(d);	
		d++;
		}
		
		//Using do-while loop//
		
		int e = 3;
		do {
			System.out.println(e);
			e++;
		}while (e <=20);
		
		
	//Using for loop//
		for (int f =3; f<=20; f++) {
			System.out.println(f);
		}
		
		
		//Using while//
		int g = -355;
		while (g<=-255);{
			System.out.println(g);
			g++;
		}
		
		//using do-while loop//
		
		int k = -355;
		do {
			System.out.println(k);
			k++;
		}while (k<=-255);
		
		
		//Using for loop//
		for (int l = -355; l<=-255; l++) {
			System.out.println(l);
		}
		
		//Using while loop//
		int m=-956;
		while (m>=-960) {
			System.out.println(m);
			m--;
		}
		
		//Using do-while loop//
		int n=-956;
		do {
			System.out.println(n);
			n--;
		}while (n>=-960);
		
		//Using for loop//
		for (int o =-956; o >=-960; k--) {
			System.out.println(o);
		}
		
		
	//Using while loop//
		int p = -10;
		while (p<=10) {
			System.out.println(p);
			p++;
		}
		
		//Using do-while loop//
		int q = -10;
		do {
			System.out.println(q);
			q++;
		}while(q<=10);
		
		//Using for loop//
		for(int u = -10; u <=10; k++) {
			System.out.println(u);
		}
		
		
		//Using while loop//
		int h= -5;
		while(h<=5) {
			System.out.println(h);
			if(h==3) {
				break;
			}
			
			
			//Using do-while loop//
			int j =-5;
			do {
				System.out.println(j);
				if (j==3) {
					break;
				}
				j++;
			}while (j<=5);
			
			//Using for loop//
			for (int z =-5; z <=5; z++) {
			System.out.println(z);
			if(z==3) {
				break;
			}
			}
			
			//Using while loop//
			int x = -500;
			while (x>-200) {
				System.out.println(x);
				if(x==-278) {
					break;
				}
				x--;
			}
			//Using do-while loop//
			int w =-500;
			do {
				System.out.println(w);
				if(w==-278) {
					break;
				}
				w--;
			}while(w>=-200); 
			
			//Using for loop//
			for (int v =-500; v >=-200; v--) {
				System.out.println(v);
				if (v==-278) {
					break;
				}
			}
		}
	}
	

}
