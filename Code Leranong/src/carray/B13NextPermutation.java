package carray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class B13NextPermutation {
	
	public static void findNextPermutation(int[] arr) {
		
		int n = arr.length;
		
		int minElement = arr[n - 1];
		int breakPoint = -1;
		
		// Find the break point at which the minimum element is present
		for(int i = n - 1; i > 0; i--) {
			if(arr[i - 1] < arr[i]) {
				arr[n - 1] = arr[i - 1];
				arr[i - 1] = minElement;
				minElement = arr[i - 1];
				breakPoint = i;
				break;
			} 
		}
		
		if(breakPoint == -1) {
			for(int i = 0; i < n/2; i++) {
				int temp = arr[i];
				arr[i] = arr[n - i - 1];
				arr[n - i - 1] = temp;
			}
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		// Traverse and store the minimum element at the right position before the break point.
		for(int i = n - 1; i > breakPoint; i--) {
			if(arr[i] < arr[i - 1]) {
				int temp1 = arr[i];
				int temp2 = arr[i - 1];
				arr[i] = temp2;
				arr[i - 1] = temp1;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {5,4,3,2,1};
		findNextPermutation(arr);
	}

}
