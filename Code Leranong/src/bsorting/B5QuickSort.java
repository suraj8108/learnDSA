package bsorting;

import java.util.Arrays;

public class B5QuickSort {
	
	public static void quickSort(float[] arr, int left, int right){
		if(left >= right) {
			return ;
		}
		int pivotElement = right;
		int i = left;
		int j = right - 1;
		while(i <= j) {
			if(arr[i] > arr[pivotElement]) {
				if(arr[j] <= arr[pivotElement]) {
					float temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} else {
					j--;
				}
			} else {
				i++;
			}
		}
		float temp = arr[i];
		arr[i] = arr[pivotElement];
		arr[pivotElement] = temp;
		quickSort(arr, left, i-1);
		quickSort(arr, i+1, right);
		
	}
	
	public static void main(String[] args) {
		float arr[] = new float[] {3,5,6,23,62,11,23,24};
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
