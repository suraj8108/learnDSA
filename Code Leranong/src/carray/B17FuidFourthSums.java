package carray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B17FuidFourthSums {
	
	public static void findFourthSum(int[] arr, int k) {
		int n = arr.length;
		Arrays.sort(arr);
		
//		System.out.println(Arrays.toString(arr));
		
		List<List<Integer>> result = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			// Skip the duplicates
			if(i > 0 && arr[i] == arr[i-1]) {
				continue;
			}
			// Skip the duplicates
			for(int j = i + 1; j < n; j++) {
				if(j > i + 1 && arr[j] == arr[j-1]) {
					continue;
				}
				int toFind = k - (arr[i] + arr[j]);
				int left = j + 1;
				int right = n - 1;
				while(left < right) {
					// Skip the duplicates
					if(left > j + 1 && arr[left] == arr[left - 1]){
						left++;
						continue;
					} else if (right < n - 1 && arr[right] == arr[right + 1]){
						right--;
						continue;
					}
					int sum = arr[left] + arr[right];
					if(toFind == sum) {
						result.add(List.of(arr[i], arr[j], arr[left], arr[right]));
						left++;
					} else if(sum > toFind) {
						right--;
					} else {
						left++;
					}
				}
			}
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {4,3,3,4,4,2,1,2,1,1};
		
		findFourthSum(arr, 9);
	}

}
