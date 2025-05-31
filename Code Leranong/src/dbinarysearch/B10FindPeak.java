package dbinarysearch;

import java.util.ArrayList;
import java.util.Arrays;

public class B10FindPeak {

	public static int findPeakElement(ArrayList<Integer> arr) {
		int n = arr.size();
		
		if(n == 1) return 0;
		if(arr.get(0) > arr.get(1)) return 0;
		if(arr.get(n - 1) > arr.get(n-2)) return 0;
		
		int left = 1, right = n - 2;
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(arr.get(mid) > arr.get(mid + 1) && arr.get(mid) > arr.get(mid - 1)) {
				return mid;
			} 
			else if(arr.get(mid) > arr.get(mid - 1)) left = mid + 1;
			else right = mid - 1;
		}
		return -1;
    }
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4,5,0,1,5,4,3));
	    int ans = findPeakElement(arr);
	    System.out.println("The peak is at index: " + ans);
	}
}
