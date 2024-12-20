package carray;

import java.util.List;

public class A9KadanesAlgorithm {
	
	public static int kadensAlgorithm(List<Integer> arr) {
		int n = arr.size();
		int sum = 0;
		int maxElement = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			int temp = sum + arr.get(i);
			if(temp < 0) {
				sum = 0;
			} else {
				sum = temp;
			}
			maxElement = Math.max(maxElement, sum);
		}
		
		return maxElement;
		
	}
	
	public static void main(String[] args) {
		List<Integer> arr = List.of(2,1,-3,5, 6, -33,4,-3);
		int maxElement = kadensAlgorithm(arr);
		System.out.println("Maximum Subarray Value " + maxElement);
	}
}
