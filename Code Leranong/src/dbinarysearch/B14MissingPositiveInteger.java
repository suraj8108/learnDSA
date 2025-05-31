package dbinarysearch;

public class B14MissingPositiveInteger {
	
	public static int findPositive(int[] arr, int k) {
		int n = arr.length;
		int left = 0;
		int right = n - 1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			if(arr[mid] - (mid + 1) < k) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return k + right  + 1;
		
	}

	public static void main(String[] args) {
		int[] arr = new int[] {2};
		int result =findPositive(arr, 1);
		System.out.println("Result is " + result);
	}

}
