package Shahanaj;

public class S7_T_2_Test_browser {
	
	static WebDriver dr;

	public static void main(String[] args) {
		
		//WebDriver dr=new GeckoDriver();
		 dr=new GeckoDriver();
		dr.get_url("www.amozan.com");
		dr.close();
		dr.quit();
		SafariBrowser();
		GeckoDriver();

	}
	public  static void SafariBrowser() {
		//WebDriver dr =new Safari();
		dr =new Safari();
		dr.get_url("https://www.walmart.com");
	}
	public  static void GeckoDriver() {
		//WebDriver dr=new GeckoDriver();
		 dr=new GeckoDriver();
		 dr.get_url("https://www.walmart.com");
	}

}
