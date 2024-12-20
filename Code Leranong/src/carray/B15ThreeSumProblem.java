package carray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B15ThreeSumProblem {

	public static void findSum(List<Integer> arr) {
		Map<Integer, List<Integer>> track = new HashMap<>();
		
		int n = arr.size();
		
		for(int i = 0; i < n; i++) {
			
			for(int j = i + 1; j < n; j++) {
				List<Integer> trackValues = new ArrayList<>();
				int key = arr.get(i) + arr.get(j);
				track.put(key, trackValues);
			}
		}
	}
	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		Collections.addAll(arr, 0, -1, 2, -3, 1);
		
		findSum(arr);
	}
}
