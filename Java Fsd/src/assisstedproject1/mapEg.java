package assisstedproject1;
import java.util.*;
public class mapEg {
	
	public static void main(String[]args)
	{
		System.out.println("Hash Map");
		HashMap<Integer,String>hm= new HashMap<Integer, String>();
		hm.put(10,"kamala");
		hm.put(11,"Vimala");
		hm.put(12,"Ramala");
		
		for(Map.Entry h:hm.entrySet()) {
		System.out.println(h.getKey()+" "+h.getValue());
		}
		System.out.println("\n");
		
		System.out.println("Hash Table");
		Hashtable<Double,String> ht = new Hashtable<Double,String>();
		ht.put(1.1,"A");
		ht.put(1.2,"B");
		ht.put(1.3,"C");
		
		for(Map.Entry t:ht.entrySet()) {
			System.out.println(t.getKey()+" "+t.getValue());
		}
		System.out.println("\n");
		
		System.out.println("Tree Map");
		TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
		tm.put("Aaa",10);
		tm.put("Bbb",7);
		tm.put("Ccc",5);
		
		for(Map.Entry m:tm.entrySet()) {
			System.out.println(m.getKey()+" - "+m.getValue());
		}
	}

}