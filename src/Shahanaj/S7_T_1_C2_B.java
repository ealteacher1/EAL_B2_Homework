package Shahanaj;

public class S7_T_1_C2_B  implements Bank, Interface4{
	S7_T_1_C2_B class2;  //its class type global variable

	@Override
	public void cashOut() {
		System.out.println("class 2 override method");
	}

	@Override
	public void moneyTransfer() {
		System.out.println("class 2 override method");
	
		
	}

}
