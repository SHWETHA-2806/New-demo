package assisstedproject;

public class InnerClassEg2 {

	

	private String mobj="This is Inner Class";

	 void display(){  
		 class Incl{  
			 void msg(){
				 System.out.println(mobj);
			 }  
	  }  
	  
	  Incl c =new Incl();  
	  c.msg();  
	 }  

	 
	public static void main(String[] args) {
		InnerClassEg2  ob=new InnerClassEg2 ();  
		ob.display();  
		}
	}


