package dbinarysearch;

public class A1BinarySearch {

	public static boolean searchBinary(int[] arr, int target) {
		
		int n = arr.length, left = 0, right = n - 1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(arr[mid] == target) {
				return true;
			} else if(target < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		
		return false;
	}
	
	public static boolean binarySearch(int[] arr, int target, int left, int right) {
		if(left > right) {
			return false;
		}
		
		int triplet = (right - left) / 3;
		int mid1 = left + triplet;
		int mid2 = right - triplet;
		
		if(arr[mid1] == target || arr[mid2] == target) {
			return true;
		} else if(target < arr[mid1]) {
			return binarySearch(arr, target, left, mid1 - 1);
		} else if(target > arr[mid2]) {
			return binarySearch(arr, target, mid2+1, right);
		} else {
			return binarySearch(arr, target, mid1+1, mid2-1);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3, 4, 6, 7, 9, 12, 16, 17};
		int target = 12;
//		System.out.println(binarySearch(arr, 19, 0, arr.length - 1));
		System.out.println(searchBinary(arr, target));
	}
}
