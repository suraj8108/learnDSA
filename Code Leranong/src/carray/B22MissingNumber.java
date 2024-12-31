package carray;

import java.util.Arrays;

public class B22MissingNumber {

	public static void findMissingAndRepeating(int[] arr) {
		int n = arr.length;
		
		int index = 0;
		int missing = -1;
		int repeat = -1;
		
		while(index < n) {
			if(arr[index] == index+1) {
				index++;
			} else {
				int temp1 = arr[index];
				int temp2 = arr[arr[index] - 1];
				if(temp1 == temp2) {
					index++;
				} else {
					arr[arr[index] - 1] = temp1;
					arr[index] = temp2;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			if(arr[i] != i+1) {
				missing = i+1;
				repeat = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr) + " " + repeat + " " + missing);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,1,2,5,4,6,7,5};
		findMissingAndRepeating(arr);
	}
}
