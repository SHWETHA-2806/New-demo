package Objclas_oops;



	class Flower{  
		void smell(){System.out.println("Fragrance");}  
		}  
		class Rose extends Flower{  
		void red(){System.out.println("Rose");}  
		}  
		class Jasmine extends Flower{  
		void white(){System.out.println("Jasmine");}  
		}  
		class InheriEg{  
		public static void main(String args[]){  
		Jasmine j=new Jasmine();  
		j.white();  
		j.smell();  
		
		}}  


