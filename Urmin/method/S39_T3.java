package urmin;

public class S39_T3 {

	public static void main(String[] args) {
		
		//since this string value always put "" mark after each name
	
		String colors [] = { "red", "blue", "green", "black", "grey"};
		
		
		
		System.out.println(colors.length);

		
		//for each loop
		for(String a: colors) {
	    System.out.println(a);
       }

		System.out.println("Print the value of the index number 2: " + colors [2] );
		
		System.out.println("Print the value of the index number 3: " + colors [3] );
		
	
         // for loop
     
      for (int x = 0; x < colors.length; x++) {
    	  
        
    	  
		System.out.println(colors[x]);
	
      }
    
	
	for (int x= colors.length-1; x>=0; x--) {
		System.out.println("Print the value of the index " + x + ":" + colors[x]);
		
		for(int a =4; a>=2; a--) {
			System.out.println("Print the value of the index " + a + ":" + colors[a]);
		}
	}
	}
	
}