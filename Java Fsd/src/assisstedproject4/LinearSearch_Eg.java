package assisstedproject4;
import java.util.Scanner;
public class LinearSearch_Eg {
		public static void main(String[] args) {
			int arr[]={22,5,78,3,55,9,12,17};
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a element to be searched");
			int key=scan.nextInt();
			//search for key
			boolean found=false;
			for(int val : arr){
				if(val==key){
					found=true;
					break;
				}	
			}
			
			if(found==true)	
			System.out.println("Element is present");
			
			else
				System.out.println("Element is not present");
		}
	}