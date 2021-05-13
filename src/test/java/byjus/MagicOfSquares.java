package byjus;

public class MagicOfSquares {

	public static int MagicSquare(long arr[]) {

		long pre = 0;
		long min_pre = 0;
		long f = Long.MAX_VALUE;
		long ans = Long.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			f = Math.min(f, min_pre + arr[i] - arr[i] * arr[i]);
			pre = pre + arr[i];
			ans = Math.max(ans, pre - f);
			min_pre = Math.min(min_pre, pre);
		}

		return (int) ans;
	}

	public static void main(String[] args) {
		long arr[] = {3, -4, 2};
		
		System.out.println(MagicSquare(arr));
	}
	
	

}
