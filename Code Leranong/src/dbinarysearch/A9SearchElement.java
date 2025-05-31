package dbinarysearch;

public class A9SearchElement {

	public static void searchElement(int [] arr) {
		int n = arr.length, left = 0, right = n - 1;
		int ans = -1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(mid % 2 == 0) {
				if(mid + 1 < n && arr[mid] == arr[mid+1]) {
					left = mid + 1;
					ans = mid;
				} else {
					right = mid - 1;
				}
			} else {
				if(mid > 0 && arr[mid] == arr[mid - 1]) {
					left = mid + 1;
					ans = mid;
				} else {
					right = mid - 1;
				}
			}
		}
		System.out.println(arr[ans + 1]);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,1,2,2,3,3,4,4,5,5,6,6,7};
		
		searchElement(arr);
	}
}
