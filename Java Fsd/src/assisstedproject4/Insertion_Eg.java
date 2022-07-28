package assisstedproject4;

public class Insertion_Eg {
	    public static  void main(String[] args){

	        int[] arr = {4,8,42,32,20};
	        insertionSort(arr);
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	        System.out.println("Sorted elements:");
	        for(int i=0;i<arr.length;i++){

	            System.out.println(arr[i]);

	        }
	     }
	    public static void insertionSort(int[] arr){

	    int len = arr.length;
	    for(int j=1;j<len;j++){
	    int key = arr[j];
	    int i=j-1;
	    while ((i>-1) && (arr[i]>key)){

	        arr[i+1]=arr[i];
	        i--;
	    }
	    arr[i+1]=key;
	         }
	    }
	}
