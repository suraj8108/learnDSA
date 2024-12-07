package bsorting;

import java.util.Arrays;

public class B3SelectionSort {
	
	public static void selectionSort(float[] arr) {
		int n = arr.length;
		
		int index = 0;
		while(index < n) {
			
			for(int i = index-1; i > 0; i--) {
				if(arr[index] < arr[i]) {
					arr[index] += arr[i];
					arr[i] = arr[index] - arr[i];
					arr[index] = arr[index] - arr[i];
				}
			}
			
			index++;
		}
		
	}
	public static void main(String[] args) {
		float[] arr = new float[] {6,39,4,2,24,245};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
