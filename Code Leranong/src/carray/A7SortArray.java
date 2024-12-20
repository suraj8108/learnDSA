package carray;

import java.util.Arrays;

// Sort an array of 0s, 1s and 2s
public class A7SortArray {

	public static void sortArray(int[] arr) {
		int i = 0, j = 0, k = 0, index = 0;
		int n = arr.length;
		
		while(index < n) {
			if(arr[index] == 0) {
				arr[k] = 2;
				arr[j] = 1;
				arr[i] = 0;
				i++;
				j++;
				k++;
			} else if(arr[index] == 1) {
				arr[k] = 2;
				arr[j] = 1;
				j++;
				k++;
			} else {
				arr[k] = 2;
				k++;
			}
			index++;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {2,1,0,0,2,1,1,0,1,2,2,1,0,0,0,1,1,2};
		sortArray(arr);
		System.out.println(Arrays.toString(arr));
	}
}
