package Slide6;

public class S6_t_1_inhe_TestShopping {

	public static void main(String[] args) {
		//S_6_T_1_Inheritance_Shopping ss=new S_6_T_1_Inheritance_Shopping();
		
		S6_T_1_inh_Amozon am= new S6_T_1_inh_Amozon();
		am.Buy();
		am.Add_to_cart();
		S6_t_1_inh_Walmart sw=new S6_t_1_inh_Walmart();
		sw.Buy();
		sw.Add_to_cart();
		S6_t_1_inh_Shane sh =new S6_t_1_inh_Shane ();
		sh.Add_to_cart();
		sh.Buy();
		S6_t_1_inh_PCRichard sp=new S6_t_1_inh_PCRichard ();
		sp.Add_to_cart();
		sp.Buy();
		 S6_T_1_inh_Ebay se= new  S6_T_1_inh_Ebay();
		 se.Add_to_cart();
		 se.Buy();
		 
		


	}

}
