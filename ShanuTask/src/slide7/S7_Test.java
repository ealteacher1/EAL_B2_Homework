package slide7;

public class S7_Test {
	
	// a. Create those 5 types Interface type Global Variable and 3 Class Type Global Variable
	// b. Create 3 non Static methods in the same Test Class 
	//c. Put values for all Global Variables in All Methods.
	
	  Bank account= new S7_T_1_C2_B();  //its interface type global variable, it can declared only in class
	  S7_T_1_C_Car wheel;                                // its values its implements class
	Hospital hp;
	Interface4 inter4;
	Interface5 inter5;
	
	S7_t_1_Cl_A class1= new S7_t_1_Cl_A();//its class type global variable
	S7_T_1_C2_B class2;  
	S7_T_1_C3_AB class3 ; // its value always its object
	public static void main(String[] args) {
		S7_Test test= new S7_Test();
		test.N_Sm1();
		test.N_Sm2();
		test.N_Sm3();
	}
	
       public void N_Sm1() {
    	   account= new S7_T_1_C2_B();
    	   inter4 = new S7_T_1_C2_B();
    	   inter5= new S7_T_1_C3_AB();
    	   wheel= new S7_t_1_Cl_A(); 
    	   hp= new S7_T_1_C3_AB();
    	   
}
       public void N_Sm2() {
    	   class1=  new S7_t_1_Cl_A();
    	   
    	   class2=new S7_T_1_C2_B();	
    	   class3= new S7_T_1_C3_AB ();
       }
       public void N_Sm3() {
    	   S7_t_1_Cl_A class1 = new S7_t_1_Cl_A();
    	   S7_T_1_C2_B class2 = new S7_T_1_C2_B();
    	   S7_T_1_C3_AB class3 = new S7_T_1_C3_AB ();
    	   Bank account= new S7_T_1_C2_B();
    	   Interface4 inter4 = new S7_T_1_C2_B();
    	   Interface5 inter5= new S7_T_1_C3_AB();
    	   S7_T_1_C_Car wheel= new S7_t_1_Cl_A(); 
    	   Hospital  hp= new S7_T_1_C3_AB();
       }

}
