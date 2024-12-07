package bsorting;

import java.util.Arrays;

public class B1BubbleSort {
	
	public static void bubbleSort(int []arr, int index) {
		int n = arr.length;
		
		if(n == index) {
			return;
		}
		
		for(int i = 0; i < n - index - 1; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		bubbleSort(arr, ++index);
	}
	public static void main(String[] args) {
		
		int[] arr = new int[] {6,39,4,2,24,245};
		bubbleSort(arr, 0);
		System.out.println(Arrays.toString(arr));
	}

}
