package geeksforgeeks.array;

public class TrappingRainWaterProblem {
	public static void main(String[] args) {

		int[] arr = { 8, 8, 2, 4, 5, 5, 1 };
		int n = arr.length;
		int ans = trappingWater(arr, n);

		System.out.println(ans);
	}

	static int trappingWater(int[] arr, int n) {

		int res = 0;
		// Your code here
		for(int i = 1; i < n - 1; i++)
	    {
	         
	        // Find maximum element on its left
	        int left = arr[i];
	        for(int j = 0; j < i; j++)
	        {
	            left = Math.max(left, arr[j]);
	        }
	 
	        // Find maximum element on its right
	        int right = arr[i];
	        for(int j = i + 1; j < n; j++)
	        {
	            right = Math.max(right, arr[j]);
	        }
	 
	        // Update maximum water value
	        res += Math.min(left, right) - arr[i];
	    }
	    return res;
	}

}
