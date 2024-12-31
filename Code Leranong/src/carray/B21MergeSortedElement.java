package carray;

import java.util.Arrays;

public class B21MergeSortedElement {

	public static void mergeSortedArr(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		int index1 = n1 - 1;
		int index2 = 0;
		while(index1 >= 0 && index2 < n2) {
			if(arr1[index1] > arr2[index2]) {
				int temp1 = arr1[index1];
				arr1[index1] = arr2[index2];
				arr2[index2] = temp1;
				index1--;
				index2++;
			} else {
				break;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1) + " " + Arrays.toString(arr2));
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 4, 8, 10};
		int[] arr2 = new int[] {2, 3, 9};
		
		mergeSortedArr(arr1, arr2);
	}
}
