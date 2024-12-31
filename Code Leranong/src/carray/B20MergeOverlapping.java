package carray;

import java.util.*;
import java.util.Arrays;

public class B20MergeOverlapping {

	public static void mergeArray(int[][] arr) {
		Arrays.sort(arr, (a, b) -> {
			int compare = Integer.compare(a[0], b[0]);
			if(compare == 0){
				return Integer.compare(a[1], b[1]);
			}
			return compare;
		});
				
		int n = arr.length;
		
		List<List<Integer>> result = new ArrayList<>();
		int left = arr[0][0];
		int right = arr[0][1];
		
		for(int i = 0; i < n; i++) {
			if( right < arr[i][0]) {
				result.add(List.of(left, right));
				left = arr[i][0];
				right = arr[i][1];
			} else {
				right = Math.max(right, arr[i][1]);
			}
		}
		result.add(List.of(left, right));
		System.out.println(result);
	}
	public static void main(String[] args) {
		int[][] arr = new int[][] {{1,3}, {8,10}, {2,6}, {15,18}};
		mergeArray(arr);
	}
}
