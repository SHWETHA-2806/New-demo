package assistedproject_2;

public class TryEg {

	
	    public static void main(String args[]) 
	    {
	        int[] arr ={18,6,7,4};
	        try 
	        {
	            System.out.println(arr[8]);
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Given Array index is invalid"); 
	        }
	        finally 
	        {
	            System.out.println("Try catch is over");
	        }
	    }
	}

	

