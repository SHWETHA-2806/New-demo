package Objclas_oops;


	class Student{  
		 int id;  
		 String name;
		
		}   
		class ObjClasEg{  
		 public static void main(String args[]){  
		  Student s1=new Student();  
		  Student s2=new Student();   
		  s1.id=101;  
		  s1.name="Kala";  
		  s2.id=102;  
		  s2.name="Mala";  
		  System.out.println(s1.id+" "+s1.name);  
		  System.out.println(s2.id+" "+s2.name);  
		 }  
		} 

