package assisstedproject1;

public class InnerClassEg {

		 private String mobj="Hello Friends"; 
		 
		 class Inner{  
		  void hello(){System.out.println(mobj+", Java Inner Class");}  
		 }  

		public static void main(String[] args) {

			InnerClassEg obj=new InnerClassEg();
			InnerClassEg.Inner in=obj.new Inner();  
			in.hello();  
		}
	}



	





