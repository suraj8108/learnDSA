package dbinarysearch;

public class A8RotationIndex {

	public static void findRotateIndex(int[] arr) {
		int n = arr.length, left = 0, right = n - 1;
		int ans = Integer.MAX_VALUE, ansIndex = 0;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(arr[left] <= arr[right]) {
				if(arr[left] < ans) {
					ans = arr[left];
					ansIndex = left;
				}
				break;
			}
			
			if(arr[left] <= arr[mid]) {
				if(arr[left] < ans) {
					ans = arr[left];
					ansIndex = left;
				}
				left = mid + 1;
			} else {
				if(arr[mid] < ans) {
					ans = arr[mid];
					ansIndex = mid;
				}
				right = mid - 1;
			}
		}
		
		System.out.println((n - ansIndex) % n);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {5,1,2,3,4};
		findRotateIndex(arr);
	}
}
