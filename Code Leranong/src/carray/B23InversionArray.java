package carray;

import java.util.Arrays;

public class B23InversionArray {

	public static int countInversion(int[] arr, int start, int mid, int end) {
		int i = start;
		int j = mid+1;
		int result = 0;
		while(i <= mid && j <= end) {
			if(arr[i] > arr[j]) {
				result += (mid - i +1);
				j++;
			} else {
				i++;
			}
		}
//		System.out.println(Arrays.toString(arr) + " "  + start + " "+mid +" "+end + " "  + result );
		return result;
	}
	
	public static int merge(int [] arr, int start, int mid, int end) {
		int count = countInversion(arr, start, mid, end);
		
		int left = start;
		int right = mid+1;
		
		int[] mergeElement = new int[end - start + 1];
		int index = 0;
		
		while(left <= mid && right <= end) {
			if(arr[left] < arr[right]) {
				mergeElement[index] = arr[left];
				left++;
			} else {
				mergeElement[index] = arr[right];
				right++;
			}
			index++;
		}
		
		while(left <= mid) {
			mergeElement[index] = arr[left];
			left++;
			index++;
		}
		
		while(right <= end) {
			mergeElement[index] = arr[right];
			right++;
			index++;
		}
		
		for(int i = 0; i < index; i++) {
			arr[start + i] = mergeElement[i];
		}
		
		return count;
	}
	public static int sort(int[] arr, int start, int end) {
		if(start >= end) {
			return 0;
		}
		
		int count = 0;
		int mid = (start + end) / 2;
		
		count += sort(arr, start, mid);
		count += sort(arr, mid+1, end);
		
		count += merge(arr, start, mid, end);
		
		return count;
		
	}
	public static void findMinimuInversions(int[] arr) {
		
		int n = sort(arr, 0, arr.length - 1);
		System.out.println("Total Count is " + n + " " + Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,3,2,3,1};
		findMinimuInversions(arr);
	}
}
