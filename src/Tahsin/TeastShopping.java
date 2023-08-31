package Tahsin;

public class TeastShopping {

	public static void main(String[] args) {
        Amazon amazon = new Amazon();
        Wallmart wallmart = new Wallmart();
        Shane shane = new Shane();
        Pcrichard pcrichard = new Pcrichard();
        Ebay ebay = new Ebay();
        
        // Calling methods from the Parent class
        amazon.login();
        wallmart.creataccount();
        shane.buy();
        ebay.contact();
        pcrichard.logout();
        
	}      
        
}