package carray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A4UnionArray {

	public static void unionOfSortedArray(int [] arr1, int [] arr2) {
		List<Integer> result = new ArrayList<>();
		int n = arr1.length;
		int m = arr2.length;
		int i = 0;
		int j = 0;
		
		while(i < n && j < m) {
			int minElement ;
			if(arr1[i] < arr2[j]) {
				minElement = arr1[i];
				i++;
			} else {
				minElement = arr2[j];
				j++;
			}
			
			int resultLen = result.size();
			if(resultLen > 0) {
				int prevElement = result.get(resultLen - 1);
				if(prevElement != minElement) {
					result.add(minElement);
				}
			} else {
				result.add(minElement);
			}
			
		}
		
		while(i < n) {
			int prevElement = result.get(result.size() - 1);
			if(prevElement != arr1[i]) {
				result.add(arr1[i]);
			}
			i++;
		}
		
		while(j < m) {
			int prevElement = result.get(result.size() - 1);
			if(prevElement != arr2[j]) {
				result.add(arr2[j]);
			}
			j++;
		}
		
		System.out.println(result);
	}
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2,2,2,2,2,2,3,3,3,4,5};
		int[] arr2 = new int[] {2,3,4,4,5,6,7,7,8};
		
		unionOfSortedArray(arr1, arr2);
	}
}
