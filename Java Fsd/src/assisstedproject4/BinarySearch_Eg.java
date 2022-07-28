package assisstedproject4;

import java.util.Scanner;

public class BinarySearch_Eg {
    public static  void main(String[] args){
	        int[] arr = {5,10,15,20,25};
	        Scanner scan=new Scanner(System.in);
			System.out.println("Enter a element to be searched");
			int key=scan.nextInt();
	        int arrlength = arr.length;
	        binarySearch(arr,0,key,arrlength);
	    }

	public static void binarySearch(int[] arr, int start, int key, int length){

	        int midValue = (start+length)/2;
	        while(start<=length){

	            if(arr[midValue]<key){

	                start = midValue + 1;
	            } else if(arr[midValue]==key){
	                System.out.println("Element is found at index :"+midValue);
	                break;
	            }else {

	                length=midValue-1;
	            }
	            midValue = (start+length)/2;
	        }
	            if(start>length){

	                System.out.println("Element is not found");
	            }

	}

	}

