package dbinarysearch;

public class A2LowerBound {
	
	
	public static int findUpperBound(int[] arr, int target) {
		int n = arr.length, left = 0, right = n - 1;
		int ans = n;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(target < arr[mid]) {
				ans = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		
		return ans;
	}
	
	public static int findLowerBound(int[] arr, int target) {
		int n = arr.length, left = 0, right = n - 1;
		int ans = n;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(target <= arr[mid]) {
				ans = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {9,9,9,12,15,19};
		int target = 9;
		System.out.println("Lower Bound " + findLowerBound(arr, target));
		System.out.println("Upper Bound " + findUpperBound(arr, target));
	}
}
