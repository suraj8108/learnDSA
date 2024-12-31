package dbinarysearch;

public class A5LastOccurence {

	public static void getLastOccurence(int[] arr, int target) {
		
		int n = arr.length, left = 0, right = n - 1;
		int ans = -1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			if(arr[mid] == target) {
				ans = mid;
				left = mid + 1;
			} else if(target < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		System.out.println("Last index of that element is " + ans);
	}
	public static void main(String[] args) {
		int[] arr = new int[]{3,4,13,13,13,20,40};
		int target = 13;
		getLastOccurence(arr, target);
	}
}
