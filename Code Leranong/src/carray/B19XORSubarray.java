package carray;

import java.util.HashMap;
import java.util.Map;

public class B19XORSubarray {

	public static void findXORCount(int[] arr, int target) {
		int n = arr.length;
		int result = 0;
		Map<Integer, Integer> track = new HashMap<>();
		int prevXOR = 0;
		track.put(0, 1);
		
		for(int i = 0; i < n; i++) {
			prevXOR ^= arr[i];
			
			int toFind = prevXOR^target;
			int count = track.getOrDefault(toFind, 0);
			result += count;
			
			count = track.getOrDefault(prevXOR, 0);
			count++;
			track.put(prevXOR, count);
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {4, 2, 2, 6, 4};
		findXORCount(arr, 6);
	}
}
