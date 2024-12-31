package dbinarysearch;

public class A6SearchRotatedArr {

	public static int findElement(int[] arr, int left, int right, int target) {
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(target == arr[mid]) {
				return mid;
			} else if(target < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}
	
	public static int findJunction(int[] arr) {
		int n = arr.length, left = 0, right = n - 1;
		int index = n;
		
		int target = arr[0];
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(arr[mid] >= target) {
				index = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}
		return index;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {4,1};
		int target = 4;
		int index = findJunction(arr);
		
		int searchIndex = findElement(arr, 0, index, target);
		if (searchIndex == -1) {
			searchIndex = findElement(arr, index+1, arr.length - 1, target);
		}
		System.out.println("Index position is " + searchIndex);
		
	}
}
