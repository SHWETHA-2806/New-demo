package assisstedproject;

abstract class assissted3 {
	public abstract void display();
}
		public class InnerClassEg3{
		public static void main(String[] args) {
			assissted3 i = new assissted3() {

		         public void display() {
		            System.out.println("Thic is Anonymous Inner Class");
		         }
		      };
		      i.display();
		   }
		}


