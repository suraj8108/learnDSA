package carray;

import java.util.Arrays;

public class A3MoveZeroEnd {
	
	public static void moveZeroToLast(int [] arr) {
		int n = arr.length;
		int index = 0;
		int i = 0;
		while(index < n) {
			if(i < n) {
				if(arr[i] != 0) {
					arr[index] = arr[i];
					index++;
				}
			} else {
				arr[index] = 0;
				index++;
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{0,0,0,0,0,0};
		moveZeroToLast(arr);
		System.out.println("Moved all the element at last" + Arrays.toString(arr));
	}
}
