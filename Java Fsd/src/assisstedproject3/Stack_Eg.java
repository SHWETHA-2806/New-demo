package assisstedproject3;

public class Stack_Eg {

	 
	    	static final int MAX = 1000; 
	    	int up; 
	    	int a[] = new int[MAX];  
	  	boolean isEmpty() 
	    	{ 
	        		return (up < 0); 
	    	} 
	    	Stack_Eg() 
	    	{ 
	        		up = -1; 
	    	} 
	  	boolean push(int x) 
	    	{ 
	        		if (up >= (MAX-1)) 
	        		{ 
	            			System.out.println("Stack Overflow"); 
	            			return false; 
	        		} 
	        		else
	        		{ 
	            			a[++up] = x; 
	            			System.out.println(x + " pushed into stack"); 
	            			return true; 
	        		} 
	    	} 
	int pop() 
	    	{ 
	        		if (up < 0) 
	        		{ 
	            			System.out.println("Stack Underflow"); 
	            			return 0; 
	        		} 
	        		else
	        		{ 
	            			int x = a[up--]; 
	            			return x; 
	        		} 
	    	} 
	    
	    	public static void main(String args[])
	{
	        		Stack_Eg s = new Stack_Eg(); 
	        		s.push(10); 
	        		s.push(20); 
	        		s.push(30); 
	        		System.out.println(s.pop() + " Popped from stack"); 
	    	}
	} 	


