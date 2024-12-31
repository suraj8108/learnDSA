package carray;

import java.util.ArrayList;
import java.util.List;

public class B24MaximumProduct {
	
	public static void findMaxProd(int[] arr) {
		int result = Integer.MIN_VALUE;
		int prefix = 0;
		int suffix = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(prefix == 0) prefix = 1;
			if(suffix == 0) suffix = 1;
			
			prefix *= arr[i];
			suffix *= arr[arr.length - i - 1];
			
			result = Math.max(result, Math.max(suffix, prefix));
		}
		
		System.out.println(result);
	}

	public static void findMaximumProductSubarray(int [] arr) {
		 int n = arr.length;
			List<List<Integer>> ranges = new ArrayList<>();
			int result = arr[0];
			int start = 0;
			for(int i = 0; i < n; i++) {
				if(arr[i] == 0) {
	                result = Math.max(result, 0);
					ranges.add(List.of(start, i - 1));
					start = i+1;
				} else if(i == n-1) {
					ranges.add(List.of(start, i));
				}
			}
			
			for(List<Integer> range : ranges) {
				int product = 1;
				int left = range.get(0);
				int right = range.get(1);
	            int cnt = 0;
				for(int i = left; i <= right; i++) {
					product *= arr[i];
	                cnt++;
				}
				if(product > 0 && cnt > 0) {
					result = Math.max(result, product);
					continue;
				}
				
				int leftProd = 1;
	            cnt = 0;
				for(int i = left; i <= right; i++) {
					leftProd *= arr[i];
	                cnt++;
					if(arr[i] < 0) {
						break;
					}
				}
	            if(cnt != right - left + 1){
	                leftProd = product / leftProd;
				    result = Math.max(result, leftProd);
	            }
				
	            cnt = 0;
				int rightProd = 1;
				for(int i = right; i >= left; i--) {
					rightProd *= arr[i];
					cnt++;
	                if(arr[i] < 0) {
						break;
					}
				}

	            if(cnt != right - left + 1){
	                rightProd = product / rightProd;
				    result = Math.max(result, rightProd);
	            }
				
			}
			
			System.out.println(result);
	}
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,-3,0,-4,-5};
		findMaximumProductSubarray(arr);
		findMaxProd(arr);
	}
}
