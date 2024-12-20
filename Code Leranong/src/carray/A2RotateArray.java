package carray;

import java.util.Arrays;

public class A2RotateArray {
	
	public static void swapElement(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	// Rotating towards left.
	public static void rotateArray(int[] arr, int rotate) {
		int n = arr.length;
		rotate = rotate % n;
		
		for(int i = 0; i < rotate/2; i++) {
			swapElement(arr, i, rotate - i - 1);
		}
		
		int size = n - rotate;
		for(int i = 0; i < size/2; i++) {
			swapElement(arr, rotate+i, n-i-1);
		}
		
		for(int i = 0; i < n/2; i++) {
			swapElement(arr, i, n-i-1);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,5,4,4,42};
		int rotateNumberOfElement = 3;
		rotateArray(arr, rotateNumberOfElement);
		System.out.println("Rotated Array" + Arrays.toString(arr));
	}

}
