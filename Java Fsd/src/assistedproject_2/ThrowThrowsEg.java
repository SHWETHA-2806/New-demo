package assistedproject_2;

import java.io.IOException;

public class ThrowThrowsEg {

	    static void met() throws IOException  
	    {  
	        System.out.println("Inside the method");  
	        throw new IOException("throwing IOException");  
	    }  
	     
	    public static void main(String args[])  
	    {  
	        try  
	        {  
	            met();  
	        }  
	        catch(IOException e)  
	        {  
	            System.out.println("caught in main() method");  
	        }  
	    }  
	} 

