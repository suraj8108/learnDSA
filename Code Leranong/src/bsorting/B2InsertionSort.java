package bsorting;

import java.util.Arrays;

public class B2InsertionSort {
	
	public static void insertionSort(float [] arr) {
		int n = arr.length;
		
		int index = 0;
		
		while(index < n) {
			int minIndex = index;
			for(int i = index+1; i < n; i++) {
				if(arr[i] < arr[minIndex]) {
					minIndex = i;
				}
			}
			float temp = arr[index];
			arr[index] = arr[minIndex];
			arr[minIndex] = temp;
			index++;
//			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void main(String[] args) {
		float[] arr = new float[] {6,39,4,2,24,245};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
