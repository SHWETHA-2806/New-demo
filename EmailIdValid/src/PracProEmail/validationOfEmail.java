package PracProEmail;
import java.util.ArrayList;
import java.util.*;
public class validationOfEmail {
	public static void main(String[]args) {

	System.out.println("Email Validation check");
	ArrayList <String> arr =new ArrayList<String>();
	arr.add("front@gmail.com");
	arr.add("Game100@yahoo.com");
	arr.add("info80@.com");
	
	Scanner s= new Scanner(System.in);   
	System.out.print("Enter email id: ");  
	String str= s.nextLine();              
	for(String element: arr) 
	{
		if(element.equals(str))
		{
			System.out.print("Email Id is valid ");
		}
		
		else
		{
			System.out.println("Enter valid email");
		}
		break;
	}
	
	
	}
}

