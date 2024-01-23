package Task11;

public class StringIndexOutExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "example";  
		
		try {  
		    String substring = s.substring(2, 8); // throws StringIndexOutOfBoundsException  
		} catch (StringIndexOutOfBoundsException e) {  
		    // catch the exception and log an error message  
		    System.err.println("String index is out of bounds: " + e.getMessage());  
		      
		    
		}  
		  
		    }  
        
	}

