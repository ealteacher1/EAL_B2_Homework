package Sel7_1;

public class Sel8_5Setter_Getter {

	private int profit;
	
	public void expense() {
		
		Sel8_5Setter_Getter ob= new Sel8_5Setter_Getter();
		
		int expense=ob.profit -500;
		
		System.out.println(expense);
	}

	public void Tax() {
		
		Sel8_5Setter_Getter ob= new Sel8_5Setter_Getter();
		
		int tax=ob.profit - 2000;
		
		System.out.println(tax);
	}
	
	public void set(int profit) {
		this.profit=profit;
	}
	
	public int get() {
		return this.profit;
		
	}
}
