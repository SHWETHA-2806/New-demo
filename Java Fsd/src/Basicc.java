
import java.util.Scanner;
public class Basicc {
	public static void main(String [] args)
	{
		
		int x,val=1;
		Scanner n = new Scanner (System.in);
		System.out.println("Enter no: \n");
		x=n.nextInt();
		for(int i=1; i<=x ; i++)
		{
			val=val*i;
			
		}
		System.out.println("Fact of "+x+"is"+val);
		
	}

}
