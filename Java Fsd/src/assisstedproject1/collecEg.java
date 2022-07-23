package assisstedproject1;
import java.util.*;
public class collecEg {

	
	public static void main(String[]args)
	{
		System.out.println("Array List");
		ArrayList <Integer> arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		System.out.println(arr);
		
		System.out.println("Linked List");
		LinkedList <Double> lin =new LinkedList<Double>();
		lin.add(11.1);
		lin.add(12.2);
		lin.add(13.3);
		System.out.println(lin);
		
		System.out.println("Vector");
		Vector <String> vec=new Vector<String>();
		vec.add("Arun");
		vec.add("Eshwar");
		System.out.println(vec);
		
		System.out.println("Hash set");
		HashSet <Integer> hass=new HashSet<Integer>();
		hass.add(100);
		hass.add(101);
		hass.add(102);
		hass.add(103);
		System.out.println(hass);
		
		System.out.println("Linked Hash set");
		LinkedHashSet <String> linhass=new LinkedHashSet<String>();
		linhass.add("one");
		linhass.add("two");
		linhass.add("three");
		linhass.add("four");
		System.out.println(linhass);
		
		
		
	}
}
