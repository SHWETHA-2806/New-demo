package calcii;
import java.util.Scanner;
public class claciEg 
{
	public static void main(String[]args)
	{
		double a,b,c,tot=0;
		Scanner n= new Scanner(System.in);
		System.out.println("Enter numbers:");
		a=n.nextDouble();
		b=n.nextDouble();
		System.out.println("1.ADD\t 2.SUB\t 3.MULTI 4.DIV\t 5.MOD");
		c=n.nextInt();
		if(c==1)
		{
			tot=a+b;
			System.out.println("Ans:"+tot);
		}
		else if (c==2)
		{
			tot=a-b;
			System.out.println("Ans:"+tot);
		}
		else if (c==3)
		{
			tot=a*b;
			System.out.println("Ans:"+tot);
		}
		else if (c==4)
		{
			tot=a/b;
			System.out.println("Ans:"+tot);
		}
		else if (c==5)
		{
			tot=a%b;
			System.out.println("Ans:"+tot);
		}
		else
		{
			System.out.println("Enter correct Arithmetic operation");
		}
	}
	
}
