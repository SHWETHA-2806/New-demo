package assisstedproject;
public class methEg {
public int mulTi(int a,int b)
	{
		int tot=a*b;
		return tot;
	}
	public static void main(String[]args)
	{
		int ans;
		methEg obj=new methEg();
		System.out.println("Numbers are 12 and 6");
		ans=obj.mulTi(12,6);
		System.out.println("Multiplied Ans:"+ans);
	}
}
