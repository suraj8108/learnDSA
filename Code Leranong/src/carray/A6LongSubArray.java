package carray;

import java.util.HashMap;
import java.util.Map;

public class A6LongSubArray {
	
	// Map Hashing Technique
	public static void findLongestSubarray2(int[] arr, int k) {
		Map<Integer, Integer> track = new HashMap<>();
		int n = arr.length;
		int prefixSum = 0;
		int result = 0;
		
		track.put(0, 0);
		for(int i = 0; i < n; i++) {
			prefixSum += arr[i];
			int leftElement = prefixSum - k;
			if(track.containsKey(leftElement)) {
				int leftIndex = track.get(leftElement);
				int range = i - leftIndex + 1;
				result = Math.max(result, range); 
			}
			if(!track.containsKey(prefixSum)) {
				track.put(prefixSum, i+1);
			}
		}
		
		System.out.println("Hashing Technique" + result);
	}
	
	// Two pointer technique
	public static void findLongestSubarray1(int [] arr, int k) {
		int n = arr.length;
		int i = -1;
		int j = 0;
		int sum = 0;
		int result = 0;
		
		while( j < n ) {
			int tempSum = sum + arr[j];
			if(tempSum > k) {
				i++;
				sum -= arr[i];
			} else {
				sum = tempSum;
				j++;
			}
			result = sum == k ? Math.max(result, j - i - 1) : result;
		}
		System.out.println("Two Pointer Technique" + result);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {2,3,5,1,9,4,4,1,1,-1,1};
		findLongestSubarray1(arr, 5);
		findLongestSubarray2(arr, 10);
	}
}
