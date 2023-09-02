package slide7;

public class S7_T_3_Wrapper_ {
	
	/*1. Convert "1050" from String to Integer. 
      2. Convert "false" From String to Boolean .
      3. Convert " 10.22" From String to Double*/
	public static void main(String[] args) {
		S7_T_3_Wrapper_ ob= new S7_T_3_Wrapper_();
		
		ob.StringTOInt();
		ob.StringTOBoolean();
		ob.StringTODouble();
	}
	
	public void StringTOInt() {
		String s= "1050";
	
		System.out.println(s+10);
		int i=Integer.parseInt(s);
		System.out.println(i+10);
	}
	public void StringTOBoolean() {
		String x="false";
		boolean b= Boolean.parseBoolean(x);
		System.out.println(b);
	}
	public void StringTODouble() {
		String y="10.22";
		double d=Double.parseDouble(y);
		System.out.println(d);
	}

}
