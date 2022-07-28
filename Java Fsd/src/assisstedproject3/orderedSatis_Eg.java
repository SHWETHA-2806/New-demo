package assisstedproject3;

public class orderedSatis_Eg 
{  
public void sortArr(int arr[])  
{  
int size = arr.length;  
  
for(int i = 0; i < size; i++)  
{  
int temp = i;  
for(int j = i + 1; j < size; j++)  
{  
if(arr[temp] > arr[j])  
{  
temp = j;  
}  
}  
if(temp != i)  
{  
int t = arr[i];  
arr[i] = arr[temp];  
arr[temp] = t;   
}  
}  
}  
   
public int findKthSmall(int arr[], int k)  
{  
sortArr(arr);  
  
return arr[k - 1];  
}  
  
public static void main(String argvs[])  
{  

	orderedSatis_Eg  obj = new orderedSatis_Eg ();  
  
int arr[] = {55,3,44,7,8,22,9,44,5};  
  
int size = arr.length;  
int k = 3;  
  
System.out.println("For the array: ");  
for(int i = 0; i < size; i++)  
{  
System.out.print(arr[i] + " ");  
}  
  
int ele = obj.findKthSmall(arr, k);  
  
System.out.println();  
System.out.println("The " + k + "rd smallest element of the array is: " + ele);  
  
System.out.println("\n");  
  
int arr1[] = {12,7,8,42,54,89,23,0,3,6};  
  
size = arr1.length;  
k = 4;  
  
System.out.println("For the array: ");  
for(int i = 0; i < size; i++)  
{  
System.out.print(arr1[i] + " ");  
}  
  
ele = obj.findKthSmall(arr1, k);  
  
System.out.println();  
System.out.println("The " + k + "th smallest element of the array is: " + ele);  
  
}  
} 
