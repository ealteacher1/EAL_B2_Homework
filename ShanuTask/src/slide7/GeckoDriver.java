package slide7;

public class GeckoDriver implements WebDriver {

	public GeckoDriver() {
		System.out.println("[f this constructor is called,firefox browser will be opened ");
		
	}
	@Override
	public void get_url(String URL) {
		System.out.println("this method for provided url");
	}


	@Override
	public void close() {
		System.out.println("it will close the current window");
		
	}

	@Override
	public void quit() {
		System.out.println("it will close all the window");
	}
		
	}

