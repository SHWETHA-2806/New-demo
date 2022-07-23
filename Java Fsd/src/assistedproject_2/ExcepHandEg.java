package assistedproject_2;

	class OwnException extends Exception{
		   String s1;
		   OwnException(String s2) {
			s1=s2;
		   }
		   public String toString(){ 
			return ("Own Exception Occurred -"+s1) ;
		   }
		}
		class ExcepHandEg{
		   public static void main(String args[]){
			try{
				System.out.println("Start try");
				throw new OwnException("error Message");
			}
			catch(OwnException ex){
				System.out.println("Catch Block") ;
				System.out.println(ex) ;
			}
		   }
		}
	
	

