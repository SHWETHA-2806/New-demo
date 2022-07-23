package assistedproject_2;

public class FinallyEg {
  
	      public static void main(String args[]){   
	      try {    
	        System.out.println("try block");   
	        int data=7/0;    
	        System.out.println(data);    
	      }    
	      catch (ArithmeticException a){  
	        System.out.println("Exception handled");  
	        System.out.println(a);  
	      }   
	      finally {  
	        System.out.println("finally block executed");  
	      }       
	      }    
}  

