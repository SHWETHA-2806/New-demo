package LoSuSeq_Eg;

	class longestSubSeq  {
		static int lis(int nums[])
	    {
	        int[] t = new int[nums.length];
	        int s = 0;
	        for (int x : nums) {
	            int i = 0, j = s;
	            while (i != j) {
	                int m = (i + j) / 2;
	                if (t[m] < x)
	                    i = m + 1;
	                else
	                    j = m;
	            }
	            t[i] = x;
	            if (i == s) ++s;
	        }
	        return s;
	    }
		
		public static void main(String args[]) {
			System.out.println("Finding longest increasing subsequence.");
			int arr[] = {10,9,2,5,3,7,101,18};
			System.out.println("Answer :"+(lis(arr)));
		}
	}
	

