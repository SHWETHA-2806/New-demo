package Objclas_oops;

	 abstract class Bike{  
	   Bike(){System.out.println("bike starts");}  
	   abstract void run();  
	   void gearSys(){System.out.println("gear changed");}  
	 }  
	 class Yamaha extends Bike{  
	 void run(){System.out.println("running safely");}  
	 }  
	 class AbstractEg{  
	 public static void main(String args[]){  
	  Bike obj = new Yamaha();  
	  obj.run();  
	  obj.gearSys();  
	 }  
	}
	

