package Shahanaj;

public class S7_T_5_Wrapper_Boxing {
	/*1. Convert double 5.5 to a Double object;
 2. Convert char '#' to a character Object;
 3. Convert int 500 to a Integer Object;
 4. Convert boolean false to a Boolean Object;*/

	public static void main(String[] args) {
		m1();
		m2();
		m3();
		m4();
		
	}
		public static void m1(){
			double d=5.5;
		
		//Double ob=new Double(d);//boxing : converting non premitive Datatype variable into a object
		Double ob=d;//autoboxing:coverting normal variable into object reference
		System.out.println(ob);
		
	}
		public static void m2(){
			
			char c='#';
			//Character ob= new Character(c);
			Character ob=c;
			System.out.println(ob);
			
		}
		public static void m3(){
			int i= 500;
			//Integer ob=new Integer(i);
			Integer ob= i;
			System.out.println(ob);
		}
		public static void m4(){
			boolean b= false;
			//Boolean ob=new Boolean(b);
			Boolean ob=b;
			System.out.println(ob);
		}
		
		

}
