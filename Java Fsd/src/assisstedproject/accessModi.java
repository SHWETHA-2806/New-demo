package assisstedproject;

class defAccessSpeci {

	void display()
	{
		System.out.println("Numbers are:");
		int a=10,b=20;
		System.out.println(""+a+"\n"+b);
	}
}
public class accessModi
{
	public static void main(String [] args)
	{
		System.out.println("Default Access Specifier");
		defAccessSpeci obj = new defAccessSpeci();
		obj.display();
		
	}
}