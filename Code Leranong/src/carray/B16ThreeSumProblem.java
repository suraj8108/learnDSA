package carray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class B16ThreeSumProblem {

	//Using Three Pointer
	public static void findSumPointers(List<Integer> arr) {
		int n = arr.size();
		arr.sort(null);
		
		Set<List<Integer>> result = new HashSet<>();
		
		for(int i = 0; i < n; i++) {
			
			// Skip Duplicates
			if(i > 0 && arr.get(i) == arr.get(i-1)) {
				continue;
			}
			
			int toFind = -1*arr.get(i);
			int left = i  + 1;
			int right = n - 1;
			
			while(left < right) {
				// Remove duplicates
				if(left > i + 1 && arr.get(left) == arr.get(left - 1)) {
					left++;
					continue;
				}
				// Remove duplicates	
				if(right < n - 1 && arr.get(right) == arr.get(right + 1)) {
					right--;
					continue;
				}
				int sum = arr.get(left) + arr.get(right);
				if(sum == toFind) {
					List<Integer> triplet = List.of(arr.get(left), arr.get(right), arr.get(i));
					result.add(triplet);
					left++;
				} else if(sum > toFind) {
					right--;
				} else {
					left++;
				}
			}
		}
		System.out.println(result);
	}
	
	// Using Hashing
	public static void findSum(List<Integer> arr) {
		Set<List<Integer>> result = new HashSet<>();
		
		int n = arr.size();
		
		for(int i = 0; i < n; i++) {
			Set<Integer> setArr = new HashSet<>();
			
			for(int j = i + 1; j < n; j++) {
				int sum = arr.get(i) + arr.get(j);
				int toFind = sum*-1;
				if(setArr.contains(toFind)) {
					List<Integer> triplets = new ArrayList<>();
					triplets.add(arr.get(i));
					triplets.add(arr.get(j));
					triplets.add(toFind);
					
					triplets.sort(null);
					result.add(triplets);
				}
				setArr.add(arr.get(j));
			}
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		Collections.addAll(arr, -1,0,1,2,-1,-4);
		
//		findSum(arr);
		findSumPointers(arr);
	}
}
