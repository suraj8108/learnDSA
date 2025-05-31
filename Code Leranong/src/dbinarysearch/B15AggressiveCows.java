package dbinarysearch;

import java.util.Arrays;

public class B15AggressiveCows {

	public static boolean checkPossibility(int[] arr, int distance, int k) {
		int n = arr.length;
		int prevIndex = 0;
		k--;
		for(int i = 0; i < n; i++) {
			if(k == 0) {
				break;
			}
			if(arr[i] - arr[prevIndex] >= distance) {
				k--;
				prevIndex = i;
			}
		}
		return k == 0;
	}
	
	public static int maxPossibleDistance(int[] arr, int k) {
		int n = arr.length;
		int left = 1;
		int right = Arrays.stream(arr).max().getAsInt();
		Arrays.sort(arr);
		while(left <= right) {
			int mid = (left + right) / 2;
			
			boolean isPossible = checkPossibility(arr, mid, k);
			if(isPossible) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return right;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {4,2,1,3,6};
		int k = 2;
		
		System.out.println(maxPossibleDistance(arr, k));
	}
}
