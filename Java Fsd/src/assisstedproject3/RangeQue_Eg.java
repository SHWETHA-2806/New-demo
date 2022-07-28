package assisstedproject3;

public class RangeQue_Eg {

	
	    static int x = 16;
	    static int n = 100000; 
	    static long table[][] = new long[n][x + 1]; 
	    static void bst(int arr[], int n) 
	    { 
	        for (int i = 0; i < n; i++) 
	            table[i][0] = arr[i]; 
	        for (int j = 1; j <= x; j++) 
	            for (int i = 0; i <= n - (1 << j); i++) 
	                table[i][j] = table[i][j - 1] + table[i + (1 << (j - 1))][j - 1]; 
	    } 
	    static long query(int l, int r) 
	    {
	        long ans = 0; 
	        for (int j = x; j >= 0; j--)  
	        { 
	            if (l + (1 << j) - 1 <= r)  
	            { 
	                ans = ans + table[l][j];
	                l += 1 << j; 
	            } 
	        } 
	        return ans ; 
	    }
	    public static void main(String args[]) 
	    { 
	        int arr[] = { 3, 7, 2, 5, 8, 9 }; 
	        int n = arr.length; 
	        bst(arr, n); 
	        System.out.println(query(1, 7)); 
	        System.out.println(query(2, 8)); 
	        System.out.println(query(1, 6)); 
	    } 
	}

