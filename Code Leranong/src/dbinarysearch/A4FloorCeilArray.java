package dbinarysearch;

public class A4FloorCeilArray {

	public static void findFloor(int[] arr, int target) {
		int n = arr.length;
		int floor = 0, left = 0, right = n-1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			if(target < arr[mid]) {
				right = mid - 1;
			} else {
				floor = arr[mid];
				left = mid + 1;
			}
		}
		System.out.println("floor " + floor);
	}
	
	public static void findCeil(int[] arr, int target) {
		int n = arr.length;
		int ceil = n, left = 0, right = n-1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			if(target <= arr[mid]) {
				ceil = arr[mid];
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		System.out.println("Ceil " + ceil);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3, 4, 4, 7, 8, 10};
		int target = 5;
		findFloor(arr, target);
		findCeil(arr, target);
		
	}
}
