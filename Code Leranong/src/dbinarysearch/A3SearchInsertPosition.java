package dbinarysearch;

public class A3SearchInsertPosition {

	public static int searchInsertPosition(int[] arr, int target) {
		int n = arr.length;
		
		int left = 0, right = n - 1;
		int index = n;
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(target <= arr[mid]) {
				index = mid;
				right = mid - 1;
			} else {
				left = mid+1;
			}
		}
//		System.out.println(index);
		return index;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,4,7};
		int target = 2;
		System.out.println(searchInsertPosition(arr, target));
	}
}
