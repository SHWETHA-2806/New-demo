package assisstedproject;
public class stringEg {

	public static void main(String[]args)
	{
		System.out.println("String Methods");
		String a=new String("Shwetha");
		System.out.println("length -"+(a.length())); 
		
		String x1="pen";
		String x2="paper";
		System.out.println("Compare -"+(x1.compareTo(x2)));
     
		String ob=new String("Programme");
		System.out.println("Substring -"+(ob.substring(3)));
		
		String lo ="COMputer";
		System.out.println("LowerCase -"+(lo.toLowerCase()));

		String up ="keyBoard";
		System.out.println("UpperCase -"+(up.toUpperCase()));

		String em="yy";
		System.out.println("Empty -"+(em.isEmpty()));
		
		String re="Garnd";
		String replace=re.replace('a','r');
		System.out.println("Replace -"+(replace));

		String x="Arimetic Number";
		String y="aRithmetic nuMber";
		System.out.println("Equals -"+(x.equals(y)));
 
		System.out.println("\n");
		System.out.println("String Buffer");
		

		StringBuffer sb=new StringBuffer("This is");
		sb.append("String Buffer...");
		System.out.println(sb);

		sb.insert(4, 's');
		System.out.println("Insert -"+(sb));


		StringBuffer s=new StringBuffer("Java Class");
		s.replace(2, 3, "aIa");
		System.out.println("Replace -"+(s));

	
		s.delete(1, 4);
		System.out.println("Delete -"+(s));
		
		
		System.out.println("\n");
		System.out.println("String Builder");
		StringBuilder sbb=new StringBuilder("Be");
		sbb.append("Happy");
		System.out.println(sbb);

		System.out.println("Delete -"+(sbb.delete(1,3)));

		System.out.println("Insert -"+(sbb.insert(1,"Always")));

		System.out.println("Reverse -"+(sbb.reverse()));
				
		
		System.out.println("\n");
		System.out.println("Conversion of Strings to String Buffer and String Builder");
		
		String str = "Hello World"; 
        
        
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to String Buffer - "+(sbr));
        
          
      
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("Morning!!"); 
        System.out.println("String to String Builder - "+(sbl));
                   		
	}
}





		
		

	
