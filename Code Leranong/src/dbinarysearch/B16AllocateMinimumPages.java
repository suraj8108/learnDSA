package dbinarysearch;

import java.util.Arrays;

public class B16AllocateMinimumPages {

	// TUF Code
	public static int allocate1(int[] arr, int pages) {
		int n = arr.length; // size of array
        int students = 1;
        long pagesStudent = 0;
        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr[i] <= pages) {
                // add pages to current student
                pagesStudent += arr[i];
            } else {
                // add pages to next student
                students++;
                pagesStudent = arr[i];
            }
        }
        return students;
	}
	
	// Mine Code
	public static int allocate(int[] arr, int limit){
        
		int prevSum = 0;
		int index = 0;
		int n = arr.length;
		int result = 0;
		while(index < n) {
			prevSum += arr[index];
			if(prevSum > limit) {
				result++;
				prevSum = arr[index];				
			}
			index++;
		}
		
		if(prevSum <= limit) {
			result++;
		}
		System.out.println(result + " " + limit);
		return result;
    }
    public static int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        int left = Arrays.stream(arr).max().getAsInt();
        int right = Arrays.stream(arr).sum();
        
        if(n < k){
            return -1;
        }
        while(left <= right){
            int mid = (left + right) / 2;
            int allocations = allocate(arr, mid);
            if(allocations > k){
                left = mid + 1;
            } else {
            	right = mid - 1;
            }
        }
        return left;
    }
    
	public static void main(String[] args) {
		int[] arr = new int[] {12,34,67,90};
		int k = 2;
		System.out.println(findPages(arr, k));
	}
}
