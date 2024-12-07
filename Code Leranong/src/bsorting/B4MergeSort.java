package bsorting;

import java.util.Arrays;

// Try coding this by yourself
public class B4MergeSort {
	
	public static void merge(float[] arr, int left, int mid, int right) {
		int i = left;
		int j = mid+1;
		int trackLength = right - left + 1;
		float track[] = new float[trackLength];
		int index = 0;
		while(i <= mid && j <= right) {
			if(arr[i] < arr[j]) {
				track[index] = arr[i];
				i++;
			} else {
				track[index] = arr[j];
				j++;
			}
			index++;
		}
		
		while(i <= mid) {
			track[index] = arr[i];
			index++;
			i++;
		}
		
		while(j <= right) {
			track[index] = arr[j];
			index++;
			j++;
		}
		
		for(i = 0; i < trackLength; i++, left++) {
			arr[left] = track[i];
		}
	}
	
	public static void mergeSort(float[] arr, int left, int right) {
		if(left >= right) {
			return;
		}
		
		int mid = (left + right) / 2;
		mergeSort(arr, left, mid);
		mergeSort(arr, mid+1, right);
		
		merge(arr, left, mid, right);
	}
	
	public static void main(String[] args) {
		float arr[] = new float[] {3,5,6,23,62,11,23,24};
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
