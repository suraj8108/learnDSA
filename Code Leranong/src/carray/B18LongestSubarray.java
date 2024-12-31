package carray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class B18LongestSubarray {

	// Hashing Technique
	public static void longestSubarrayHash(int[] arr) {
		int prevCount = 0;
		int n = arr.length;
		int target = 0;
		Map<Integer, Integer> track = new HashMap<>();
		int result = -1;
		
		for(int i = 0; i < n; i++) {
			prevCount += arr[i];
			
			int findElement = prevCount - target;
			if(findElement == 0) {
				result = i+1;
				continue;
			}
			if(track.containsKey(findElement)) {
				int index = track.get(findElement);
				result = Math.max(i - index + 1, result);
			} else {
				track.put(prevCount, i);
			}
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {-1,-6,-2,-1,-2,-2,-2,-2,3,3,1,4, 9, 10};
		longestSubarrayHash(arr);
	}
}


