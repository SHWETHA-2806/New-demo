package assisstedproject3;
import java.util.*;
public class Queue_Eg {

	public static void main(String[] args) 
	{
	        		Queue<String> ele = new LinkedList<>();
	        		 ele.add("Mercury");
	        		 ele.add("Venus");
	        		 ele.add("Earth");
	        		 ele.add("Mars");
	        		 ele.add("Jupiter");
	                System.out.println("Queue is : " +  ele);
	        		System.out.println("Head of Queue : " +  ele.peek());
	        		 ele.remove();
	        		System.out.println("After removing Head of Queue : " +  ele);
	        		System.out.println("Size of Queue : " +  ele.size());
	    	}
	}


