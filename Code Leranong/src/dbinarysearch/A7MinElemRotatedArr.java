package dbinarysearch;

public class A7MinElemRotatedArr {
	
	public static void findMinimumElement(int[] arr) {
		int n = arr.length, left = 0, right = n - 1;
		int ans = 0;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			System.out.println(left + " " + right);
			if(arr[mid] >= arr[0]) {
				ans = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		ans = left >= n ? 0 : left; 
		System.out.println(arr[ans]);
	}
	
	public static void findMinimum(int[] arr) {
		int n = arr.length, left = 0, right = n - 1;
		int ans = Integer.MAX_VALUE;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(arr[left] <= arr[right]) {
				ans = Math.min(ans, arr[left]);
				break;
			}
			
			ans = Math.min(ans, arr[mid]);
			if(arr[mid] >= arr[left]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {5,1,2,3,4};
		findMinimum(arr);
//		findMinimumElement(arr);
	}

}
