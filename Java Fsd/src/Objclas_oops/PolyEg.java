package Objclas_oops;


	class Shape{  
		void draw(){System.out.println("draw");}  
		}  
		class Rectangle extends Shape{  
		void draw(){System.out.println("It's rectangle");}  
		}  
		class Circle extends Shape{  
		void draw(){System.out.println("It's circle");}  
		}  
		class Triangle extends Shape{  
		void draw(){System.out.println("It's triangle...");}  
		}  
		class PolyEg{  
		public static void main(String args[]){  
		Shape s;  
		s=new Rectangle();  
		s.draw();  
		s=new Circle();  
		s.draw();  
		s=new Triangle();  
		s.draw();  
		}  
		}  

