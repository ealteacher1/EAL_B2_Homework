package Shahanaj;

public class Safari implements WebDriver{

	public Safari() {
		System.out.println("[f this constructor is called,Safari browser will be opened ");
		
		
	}
	
	@Override
	public void close() {
		System.out.println("it will close the current window");
	}

	@Override
	public void quit() {
		System.out.println("it will close all the window");
	}
	@Override
	public void get_url(String URL) {
		System.out.println("this method for provided url");
	
	}

}
