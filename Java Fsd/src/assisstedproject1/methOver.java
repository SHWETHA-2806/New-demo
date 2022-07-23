package assisstedproject1;
public class methOver {
public void addi(int a,int b, int c)
{
	System.out.println("Addition ans ="+(a+b+c));
}
public void subb(int x, int y)
{
	System.out.println("Subtraction ans ="+(x+y));
}
public static void main(String [] args)
{
	methOver obj=new methOver();
	obj.addi(10, 20, 30);
	obj.subb(100, 30);
    
}
}
