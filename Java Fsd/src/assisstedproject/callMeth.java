package assisstedproject;
public class callMeth 
	{

		int ans=1000;

		int methh(int val) {
			ans =ans*10;
			return(ans);
		}

		public static void main(String args[]) {
			callMeth objj = new callMeth();
			System.out.println("Before operation value of data is "+objj.ans);
			objj.methh(300);
			System.out.println("After operation value of data is "+objj.ans);
			}
		}



