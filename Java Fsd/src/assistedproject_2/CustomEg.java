package assistedproject_2;

	class InvalidMarkException  extends Exception  
	{  
	    public InvalidMarkException (String s)  
	    {  
	       
	        super(s);  
	    }  
	}  
	public class CustomEg  
	{  
	  
	   
	    static void Check (int Mark) throws InvalidMarkException{    
	       if(Mark < 50){  
	  
	         
	        throw new InvalidMarkException("Invalid Mark");    
	        }  
	       else {   
	        System.out.println("You Passed");   
	        }   
	     }    
	  
	  
	    public static void main(String args[])  
	    {  
	        try  
	        {  
	            Check(15);  
	        }  
	        catch (InvalidMarkException ex)  
	        {  
	            System.out.println("Caught the exception");  
	    
	              
	            System.out.println("Exception occured: " + ex);  
	        }    
	    }  
	}  

