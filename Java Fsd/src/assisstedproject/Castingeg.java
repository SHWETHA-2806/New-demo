package assisstedproject;
public class Castingeg {

	public static void main(String[]args)
	{
		System.out.println("IMPLICIT CASTING");
		char a='S';
		System.out.println("Entered character:"+a);
		int b=a;
		System.out.println("Int val:"+b);
		float c=a;
		System.out.println("Float val:"+c);
		double d=a;
		System.out.println("Double val:"+d);
		long e=a;
		System.out.println("Long val:"+e);
		
		System.out.println("EXPLICIT CASTING");
		double x=70.55;
		System.out.println("Entered val:"+x);
		float y=(float)x;
		System.out.println("Float val:"+y);
		int z=(int)x;
		System.out.println("Int val:"+z);
		
	}
}
