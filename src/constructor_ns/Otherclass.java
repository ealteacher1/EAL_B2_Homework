package constructor_ns;

public class Otherclass {
		public static void main(String[] args) {
			
		} 
	    public static void callingConstructors() {
	    	System.out.println("Calling all the constructors from Class_D");
		        
	    	new Class_D();
			new Class_D(115);
			new Class_D(25,35);
			new Class_D("WORLD");
			new Class_D('B');
	    	
	  		  
   }
	    
		
	    
}


